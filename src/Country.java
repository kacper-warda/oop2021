import java.util.HashMap;

public enum Country {
    POLAND("Polish","POL",594.0),
    NORWAY("Norwegian","NOR",362.0),
    CANADA("English","CAN",1643.0),
    ITALY("Italian","IT",1860.0),
    GERMANY("German","GER", 3806.0);

    public String language;
    public String code;
    private Double GDP;

    Country(String language, String code, Double GDP) {
        this.language = language;
        this.code = code;
        this.GDP = GDP;
    }

    public Double getGDPinPLN(){
        return this.GDP = this.GDP*4;
    }

    public static HashMap <Country, Double> getMap() {
        HashMap <Country, Double> map = new HashMap<>();
        map.put(POLAND, 37.95);
        map.put(NORWAY, 5.37);
        map.put(CANADA, 38.01);
        map.put(ITALY, 59.55);
        map.put(GERMANY, 83.24);
        return map;
    }

    public static HashMap <String, Country> getCapitals() {
        HashMap <String, Country> map = new HashMap<>();
        map.put("Warsaw", POLAND);
        map.put("Oslo", NORWAY);
        map.put("Ottawa", CANADA);
        map.put("Rome", ITALY);
        map.put("Berlin", GERMANY);
        return map;
    }
}
