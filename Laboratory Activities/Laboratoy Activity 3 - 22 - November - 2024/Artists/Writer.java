enum WritingStyle{
    FICTION,
    NONFICTION,
    POETRY,
    DRAMA,
}
                

public class Writer extends Artist {
    private WritingStyle writing_style;

    public Writer(String name, int age, String specialty, WritingStyle writingstyle) {
        super(name, age, specialty);
        this.writing_style = writingstyle;
    }

    public WritingStyle getWritingStyle() {
        return writing_style;
    }

    public void setWritingStyle(WritingStyle writingstyle) {
        this.writing_style = writingstyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Writer Info: ");
        super.displayInfo();
        System.out.println("Writing Style: " + writing_style);
    }
}
