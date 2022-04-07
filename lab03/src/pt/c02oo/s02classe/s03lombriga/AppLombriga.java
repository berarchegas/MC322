package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      for (int l = 0; l < lombrigas.length; l++) { 
		  Animacao animacao = new Animacao(lombrigas[l]); 
		  tk.gravaPasso("=====");
		  tk.gravaPasso(animacao.apresenta()); 
		  while(animacao.at < animacao.s.length()) { 
			  animacao.passo();
			  tk.gravaPasso(animacao.apresenta()); 
		  } 
	  }
      tk.stop();
   }
}
