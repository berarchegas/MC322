package pt.c02oo.s03relacionamento.s04restaum;

public class Peca {
	int estado;
	
	public Peca(int estado) {
		this.estado = estado;
	}
	
	void inverte() {
		this.estado ^= 1;
	}
	
	boolean vivo() {
		return this.estado == 1;
	}
}
