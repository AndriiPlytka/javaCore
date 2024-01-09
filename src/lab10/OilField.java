package lab10;

// Клас, що представляє нафтове родовище
class OilField {
    private String name;
    private double oilProduction; // Видобуток нафти в тисячах барелей на день

    public OilField(String name, double oilProduction) {
        this.name = name;
        this.oilProduction = oilProduction;
    }

    public String getName() {
        return name;
    }

    public double getOilProduction() {
        return oilProduction;
    }
}