package fa.training.main;

import fa.training.entities.Multimedia;
import fa.training.entities.Song;
import fa.training.entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class to manage a list of multimedia items (songs and videos).
 */
public class MultimediaManagement {
    private final List<Multimedia> listOfMultimedia; // List to store multimedia items
    private final Scanner scanner; // Scanner for user input

    /**
     * Constructor to initialize the multimedia list.
     * @param listOfMultimedia The list to store multimedia items
     */
    public MultimediaManagement(List<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Adds a multimedia item to the list.
     * @param multimedia The multimedia item to add
     * @return true if added successfully, false otherwise
     */
    public boolean addMultiMedia(Multimedia multimedia) {
        if (multimedia == null) {
            System.out.println("Invalid multimedia item!");
            return false;
        }
        listOfMultimedia.add(multimedia);
        System.out.println("Multimedia added successfully.");
        return true;
    }

    /**
     * Displays all multimedia items in the list.
     */
    public void displayMultiMedia() {
        System.out.println("\n=== List of Multimedia ===");
        if (listOfMultimedia.isEmpty()) {
            System.out.println("No multimedia items found.");
        } else {
            listOfMultimedia.forEach(System.out::println);
        }
    }

    /**
     * Runs the main menu of the application using while (true) loop.
     */
    public void run() {
        while (true) {
            System.out.println("\n=== Multimedia Management System ===");
            System.out.println("1. Add a song");
            System.out.println("2. Add a video");
            System.out.println("3. Display all multimedia");
            System.out.println("4. Exit");
            System.out.print("Please choose function (1-4): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = 0;
                System.out.println("Invalid input! Please enter a number.");
            }

            if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            switch (choice) {
                case 1:
                    Song song = new Song();
                    song.createSong();
                    addMultiMedia(song);
                    break;
                case 2:
                    Video video = new Video();
                    video.createVideo();
                    addMultiMedia(video);
                    break;
                case 3:
                    displayMultiMedia();
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }
        scanner.close();
    }

    /**
     * Main method to start the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        MultimediaManagement management = new MultimediaManagement(new ArrayList<>());
        management.run();
    }
}