package models.petModels;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Category {

    //Структура данных
    @Builder.Default
    private long id = 0;
    @Builder.Default
    private String name = "zoo";
}
