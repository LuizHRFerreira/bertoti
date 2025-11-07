package badadapter;

public class RoundHole {
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(Object peg) {
        if (peg instanceof RoundPeg rp) {
            return rp.getRadius() <= radius;
        } else if (peg instanceof SquarePeg sp) {
            double halfDiagonal = (sp.getWidth() * Math.sqrt(2)) / 2.0;
            return halfDiagonal <= radius;
        }
        throw new IllegalArgumentException("Tipo de pino não suportado: " + peg);
    }
}
