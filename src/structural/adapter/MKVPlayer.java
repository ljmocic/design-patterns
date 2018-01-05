package structural.adapter;

public class MKVPlayer implements AdvancedMediaPlayer {

    @Override
    public void playMKV(String path) {
        System.out.println("Playing MKV file with MKVPlayer...");
    }

    @Override
    public void playMP4(String path) {

    }
}
