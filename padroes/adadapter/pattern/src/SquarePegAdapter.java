public class SquarePegAdapter implements Peg {
    private final SquarePeg adaptee;

    public SquarePegAdapter(SquarePeg adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double getEffectiveRadius() {
        return (adaptee.getWidth() * Math.sqrt(2.0)) / 2.0;
    }
}
