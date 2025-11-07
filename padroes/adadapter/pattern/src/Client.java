public class Client {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5.0);
        Peg round = new RoundPeg(5.0);
        SquarePeg squareAdaptee = new SquarePeg(7.0);
        Peg square = new SquarePegAdapter(squareAdaptee);

        System.out.println("Round peg fits?  " + hole.fits(round));
        System.out.println("Square peg fits? " + hole.fits(square));
    }
}
