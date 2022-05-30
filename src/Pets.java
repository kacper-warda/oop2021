import java.util.ArrayList;
import java.util.List;

public class Pets extends Animal{

    public Pets(String species, FoodType foodType,Double weight) {
        super(species, foodType, weight);

    }

    public static List<Pets> getPets() {
        List<Pets> pets = new ArrayList<>();
        Pets cat = new Pets("Cat", FoodType.MEAT, 2.5);
        Pets dog = new Pets("Dog", FoodType.MEAT, 5.5);

        pets.add(cat);
        pets.add(dog);
        return pets;
    }
}
