package tests;
import endpoints.StoreEndpoint;
import models.Pet;
import models.Status;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class GetStoreTests {


    @Steps
    private StoreEndpoint storeEndpoint = new StoreEndpoint();
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
    public void getStoryById(){
        storeEndpoint.getStore(petId);

    }

    @After
    public void after (){
        storeEndpoint.deleteStore(petId);

    }
}
