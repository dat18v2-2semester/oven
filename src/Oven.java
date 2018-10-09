public class Oven {
    // Off
    // Heating
    // Idle
    private int state;

    public Oven(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void turnOn(){
        System.out.println("Oven is heating (1)");
        state = 1;
    }

    public void turnOff(){
        System.out.println("Oven is off (0)");
        state = 0;
    }
    public void tooCold(){
        System.out.println("Oven is heating (1)");
        state = 1;
    }

    public void tooHot(){
        System.out.println("Oven is idle (2)");
        state = 2;

    }




    @Override
    public String toString() {
        return "Oven{" +
                "state=" + state +
                '}';
    }
}
