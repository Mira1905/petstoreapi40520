package models;
import lombok.Builder;
import lombok.Getter;


    @Getter
    @Builder
    public class Pet {
        @Builder.Default
        private long id = 0;
        @Builder.Default
        private Category category = Category.builder().build();
        @Builder.Default
        private String name = "kitty";
        @Builder.Default
        private String[] photoUrls = new String[] {"https://habrastorage.org/getpro/habr/post_images/a60/848/42d/a6084842dd1354a400e1719a817f9bba.jpg"};
        @Builder.Default
        private Tags[] tags = new Tags[]{Tags.builder().build()};
        @Builder.Default
        private String status = "available";
    }