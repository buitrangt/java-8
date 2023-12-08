public class Main {
    public static void main(String[] args) {

        Car myCar = new Car(4, "Động cơ X", 120, 4);
        myCar.move();
        myCar.displayUniqueFeatures();


        Bicycle myBicycle = new Bicycle(2, "Bàn đạp tự do", 25, 1);
        myBicycle.move();
        myBicycle.displayUniqueFeatures();


        Truck myTruck = new Truck(6, 5000, 80, 3);
        myTruck.move();
        myTruck.displayUniqueFeatures();


        Boat myBoat = new Boat(1, 30, 10);
        myBoat.move();
        myBoat.displayUniqueFeatures();
    }
}
