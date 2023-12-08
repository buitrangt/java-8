
class Car extends Vehicle {
    private int numberOfWheels;
    private String engineType;

    public Car(int numberOfWheels, String engineType, int speed, int capacity) {
        super(speed, capacity);
        this.numberOfWheels = numberOfWheels;
        this.engineType = engineType;
    }

    @Override
    public void move() {

        System.out.println("Ô tô đang di chuyển.");

    }


    @Override
    public void displayUniqueFeatures() {
        System.out.println("Số bánh xe: " + numberOfWheels);
        System.out.println("Loại động cơ: " + engineType);
    }
}
