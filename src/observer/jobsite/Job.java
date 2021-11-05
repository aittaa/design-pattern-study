package observer.jobsite;

public class Job {
    private final String title;
    private final String location;
    private final String description;
    private final int numOfRecruit;

    public Job(String title, String location, String description, int numOfRecruit) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.numOfRecruit = numOfRecruit;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public int getNumOfRecruit() {
        return numOfRecruit;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n제목 : ").append(title);
        sb.append("\n내용 : ").append(description);
        sb.append("\n위치 : ").append(location);
        sb.append("\n인원 : ").append(numOfRecruit);
        sb.append("\n\n");
        return sb.toString();
    }
}
