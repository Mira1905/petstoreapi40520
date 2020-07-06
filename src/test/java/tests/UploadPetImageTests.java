package tests;
import endpoints.PetEndpoint;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.File;
import static io.restassured.RestAssured.given;

@RunWith(SerenityRunner.class)
public class UploadPetImageTests {


    @Steps
    private PetEndpoint petEndpoint = new PetEndpoint();
    private Long petId;


    @Before
    public void before(){
        Pet pet = Pet.builder()
                .name("pet1")
                .category(Category.builder()
                        .id(0)
                        .name("test")
                        .build())
                .build();
        petId = petEndpoint.createPet(pet);

    }


    @Test
    public void  uploadPetImage(){

            File testFile = new File("C:\\Users\\qa.Mira\\Pictures\\3d.jpg");

            Response response = given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .basePath("/pet/1/uploadImage")
                    .multiPart("test", testFile, "application/octet-stream")
                    .post();
        }

    @After
    public void after (){
        petEndpoint.deletePet(petId);
    }


    }





