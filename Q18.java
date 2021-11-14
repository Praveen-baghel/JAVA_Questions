interface Playable{
    void play();
}
class Veena implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Veena.");
    }
}
class Saxophone implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Saxophone.");
    }
}
public class Q18 {
    public static void main(String[] args) {
        Veena a=new Veena();
        Saxophone b=new Saxophone();
        a.play();
        b.play();
        Playable p;
        p=a;
        p.play();
        p=b;
        p.play();
    }
}