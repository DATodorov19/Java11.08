public class Cat extends Animal{

    String typeOfFoodToEat;
    public Cat(int age, String breed, String typeOfFoodToEat){
        super(age, breed);
        this.typeOfFoodToEat = typeOfFoodToEat;
    }

    public void test(){
        System.out.println(this.typeOfFoodToEat + " " + super.age);
    }
}
