public class HouseTurtle {
    public static void main(String[] args) {
        Turtle bob = new Turtle();
        bob.bgcolor("navy");
        bob.penColor("bisque");
        bob.speed(2);

        // Rectangle
        bob.up();
        bob.setPosition(-150, -150);
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

        // Triangle
        bob.down();
        bob.right(50);
        bob.forward(196);
        bob.right(80);
        bob.forward(196);
        bob.up();

        // Door
        bob.setPosition(100, -150);
        bob.left(130);
        bob.down();
        bob.forward(125);
        bob.left(90);
        bob.forward(80);
        bob.left(90);
        bob.forward(125);
        bob.up();

        // Window
        bob.setPosition(-100, -25);
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
    }
}