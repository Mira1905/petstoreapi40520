import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;




public class testInquiriesPet {

    //https://www.pvsm.ru/testirovanie-veb-servisov/274418

    @Test(description = "POST") //описание
    public void postTestPet() {
        RequestSpecification request = RestAssured.given();
        JSONObject requestBody = new JSONObject();
        requestBody.put("Name","test" ); //тело запроса
        requestBody.put("id", "3");
        request = RestAssured.given();
        request.header("Content-Type", "application/json"); //тип содержимого
        request.body(requestBody.toString());
        Response response = request.post("https://petstore.swagger.io/v2/pet"); //выполняем запрос для доступа ко всем параметрам ответа
        int statusCode = response.getStatusCode();//получить ответ
        Assert.assertEquals(statusCode, 200);//статус код
        String successCode = response.jsonPath().get("SuccessCode");
       System.out.println(response.getBody().asString());
    }


//    @Test
//    public void addNewPetToStoreTest(){
//        JPnet testPet = new JPet(null,
//                "Pet_" + RandomStringUtils.randomAlphabetic(8), //pet name
//                RandomStringUtils.randomNumeric(8), //pet id
//                null,null,
//                "available");//pet status
//
//        JPet petResponse = new JPetController
//
//
//
//
//    }

}