package tests;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.File;
import static io.restassured.RestAssured.given;

@RunWith(SerenityRunner.class)
public class CreatePetImageTests {

    @Test
    public void  createPetImage(){

            File testFile = new File("C:\\Users\\qa.Mira\\Pictures\\3d.jpg");

            Response response = given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .basePath("/pet/1/uploadImage")
                    .multiPart("test", testFile, "application/octet-stream")
                    .post();
        }


    }





