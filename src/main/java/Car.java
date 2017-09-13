import java.util.Arrays;

public class Car {
    private String type;
    private Wheel[] wheel = new Wheel[4];
    private Engine engine;

    public Car(String type) {
        this.type = type;
        this.engine = new Engine(0);

        wheel[0] = new Wheel("lewe", true, 45);
        wheel[1] = new Wheel("prawe", true, 45);
        wheel[2] = new Wheel("lewe", false, 45);
        wheel[3] = new Wheel("prawe", false, 45);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "type='" + type + '\'' + ", kola=" + Arrays.toString(wheel) + ", engine='" + engine + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (type != null ? !type.equals(car.type) : car.type != null) return false;
        if (!Arrays.equals(wheel, car.wheel)) return false;
        return engine != null ? engine.equals(car.engine) : car.engine == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(wheel);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    public void launch() {
        System.out.println("Samochód " + this.type + " : uruchamiam");
        this.getEngine().launchEngine(); }

    public void turnOff() {
        System.out.println("Samochód " + this.type + " : zatrzymuję");
        this.getEngine().turnOffEngine(); }

    public void driveForward() {
        System.out.println("Samochód " + this.type + " : jadę do przodu");
        this.getEngine().speedUp();

        for (Wheel wheel : this.wheel) {
            wheel.spinForward(engine);
        }
    }

    public void driveBackwards() {
        System.out.println("Samochód " + this.type + " : jadę do tyłu");
        this.getEngine().speedUp();

        for (Wheel wheel : this.wheel) {
            wheel.spinBackwards();
        }
    }

    public void turn(String direction) {
        System.out.println("Samochód " + this.type + " : skrecam " + direction);

        for (Wheel wheel : this.wheel) {
            wheel.turn(direction);
        }
    }

    public void carSpeed() {
        System.out.println("Samochód jedzie z prędkością " + wheel[1].calculateSpeed(engine.getActuallyRPM()) + " km/h");
    }
}
