
abstract class Vehicle implements Moveable {
    private int speed;
    private int capacity;

    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public abstract void move();

    public abstract void displayUniqueFeatures();
}
