package endpoints;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import models.storeModels.Order;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.anyOf;

public class StoreEndpoint {
    public final  static String CREATE_STORE = "/store/order";
    public final  static String GET_STORE = "/store/order/{orderId}";
    public final  static String DELETE_STORE = "/store/order/{orderId}";
    public final  static String GET_STORE_BY_STATUS = "/store/inventory";

    static {
        SerenityRest.filters(new RequestLoggingFilter(LogDetail.ALL));
        SerenityRest.filters(new ResponseLoggingFilter(LogDetail.ALL));
    }

    private RequestSpecification given(){
        return SerenityRest
                .given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType("application/json");
    }

    @Step
    public void getStore(Integer orderId){
        given()
                .get(GET_STORE , orderId)
                .then()
                .body("id", anyOf(is(orderId)))
                .statusCode(200);
    }

    @Step
    public void getStoryByStatus() {
        ValidatableResponse response =  given()
                .get(GET_STORE_BY_STATUS)
                .then()
               // .body("$", Matcher.is(hasKey("MYTEST")))
                .statusCode(200);
        Assert.assertTrue(Integer.parseInt(response.extract().path("available").toString())> 0);

    }

    @Step
    public Integer createStore(Order order) {
        ValidatableResponse response =  given()
                .body(order)
                .post(CREATE_STORE)
                .then()
                .statusCode(200);
        return response.extract().path("id");
    }

    @Step
    public void deleteStore(Integer petId) {
        given()
                .delete(StoreEndpoint.DELETE_STORE, petId)
                .then()
                .statusCode(200);

    }
}
