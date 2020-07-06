package endpoints;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import models.Pet;
import models.Status;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.anyOf;

public class PetEndpoint {

    public final  static String CREATE_PET = "/pet";
    public final  static String UPDATE_PET = "/pet";
    public final  static String DELETE_PET = "/pet/{petId}";
    public final  static String GET_PET = "/pet/{petId}";
    public final static String GET_PET_BY_STATUS = "/pet/findByStatus";
    public final  static String CREATE_PET_IMAGE = "/pet/image";


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
// ЗАМЕТКА ДЛЯ СЕБЯ!!!!


    public String getPetName(Long petId){
        ValidatableResponse response =  given()
                .get(GET_PET, petId)
                .then()
                .body("id", anyOf(is(petId)))
                .statusCode(200);
        return response.extract().path("name");
    }



    @Step
    public void getPet(Long petId){
        given()
                .get(GET_PET, petId)
                .then()
                .body("id", anyOf(is(petId)))
                .statusCode(200);
    }



    @Step
    public void getPetByStatus(Status status){
        given()
                .param("status",status)
                .get(GET_PET_BY_STATUS)
                .then()
                .body("[0].status", is(status.toString()))//ToDo: verify each elements
                .statusCode(200);
    }



    @Step
    public Long createPet(Pet pet) {
        ValidatableResponse response =  given()
                .body(pet)
                .post(CREATE_PET)
                .then()
                .body("name",is(pet.getName()))//todo:unharcode petName
                .statusCode(200);
        return response.extract().path("id");

    }

    @Step
    public void updatePetImage(Pet pet) {
        ValidatableResponse response =  given()
                .body(pet)
                .put(UPDATE_PET)
                .then()
                // .body("name",is(pet.getName()))//todo:unharcode petName
                .statusCode(200);
    }




    @Step
    public void updatePet(Pet pet) {
        ValidatableResponse response =  given()
                .body(pet)
                .put(UPDATE_PET)
                .then()
               // .body("name",is(pet.getName()))//todo:unharcode petName
                .statusCode(200);
    }

    @Step
    public void deletePet(Long petId) {
        given()
                .delete(PetEndpoint.DELETE_PET, petId)
                .then()
               // .body()
                .statusCode(200);


    }

    }


