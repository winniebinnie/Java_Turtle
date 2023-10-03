public class BobTriangle implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public BobTriangle(int x, int y, String penColor) {
        this.positionX = x;
        this.positionY = y;
        this.penColor = penColor;
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.speed(2);

        // Triangle
        bob.down();
        bob.right(-45);
        bob.forward(214);
        bob.right(90);
        bob.forward(214);
        bob.up();

        // Roof tiles
        bob.right(45);
        bob.setPosition(-153, 50);
        bob.left(130);
        bob.forward(49);
        bob.right(40);
        bob.down();
        bob.forward(234);
        bob.left(140);
        bob.up();

        bob.forward(49);
        bob.left(40);
        bob.down();
        bob.forward(-9);
        bob.forward(175);
        bob.up();

        bob.right(140);
        bob.forward(49);
        bob.right(40);
        bob.down();
        bob.forward(-4);
        bob.forward(110);
    }
}
