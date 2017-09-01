package ObserwatorWzorzec.youTube;

public class YTUser implements IObserver {
    private String name;
    private int videosToWatch;

    public YTUser(String name) {
        this.name = name;
        videosToWatch = 0;
    }

    @Override
    public void update() {
        videosToWatch++;
        System.out.println("Hey " + name + "! There is a new video! You have " + videosToWatch + " videos to watch.");
    }

}
