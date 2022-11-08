public class Animal {

    public int age;

    private String breed;

    public Animal(int age, String breed)
    {
        this.age = age;
        this.breed = breed;
    }

    public void eat(){
        System.out.println("Eating...");
    }
}
