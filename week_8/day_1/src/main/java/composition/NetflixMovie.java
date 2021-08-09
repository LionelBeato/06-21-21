package composition;

public class NetflixMovie {

    public String title;
    public String producer;

    public NetflixMovie(String title, String producer) {
        this.title = title;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "NetflixMovie{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
