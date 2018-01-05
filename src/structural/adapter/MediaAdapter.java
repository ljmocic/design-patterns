package structural.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        if(type.equalsIgnoreCase("MKV")) {
            advancedMediaPlayer = new MKVPlayer();
        }
        else if(type.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String type, String path) {
        if(type.equalsIgnoreCase("MKV")){
            advancedMediaPlayer.playMKV(path);
        }
        else if(type.equalsIgnoreCase("MP4")){
            advancedMediaPlayer.playMP4(path);
        }
    }
}
