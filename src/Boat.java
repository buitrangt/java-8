
class Boat extends Vehicle {
    private int numberOfSails;

    public Boat(int numberOfSails, int speed, int capacity) {
        super(speed, capacity);
        this.numberOfSails = numberOfSails;
    }

    @Override
    public void move() {
        System.out.println("Thuyền đang di chuyển.");
    }

    @Override
    public void displayUniqueFeatures() {
        System.out.println("Số cánh buồm: " + numberOfSails);
    }
}
