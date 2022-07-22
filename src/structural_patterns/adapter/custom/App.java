package structural_patterns.adapter.custom;

import structural_patterns.adapter.custom.player.AudioPlayer;
import structural_patterns.adapter.custom.player.MediaPlayer;

public class App {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.play("mp3", "hello.mp3");
        player.play("mp4", "hello.mp4");
    }
}
