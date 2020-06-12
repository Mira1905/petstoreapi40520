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
        Pet pet = Pet.builder()
                .id(0)
                .status("available")
                .name("kitty")
                .build();
        petId = petEndpoint.createPet(pet);

    }


    @Test
    public void updatePet(){
        petEndpoint.deletePet(petId);

    }
}
