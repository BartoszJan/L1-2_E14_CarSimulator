
public class Wheel {

        private String position;
        private boolean front;
        private int diameter;

        public Wheel(String position, boolean front, int diameter) {
            this.position = position;
            this.front = front;
            this.diameter = diameter;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public boolean isFront() {
            return front;
        }

        public void setFront(boolean front) {
            this.front = front;
        }

        public int getDiameter() {
            return diameter;
        }

        public void setDiameter(int diameter) {
            this.diameter = diameter;
        }

        @Override
        public String toString() {
            return "Wheel{" + "position='" + position + '\'' + ", front=" + front + ", diameter=" + diameter + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Wheel wheel = (Wheel) o;

            if (front != wheel.front) return false;
            if (diameter != wheel.diameter) return false;
            return position != null ? position.equals(wheel.position) : wheel.position == null;
        }

        @Override
        public int hashCode() {
            int result = position != null ? position.hashCode() : 0;
            result = 31 * result + (front ? 1 : 0);
            result = 31 * result + diameter;
            return result;
        }

        public void spinForward(Engine engine) {
            System.out.println(this.position + " " + this.front + " koło: kręcę do przodu! Aktualna prędkość: " + calculateSpeed(engine.getActuallyRPM()) +" km/h!");
        }

        public void spinBackwards() {
            System.out.println(this.position + " " + this.front + " koło: kręcę do tyłu");
        }

        public void turn(String direction) {
            System.out.println(this.position + " " + this.front + " koło: skręcam w " + direction);
        }

        public double calculateSpeed(int engineRPM) {
            double Pi = 3.14;
            double engineRPMDouble = (double) engineRPM;
            double speed;
            return speed = Pi * diameter/100000  * (engineRPMDouble*60) / 6.16;
        }
}
