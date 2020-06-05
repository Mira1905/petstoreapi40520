package models;

public class Pet {

//    "{\n" +
//            "  \"id\": 0,\n" +
//            "  \"category\": {\n" +
//            "    \"id\": 0,\n" +
//            "    \"name\": \"string\"\n" +
//            "  },\n" +
//            "  \"name\": \"kitty\",\n" +
//            "  \"photoUrls\": [\n" +
//            "    \"string\"\n" +
//            "  ],\n" +
//            "  \"tags\": [\n" +
//            "    {\n" +
//            "      \"id\": 0,\n" +
//            "      \"name\": \"string\"\n" +
//            "    }\n" +
//            "  ],\n" +
//            "  \"status\": \"available\"\n" +
//            "}"

    //Структура данных
    private long id;
    private Category category;
    private  String name;
    private String[] photoUrls;
    private Object[] tags;
    private String status;


    //конструктор
    public Pet(long id, String name) {
        this.category = new Category(3,"tests");
        this.id = id;
        this.name = name;
    }


    //GETTER

    public long getId() { return id; }

    public Object getCategory() { return category; }

    public String getName() { return name; }

    public String[] getPhotoUrls() { return photoUrls; }

    public Object[] getTags() { return tags; }

    public String getStatus() { return status; }



}
