public class Bob implements Runnable {

    private int positionX, positionY;
    private String penColor;

    public Bob(int x, int y, String penColor) {
        this.positionX = x;
        this.positionY = y;
        this.penColor = penColor;
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.speed(2);

    
    

    }
}
