package tests.PetTests;
import models.petModels.Pet;
import models.petModels.Status;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class DeletePetTests {
// DELETE — удаление ресурса

    @Steps
    private endpoints.PetEndpoint petEndpoint = new endpoints.PetEndpoint();
    private Long petId;


    @Before
    public void before(){
        Pet pet = Pet.builder()
                .id(0)
                .status(Status.AVAILABLE)
                .name("kitty")
                .build();
        petId = petEndpoint.createPet(pet);

    }


    @Test
    public void deletePet(){
        petEndpoint.deletePet(petId);

    }
}
