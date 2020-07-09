package models;
import lombok.Builder;
import lombok.Getter;


import static models.Status.*;


@Getter
@Builder
public class Store {
    @Builder.Default
    private long id = 0;
    @Builder.Default
    private long petId = 0;
    @Builder.Default
    private long quantity = 0;
    @Builder.Default
    private Status status = PLASED;





    @Builder.Default
    private Category category = Category.builder().build();
    @Builder.Default
    private String name = "kitty";
    @Builder.Default
    private Tags[] tags = new Tags[]{Tags.builder().build()};








}
