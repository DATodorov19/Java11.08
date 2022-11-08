import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(10,"Bear");
        animal.eat();

        Cat cat = new Cat(28, "Kaspiyska", "Granul1");
        cat.eat();
        Animal[] animals = {animal, cat};
        for(int i = 0; i<animals.length; i++)
        {
            animals[i].eat();
        }
    }
}
