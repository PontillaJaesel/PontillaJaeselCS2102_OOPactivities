enum DanceStyle {
    BALLET,
    HIPHOP,
    JAZZ,
    CONTEMPORARY
}

public class Dancer extends Artist {
    private DanceStyle dance_style;

    public Dancer(String name, String nationality, int age, String specialty, DanceStyle dancestyle) {
        super(name, nationality, age, specialty);
        this.dance_style = dancestyle;
    }

    public DanceStyle getDanceStyle() {
        return dance_style;
    }

    public void setDanceStyle(DanceStyle dancestyle) {
        this.dance_style = dancestyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dancer Info: ");
        super.displayInfo();
        System.out.println("Dancer: " + dance_style);
    }
    
}
