package structural_patterns.adapter.custom.player;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String stereoType, String fileName) {
        if(stereoType.equals("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if(stereoType.equals("mp4")){
            MediaPlayer player = new MP4PlayerAdapter();
            player.play(stereoType, fileName);
        }
    }
}
