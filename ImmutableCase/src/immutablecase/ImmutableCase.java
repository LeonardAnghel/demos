package immutablecase;

public class ImmutableCase {

    public static void main(String[] args) {
        Bwrong bwrong = new Bwrong();
        bwrong.modify();

        Bgood bgood = new Bgood();
        bgood.modify();
    }

}
