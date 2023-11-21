package app;

public class MovieWatcherFacade implements Process {
    public void start() {
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");
        TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
        DvdPlayer dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", amplifier);
        Projector projector = new Projector("Top-O-Line Projector", dvdPlayer);

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

        dvdPlayer.on();;
        dvdPlayer.play("Django Unchained");
    }
    public void stop() {
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");
        TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
        DvdPlayer dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", amplifier);
        Projector projector = new Projector("Top-O-Line Projector", dvdPlayer);

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
