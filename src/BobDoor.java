public class BobDoor implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public BobDoor(int x, int y, String penColor) {
        this.positionX = x;
        this.positionY = y;
        this.penColor = penColor;
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.speed(2);

        // Door
        bob.left(90);
        bob.down();
        bob.forward(125);
        bob.left(90);
        bob.forward(80);
        bob.left(90);
        bob.forward(125);
        bob.up();
    }
}
