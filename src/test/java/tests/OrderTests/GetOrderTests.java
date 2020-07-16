package tests.OrderTests;
import endpoints.StoreEndpoint;
import models.storeModels.Order;
import models.storeModels.Status;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class GetOrderTests {


    @Steps
    private StoreEndpoint storeEndpoint = new StoreEndpoint();
    private Integer orderId;

    @Before
    public void before(){
        Order order = Order.builder()
                .id(0)
                .status(Status.PLACED)
                .build();
        orderId = storeEndpoint.createStore(order);
    }

    @Test
    public void getStoryById(){
        storeEndpoint.getStore(orderId);
    }

    @After
    public void after (){
        storeEndpoint.deleteStore(orderId);

    }
}
