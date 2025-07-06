package fa.training.entities;

/**
 * Class representing a video, inheriting from Multimedia.
 */
public class Video extends Multimedia {

    /**
     * Default constructor.
     */
    public Video() {
        super();
    }

    /**
     * Constructor to initialize name and duration.
     * @param name The name of the video
     * @param duration The duration in minutes
     */
    public Video(String name, double duration) {
        super(name, duration);
    }

    /**
     * Method to create a new video by inputting attributes.
     * Calls createMultimedia() from superclass.
     */
    public void createVideo() {
        super.createMultimedia();
    }

    /**
     * Returns string representation of the video.
     * @return String containing video details
     */
    @Override
    public String toString() {
        return "Video [Name=" + getName() + ", Duration=" + getDuration() + " minutes]";
    }
}