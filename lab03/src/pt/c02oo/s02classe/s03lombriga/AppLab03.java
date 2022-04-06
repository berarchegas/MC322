public class AppLab03 {
    public static void main(String args[]) {
        Animacao anima = new Animacao("080403MCMVM");

        for (int i = 0; i < 5; i++) {
            System.out.println(anima.apresenta());
            anima.passo();
        }
        System.out.println(anima.apresenta());
    }
}