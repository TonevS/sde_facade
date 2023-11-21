package app;

public class Main {

    public static void main(String[] args) {
        MovieWatcherFacade movieWatcher = new MovieWatcherFacade();
        movieWatcher.start();
        movieWatcher.stop();
        MusicListenerFacade musicListener = new MusicListenerFacade();
        musicListener.start();
        musicListener.stop();
        RadioListenerFacade radioListener = new RadioListenerFacade();
        radioListener.start();
        radioListener.stop();
    }
}
