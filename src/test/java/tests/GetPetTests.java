//package tests;
//import endpoints.PetEndpoint;
//import models.Pet;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//public class GetPetTests {
////получение ресурса GET — получение ресурса
//
//    private PetEndpoint petEndpoint = new PetEndpoint();
//    private Long petId;
//
//
//    @Before
//    public void before(){
//        Pet pet= new Pet(0,"kitty","available");
//        petId = petEndpoint.createPet(pet);
//
//    }
//
//    @After
//    public void after (){
//        petEndpoint.deletePet(petId);
//
//    }
//
//    @Test
//    public void getPetById(){
//        petEndpoint.getPet(petId);
//
//
//    }
//}
