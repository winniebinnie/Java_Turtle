public class BobRectangle implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public BobRectangle(int x, int y, String penColor) {
        this.positionX = x;
        this.positionY = y;
        this.penColor = penColor;
    }
    
    
    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.speed(2);
        
        // Rectangle
        bob.down();
        bob.forward(300);
        bob.left(90);
        bob.forward(200);
        bob.left(90);
        bob.forward(300);
        bob.left(90);
        bob.forward(200);

        bob.up();
        bob.left(180);
        bob.forward(200);
    }
}
