import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.anyOf;

public class PetEndpoint {

    public final  static String CREATE_PET = "/pet";
    public final  static String UPDATE_PET = "/pet";
    public final  static String DELETE_PET = "/pet/{petId}";
    public final  static String GET_PET = "/pet/{petId}";


    public RequestSpecification given(){
        return RestAssured
                .given()
                .log().all()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType("application/json");
    }


    public void getPet(Long petId){
        given()
                .get(GET_PET, petId)
                .then()
                .log().all()
                .body("id", anyOf(is(petId)))
                .statusCode(200);
    }




    public Long createPet(String body) {
     ValidatableResponse response =  given()
                .body(body)
                .post(CREATE_PET)
                .then()
                .log().all()
              //  .body("name",is("cat"))//todo:unharcode penName
                .statusCode(200);
                return response.extract().path("id");

    }

    public void updatePet(String body) {
        given()
                .body(body)
                .put(UPDATE_PET)
                .then()
                .log().all()
                //  .body("name",is("cat"))//todo:unharcode penName
                .statusCode(200);;
    }


    public void deletePet(Long petId) {
        given()
                .delete(PetEndpoint.DELETE_PET, petId)
                .then()
                .log().all()
               // .body()
                .statusCode(200);


    }

    }


