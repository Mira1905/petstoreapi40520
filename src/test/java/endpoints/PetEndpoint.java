package endpoints;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import models.Pet;

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

    public String getPetName(Long petId){
        ValidatableResponse response =  given()
                .get(GET_PET, petId)
                .then()
                .log().all()
                .body("id", anyOf(is(petId)))
                .statusCode(200);
        return response.extract().path("name");
    }


    public Long createPet(Pet pet) {
        ValidatableResponse response =  given()
                .body(pet)
                .post(CREATE_PET)
                .then()
                .log().all()
                .body("name",is(pet.getName()))//todo:unharcode petName
                .statusCode(200);
        return response.extract().path("id");

    }

    public void updatePet(Long pet) {
        ValidatableResponse response =  given()
                .body(pet)
                .put(UPDATE_PET)
                .then()
                .log().all()
                .body("name",is("kitty"))//todo:unharcode petName
                .statusCode(200);
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


