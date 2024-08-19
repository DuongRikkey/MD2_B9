package AbstractClassandInterface.EX3;

public class Test {
    public static void main(String[] args) {
        Playable ad1=new AudioPlayer();
        Playable vd1= new VideoPlayer();

        ad1.play();
        vd1.play();
    }
}
