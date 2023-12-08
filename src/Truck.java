
class Truck extends Vehicle {
    private int numberOfWheels;
    private int cargoCapacity;

    public Truck(int numberOfWheels, int cargoCapacity, int speed, int capacity) {
        super(speed, capacity);
        this.numberOfWheels = numberOfWheels;
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void move() {
        System.out.println("Xe tải đang di chuyển.");
    }

    @Override
    public void displayUniqueFeatures() {
        System.out.println("Số bánh xe: " + numberOfWheels);
        System.out.println("Khả năng chở hàng: " + cargoCapacity + " kg");
    }
}
