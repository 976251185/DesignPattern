package AdapterPattern;

public class AdaptPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Snuff.mp3");
        audioPlayer.play("mp4", "saint.mp4");
        audioPlayer.play("vlc", "hello.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
