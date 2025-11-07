package badadapter;

public class Client {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5.0);
        RoundPeg rp = new RoundPeg(5.0);
        SquarePeg sp = new SquarePeg(7.0);

        System.out.println("Round peg fits? " + hole.fits(rp));
        System.out.println("Square peg fits? " + hole.fits(sp));
    }
}
