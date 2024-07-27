package engine.utils;

public class Time {
    public static final double CONVERT_TO_SECONDS = 1E-9;
    public static float timeEngineStarted = System.nanoTime();

    public static float getTime() {
        return (float) ((System.nanoTime() - timeEngineStarted) * CONVERT_TO_SECONDS);
    }
}
