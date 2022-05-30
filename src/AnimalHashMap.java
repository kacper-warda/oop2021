import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHashMap<T extends Animal> {
    private HashMap<String, ArrayList<T>> map;

    public AnimalHashMap() {
        map = new HashMap<>();
    }

    public void add(String s, T element) {
        ArrayList<T> list = null;
        if ((list = map.get(s)) == null)
            map.put(s, list = new ArrayList<T>());
        list.add(element);
    }

    public ArrayList<T> get(String s) {
        return map.get(s);
    }
}