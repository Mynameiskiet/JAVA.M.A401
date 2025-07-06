package fa.training.entities;

import fa.training.utils.Validator;

import java.util.Scanner;

/**
 * Class representing a song, inheriting from Multimedia.
 */
public class Song extends Multimedia {
    private String singer; // Singer of the song

    /**
     * Default constructor.
     */
    public Song() {
        super();
    }

    /**
     * Constructor to initialize name, duration, and singer.
     * @param name The name of the song
     * @param duration The duration in minutes
     * @param singer The singer of the song
     */
    public Song(String name, double duration, String singer) {
        super(name, duration);
        this.singer = singer;
    }

    // Getters and Setters
    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * Method to create a new song by inputting attributes.
     * Calls createMultimedia() from superclass and inputs singer with while (true) loop.
     */
    public void createSong() {
        super.createMultimedia();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter singer: ");
            singer = scanner.nextLine();
            if (Validator.isValidString(singer)) {
                break;
            }
            System.out.println("Singer name cannot be empty!");
        }
    }

    /**
     * Returns string representation of the song.
     * @return String containing song details
     */
    @Override
    public String toString() {
        return "Song [Name=" + getName() + ", Duration=" + getDuration() + " minutes, Singer=" + singer + "]";
    }
}