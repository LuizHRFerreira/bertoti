public class RoundPeg implements Peg {
    private final double radius;

    public RoundPeg(double radius) { this.radius = radius; }

    @Override
    public double getEffectiveRadius() { return radius; }
}
