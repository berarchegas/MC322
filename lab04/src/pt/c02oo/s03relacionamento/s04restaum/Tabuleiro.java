package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	Peca tab[][] = new Peca[7][7];
	
	public Tabuleiro() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if ((i > 1 && i < 5) || (j > 1 && j < 5))
					tab[i][j] = new Peca(1);
				else
					tab[i][j] = new Peca(0);
			}
		}
		tab[3][3].inverte();
	}
	
	char[][] imprime() {
		char matriz[][] = new char[7][7];
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				matriz[i][j] = '-';
				if (this.tab[i][j].vivo()) 
					matriz[i][j] = 'P';
			}
		}
		
		return matriz;
	}
	
	void mover(String s) {
		
		// Mover a peca da posição (x1, y1) para (x3, y3)
		// Comendo a peca de (x2, y2)
		int y1 = s.charAt(0) - 'a';
		int x1 = s.charAt(1) - '1';
		int y3 = s.charAt(3) - 'a';
		int x3 = s.charAt(4) - '1';
		int y2 = (y1 + y3) / 2;
		int x2 = (x1 + x3) / 2;
		
		// Checar se o movimento eh valido
		if (this.tab[x1][y1].vivo() && this.tab[x2][y2].vivo() 
				&& !this.tab[x3][y3].vivo()) {
			this.tab[x1][y1].inverte();
			this.tab[x2][y2].inverte();
			this.tab[x3][y3].inverte();
		}
		else {
			System.out.println("Movimento invalido");
		}
	}
}
