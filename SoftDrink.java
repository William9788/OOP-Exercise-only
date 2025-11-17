public class SoftDrink extends Drink {
    private final boolean fizzy;

    public SoftDrink(double value, String flavour, boolean fizzy) {
        super(value, flavour);
        this.fizzy = fizzy;
    }

    public boolean isFizzy() {
        return fizzy;
    }

    @Override
    public double calcPrice() {
        double base = getValue();
        return fizzy ? base + 0.5 : base;
    }
}
