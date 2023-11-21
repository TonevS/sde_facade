package app;

public class MovieWatcherFacade implements Process {
    private final PopcornPopper popcornPopper;
    private final TheaterLights theaterLights;
    private final Screen screen;
    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;

    public MovieWatcherFacade() {
        popcornPopper = new PopcornPopper("Popcorn Popper");
        theaterLights = new TheaterLights("Theater Ceiling Lights");
        screen = new Screen("Theater Screen");
        amplifier = new Amplifier("Top-O-Line Amplifier");
        dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", amplifier);
        projector = new Projector("Top-O-Line Projector", dvdPlayer);
    }

    public void start() {
        popcornPopper.on();
        popcornPopper.pop();

        theaterLights.dim(4);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play("Django Unchained");
    }
    public void stop() {
        popcornPopper.off();

        theaterLights.on();

        screen.up();

        projector.off();

        amplifier.off();

        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
