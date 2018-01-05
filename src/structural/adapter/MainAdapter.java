package structural.adapter;

public class MainAdapter {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "RHCP - Otherside.mp3");
        // trying to play video with audio player, it doesn't crash, just opens video player to play it
        audioPlayer.play("mp4", "Solomun Boiler Room DJ Set.mp4");
        audioPlayer.play("avi", "test.avi");
    }

}
