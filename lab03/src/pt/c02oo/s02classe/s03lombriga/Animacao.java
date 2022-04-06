public class Animacao {
    String s;
    AquarioLombriga bicho;
    int at;

    Animacao(String s) {
        this.s = s;
        this.bicho = new AquarioLombriga((s.charAt(0) - '0') * 10 + (s.charAt(1) - '0'), 
        (s.charAt(2) - '0') * 10 + (s.charAt(3) - '0'), (s.charAt(4) - '0') * 10 + (s.charAt(5) - '0'));
        this.at = 6;
    }

    String apresenta() {
        return this.bicho.apresenta();
    }

    void passo() {
        if (Character.valueOf(this.s.charAt(at)) == Character.valueOf('C')) {
            this.bicho.crescer();
        }
        else if (Character.valueOf(this.s.charAt(at)) == Character.valueOf('M')) {
            this.bicho.mover();
        }
        else {
            this.bicho.virar();
        }
        this.at++;
    }
}