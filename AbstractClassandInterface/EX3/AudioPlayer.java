package AbstractClassandInterface.EX3;

public class AudioPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Đang phát audio");
    }
}
