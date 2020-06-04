import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreatePetTests {
//создать питомца POST — создание ресурса

    private PetEndpoint petEndpoint = new PetEndpoint();
    private Long petId;

    @Before
    public void before(){
        String body = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"Cat\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        petId = petEndpoint.createPet(body);
        System.out.println(petEndpoint.createPet(body));
    }

    @After
    public void after (){
        petEndpoint.deletePet(petId);

    }


    @Test
    public void  createPet(){



    }
}












