package tests;
import endpoints.PetEndpoint;
import models.Pet;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class CreatePetTests {
//создать питомца POST — создание ресурса

    @Steps
    private PetEndpoint petEndpoint = new PetEndpoint();
    private Long petId;



    @Test
    public void  createPet(){
        Pet pet = Pet.builder()
                    .id(0)
                    .status("available")
                    .name("kitty")
                    .build();
            petId = petEndpoint.createPet(pet);

        }


    @After
    public void after (){
        petEndpoint.deletePet(petId);

    }
}












