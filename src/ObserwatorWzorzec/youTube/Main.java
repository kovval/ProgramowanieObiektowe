package ObserwatorWzorzec.youTube;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        YTChannel ytChannel = new YTChannel();

        YTUser ytUser = new YTUser("Matt");
        ytChannel.register(ytUser);


        ytChannel.publishNewVideo();
        System.out.println("------------------");

        Thread.sleep(3000);

        ytChannel.unregister(ytUser);

        Thread.sleep(3000);

        ytChannel.publishNewVideo();
        System.out.println("------------------");


        YTUser ytUser2 = new YTUser("Patt");
        ytChannel.register(ytUser2);
        ytChannel.publishNewVideo();
        System.out.println("------------------");

        ytChannel.unregister(ytUser);
        ytChannel.publishNewVideo();
        System.out.println("------------------");
    }
}
