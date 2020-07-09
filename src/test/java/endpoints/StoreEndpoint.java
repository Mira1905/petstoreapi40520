package endpoints;

import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import models.Pet;
import models.Status;
import models.Store;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.anyOf;

public class StoreEndpoint {
    public final  static String CREATE_PET = "/pet";
    public final  static String UPDATE_STORE = "/store/order";
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
    public void getStore(Long petId){
        given()
                .get(GET_STORE , petId)
                .then()
                .body("id", anyOf(is(petId)))
                .statusCode(200);
    }


    @Step
    public void getStoryByStatus(Status status) {
        given()
                .param("status",status)
                .get(GET_STORE_BY_STATUS)
                .then()
                .body("[0].status", is(status.toString())) //ToDo: verify each element in array
                .statusCode(200);
    }


    @Step
    public Long createStore(Pet pet) {
        ValidatableResponse response =  given()
                .body(pet)
                .post(CREATE_PET)
                .then()
                .body("name",is(pet.getName()))//todo:unharcode petName
                .statusCode(200);
        return response.extract().path("id");

    }

    @Step
    public void updatePet(Store pet) {
        ValidatableResponse response =  given()
                .body(pet)
                .put(UPDATE_STORE )
                .then()
                // .body("name",is(pet.getName()))//todo:unharcode petName
                .statusCode(200);
    }


    @Step
    public void deleteStore(Long petId) {
        given()
                .delete(StoreEndpoint.DELETE_STORE, petId)
                .then()
                // .body()
                .statusCode(200);


    }
}
