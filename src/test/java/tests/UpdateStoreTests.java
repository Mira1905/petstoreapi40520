package tests;
import endpoints.StoreEndpoint;
import models.Category;
import models.Pet;
import models.Status;
import models.Store;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class UpdateStoreTests {


    private Long petId;

    @Steps
    private StoreEndpoint storeEndpoint;


    @Before
    public void before(){
        Store store = Store.builder()
                .name("pet1")
                .category(Category.builder()
                        .id(0)
                        .name("test")
                        .build())
                .build();
     //   petId = storeEndpoint.createStore(store);

    }

    @Test
    public void updateStore(){
        Store store = Store.builder()
                .id(petId)
                .status(Status.PLASED)
                .name("pet1")
               // .status(Status.SOLD)
                .build();
        storeEndpoint.updatePet(store);

    }



    @After
    public void after (){
        storeEndpoint.deleteStore(petId);
    }
}
