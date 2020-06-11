package tests;
import models.Pet;
import org.junit.Before;
import org.junit.Test;

public class DeletePetTests {
// DELETE — удаление ресурса

    private endpoints.PetEndpoint petEndpoint = new endpoints.PetEndpoint();
    private Long petId;

    @Before
    public void before(){
        Pet pet= new Pet(0,"kitty");
        petId = petEndpoint.createPet(pet);

    }


    @Test
    public void updatePet(){
        petEndpoint.deletePet(petId);

    }
}
