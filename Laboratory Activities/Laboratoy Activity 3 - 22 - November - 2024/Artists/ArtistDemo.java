public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Kwon Hoshi", 28, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Bob Ross", 52, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();
        
        Writer writer = new Writer("J. K. Rowling", 59, "Writing", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();
    }
}
