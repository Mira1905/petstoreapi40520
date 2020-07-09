package endpoints;

import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class StoreEndpoint {
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

}
