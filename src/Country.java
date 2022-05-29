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

}
