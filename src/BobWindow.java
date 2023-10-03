public class BobWindow implements Runnable {

    private int positionX, positionY;
    private String penColor;

    public BobWindow(int x, int y, String penColor) {
        this.positionX = x;
        this.positionY = y;
        this.penColor = penColor;
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.speed(200);

        // Window
        bob.down();
        for (int i = 0; i < 4; i++) {
            bob.forward(70);
            bob.left(90);
        }

        bob.up();
        bob.forward(35);
        bob.left(90);
        bob.down();
        bob.forward(70);
        bob.left(90);
        bob.up();
        bob.forward(35);
        bob.left(90);
        bob.forward(35);
        bob.left(90);
        bob.down();
        bob.forward(70);
        bob.up();

    }
}