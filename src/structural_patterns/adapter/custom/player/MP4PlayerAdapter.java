package structural_patterns.adapter.custom.player;

public class MP4PlayerAdapter implements MediaPlayer {

    @Override
    public void play(String stereoType, String fileName) {
        System.out.println(stereoType + " play : " + fileName);
    }
}
