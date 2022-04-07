package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
    int tam_a, tam_l, pos, dir;
    
    AquarioLombriga(int tam_a, int tam_l, int pos) {
        this.tam_a = tam_a;
        this.tam_l = tam_l;
        this.pos = pos;
        this.dir = 0;
    }
    
    void crescer() {
    	if (this.dir == 0) {
    		if (this.pos + this.tam_l <= this.tam_a)
    			this.tam_l++;
    	}
    	else {
    		if (this.pos > 1)
    			this.tam_l++;
    	}
    }

    void virar() {
        this.dir ^= 1;
    }

    void mover() {
        if (this.dir == 0 && this.pos > 1) {
            this.pos--;
        }
        else if (this.dir == 1 && this.pos < this.tam_a) {
            this.pos++;
        } 
        else virar();
    }

    String apresenta() {
        String ans = new String();
        for (int i = 1; i <= tam_a; i++) {
            if (i < pos || i >= pos + tam_l) {
                ans += "#";
            }
            else if ((i == pos && dir == 0) || (i == pos + tam_l - 1 && dir == 1)) {
                ans += "0";
            }
            else {
                ans += "@";
            }
        }
        return ans;
    }
}