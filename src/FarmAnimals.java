import java.util.*;

public class FarmAnimals extends Animal{
    public FarmAnimals(String species, FoodType foodType, Double weight) {
        super(species, foodType, weight);
    }

    public static List<FarmAnimals> getAnimals() {
        List<FarmAnimals> pets = new ArrayList<>();
        FarmAnimals chick = new FarmAnimals("Chicken", FoodType.CROPS, 1.5);
        FarmAnimals pig = new FarmAnimals("Pig", FoodType.CROPS, 10.5);

        pets.add(chick);
        pets.add(pig);
        return  pets;
    }
}
