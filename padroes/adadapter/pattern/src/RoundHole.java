public class RoundHole {
    private final double radius;

    public RoundHole(double radius) { this.radius = radius; }

    public boolean fits(Peg peg) {
        return peg.getEffectiveRadius() <= radius;
    }
}
