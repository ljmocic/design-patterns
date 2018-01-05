package structural.adapter;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playMKV(String path) {

    }

    @Override
    public void playMP4(String path) {
        System.out.println("Playing MP4 file with MP4Player...");
    }
}
