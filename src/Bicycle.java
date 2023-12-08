
class Bicycle extends Vehicle {
    private int numberOfWheels;
    private String pedalType;

    public Bicycle(int numberOfWheels, String pedalType, int speed, int capacity) {
        super(speed, capacity);
        this.numberOfWheels = numberOfWheels;
        this.pedalType = pedalType;
    }

    @Override
    public void move() {
        System.out.println("Xe đạp đang di chuyển.");
    }
    public String toString() {
        return "\nTốc độ: " + getSpeed() + " km/h\nSức chứa: " + getCapacity();
    }

    @Override
    public void displayUniqueFeatures() {
        System.out.println("Số bánh xe: " + numberOfWheels);
        System.out.println("Loại bàn đạp: " + pedalType);
    }
}
