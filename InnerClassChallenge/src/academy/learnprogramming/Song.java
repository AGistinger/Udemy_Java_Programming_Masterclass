package academy.learnprogramming;

public class Song {
    private final String title;
    private final double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public double getDuration() {
        return this.duration;
    }
}