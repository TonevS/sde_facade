package app;

public class Main {

    public static void main(String[] args) {
        MovieWatcherFacade movieWatcher = new MovieWatcherFacade();
        System.out.println("Watching movies!");
        movieWatcher.start();
        System.out.println("Finished watching!");
        movieWatcher.stop();
        System.out.println();

        MusicListenerFacade musicListener = new MusicListenerFacade();
        System.out.println("Listening to music!");
        musicListener.start();
        System.out.println("Finished listening to music");
        musicListener.stop();
        System.out.println();

        RadioListenerFacade radioListener = new RadioListenerFacade();
        System.out.println("Listening to radio!");
        radioListener.start();
        System.out.println("Finished listening to music");
        radioListener.stop();
    }
}
