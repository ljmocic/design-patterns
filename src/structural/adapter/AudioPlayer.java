package structural.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String path) {

        if(type.equalsIgnoreCase("MP3")){
            System.out.println("Playing mp3 file: " + path);
        }
        else if(type.equalsIgnoreCase("MKV") || type.equalsIgnoreCase("MP4")){
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, path);
        }
        else{
            System.out.println("Invalid media. " + type.toUpperCase() + " format is not supported.");
        }
    }
}
