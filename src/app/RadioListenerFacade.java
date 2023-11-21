package app;

public class RadioListenerFacade implements Process{
    private final Amplifier amplifier;
    private final Tuner tuner;
    public RadioListenerFacade() {
        amplifier = new Amplifier("Top-O-Line Amplifier");
        tuner = new Tuner("Top-O-Line AM/FM Tuner", amplifier);
    }
    public void start() {
        tuner.on();
        tuner.setFrequency(44.63);

        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(tuner);
    }
    public void stop() {
        tuner.off();
        amplifier.off();
    }
}
