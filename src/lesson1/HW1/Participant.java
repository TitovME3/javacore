package lesson1.HW1;

public class Participant {

    private String name;
    private int runDistance;

    public Participant(String name, int runDistance){
        this.name = name;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return runDistance;
    }
}
