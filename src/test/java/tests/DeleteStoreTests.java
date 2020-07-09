package tests;

import models.Pet;
import models.Status;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class DeleteStoreTests {


    @Steps
    private endpoints.StoreEndpoint storeEndpoint = new endpoints.StoreEndpoint();
    private Long petId;


    @Before
    public void before(){
        Pet pet = Pet.builder()
                .id(0)
                .status(Status.AVAILABLE)
                .name("kitty")
                .build();
        petId = storeEndpoint.createStore(pet);

    }


    @Test
    public void deleteStore(){
        storeEndpoint.deleteStore(petId);

    }
}
