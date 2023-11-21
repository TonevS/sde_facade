package app;

public class MusicListenerFacade implements Process{
    private final TheaterLights theaterLights;
    private final Amplifier amplifier;
    private final CdPlayer cdPlayer;

    public MusicListenerFacade() {
        theaterLights = new TheaterLights("Theater Ceiling Lights");
        amplifier = new Amplifier("Top-O-Line Amplifier");
        cdPlayer = new CdPlayer("Top-O-Line CD Player", amplifier);
    }

    public void start() {
        theaterLights.on();

        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setCd(cdPlayer);
        amplifier.setStereoSound();

        cdPlayer.on();
        cdPlayer.play(4);
    }
    public void stop() {
        amplifier.off();
        amplifier.setCd(cdPlayer);

        cdPlayer.eject();
        cdPlayer.off();
    }
}
