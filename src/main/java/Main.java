
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Opel");
        car.launch();
        car.driveForward();
        car.turn("prawo");
        car.turn("lewo");
        car.driveBackwards();
        car.getEngine().speedUp();
        car.getEngine().speedUp();
        car.carSpeed();
        car.getEngine().speedUp();
        car.getEngine().speedUp();
        car.carSpeed();
        car.turnOff();
    }
}


