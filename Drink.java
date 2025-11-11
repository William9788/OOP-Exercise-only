public class Drink {
    private double value;
    private String flavour;

    public Drink(double value, String flavour) {
        this.value = value;
        this.flavour = flavour;
    }
    public double getValue() {
        return value;
    }
    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String newFlavour) {
        this.flavour = newFlavour;
    }
    public double calcPrice() {
        return value;
    }
}
