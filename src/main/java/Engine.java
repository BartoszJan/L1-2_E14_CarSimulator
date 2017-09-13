
public class Engine {
    private final int maxRPM = 5000;
    private int actuallyRPM;

    public int getMaxRPM() {
        return maxRPM;
    }

    public int getActuallyRPM() {
        return actuallyRPM;
    }

    public void setActuallyRPM(int actuallyRPM) {
        this.actuallyRPM = actuallyRPM;
    }

    public Engine(int actuallyRPM) {
        this.actuallyRPM = actuallyRPM;
    }

    @Override
    public String toString() {
        return "Engine{" + "maxRPM=" + maxRPM + ", actuallyRPM=" + actuallyRPM + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (maxRPM != engine.maxRPM) return false;
        return actuallyRPM == engine.actuallyRPM;
    }

    @Override
    public int hashCode() {
        int result = maxRPM;
        result = 31 * result + actuallyRPM;
        return result;
    }

    public void launchEngine() {
        System.out.println("Silnik: uruchamiam");
        actuallyRPM = 1000;
    }

    public void turnOffEngine() {
        System.out.println("Silnik: zatrzymuję");
        actuallyRPM = 1000;
    }

    public void speedUp() {
        actuallyRPM += 500;
        System.out.println("Silnik: dodaję gazu! Aktualne obroty : " + actuallyRPM);
        if (actuallyRPM > maxRPM)
            System.out.println("Za bardzo gazujesz!! Zaraz wybuchnę!!!");
    }
}
