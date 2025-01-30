public class Bee {
    // the bee instance variables
    private int row;
    private int col;
    // the speed and perception of a Bee cannot be changed once set so we use "final"
    private final int speed;
    private final int perception;

    // Constructor
    public Bee(int r, int c, int s, int p) {
        row = r;
        col = c;
        speed = s;
        perception = p;
    }

    // Getters to get the values of the instance variables as they have been set to "private"

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPerception() {
        return perception;
    }

    // Setters for the row and col as they can be changed the bee moves

    public void setRow(int r) {
        row = r;
    }

    public void setCol(int c) {
        col = c;
    }

    @Override
    public String toString() {
        String temp = "(row=" + row + ", column=" + col + ") with the properties ";
        temp = temp + "[speed=" + speed + ", perception=" + perception + "]";
        return temp;
    }

    public static void main(String[] args) {
        Bee bee1 = new Bee(1, 1, 1, 2);
        Bee bee2 = new Bee(3, 5, 2, 3);

        // update the bees positions
        bee1.setRow(1);
        bee1.setCol(2);
        bee2.setRow(3);
        bee2.setCol(4);

        // display the bees and their properties i.e. a call to toString()
        System.out.println(bee1);
        System.out.println(bee2);
    }
}
