import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.OperatingSystem;
import com.company.devices.Phone;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //task 2
        System.out.println("-------Task 2-------");
        Animal dog = new Animal("dog", FoodType.ALL,10.0);
        dog.feed(8.0,FoodType.ALL);


        //task 3
        System.out.println("-------Task 3-------");
        System.out.println(Country.POLAND.getGDPinPLN()+ "M");

        // task 4
        System.out.println("-------Task 4-------");
        Map<Country, Double> countryMap = Country.getMap();

        Double maxValue = Collections.max(countryMap.values());
        for (Map.Entry<Country, Double> entry : countryMap.entrySet()) {
            if (entry.getValue()==maxValue) {
                System.out.println("Largest: "+entry.getKey());
            }
        }
        Double minValue = Collections.min(countryMap.values());
        for (Map.Entry<Country, Double> entry : countryMap.entrySet()) {
            if (entry.getValue()==minValue) {
                System.out.println("Smallest: "+entry.getKey());
            }
        }


        //task 5
        System.out.println("-------Task 5-------");
        Map<String,Country> mapCountries = Country.getCapitals();
        System.out.println("Not sorted: "+ mapCountries.keySet());

        Map<String,Country> sortedMap = new TreeMap<>(mapCountries);
        System.out.println("Sorted: "+sortedMap.keySet());

        //task 6

        Animal myDog = new Pets("dog", FoodType.MEAT, 9.5);
        Animal myCat = new Pets("cat", FoodType.MEAT, 5.5);
        Animal nik = new Human(2000.0);
        Animal bella = new Human(2000.0);
        Animal cow = new FarmAnimals("cow", FoodType.CROPS, 115.6);
        Animal lamb = new FarmAnimals("lamb", FoodType.CROPS, 60.7);

        List<Animal> petsList = new ArrayList<>();
        petsList.add(myDog);
        petsList.add(myCat);

        List<Animal> humanList = new ArrayList<>();
        humanList.add(nik);
        humanList.add(bella);

        List<Animal> farmAnimalList = new ArrayList<>();
        farmAnimalList.add(cow);
        farmAnimalList.add(lamb);

        Map<FoodType, List<Animal>> animalMap = new HashMap<>();
        animalMap.put(FoodType.MEAT, petsList);
        animalMap.put(FoodType.ALL, humanList);
        animalMap.put(FoodType.CROPS, farmAnimalList);

        System.out.println(animalMap.get(FoodType.CROPS));
        System.out.println(animalMap.get(FoodType.ALL));
        System.out.println(animalMap.get(FoodType.MEAT));

        // task 7
        System.out.println("**************Task7*************");
        Car ferrari = new Car("Ferrari", "458");
        ferrari.startACar();

        //task 8, 11: combined in a single task

        System.out.println("-------Task 8 and Task 11-------");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Pets("dog",FoodType.ALL,10.0));
        animals.add(new Human(2000.0));
        animals.add(new FarmAnimals("pig",FoodType.ALL,30.0));
        animals.add(new FarmAnimals("chicken",FoodType.CROPS,4.0));
        animals.add(new Pets("cat",FoodType.ALL,2.0));
        animals.add(new Animal("lion",FoodType.MEAT,40.0));



        animals.sort((animal1, animal2)-> animal2.weight.compareTo(animal1.weight));

        for(int i=0;i < animals.size(); i++){
            System.out.println(animals.get(i).species+" "+animals.get(i).weight);
        }

    }
}

