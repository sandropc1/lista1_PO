package ex5_lista;

import java.util.Random;

public class Descobrir {

	int num;
	
	public void gerador() {
		
		Random gerador = new Random();
		
		this.num = gerador.nextInt(11);	
			
	}
	
	public int verificador(int chute,Tentativas t) {
		if(chute > this.num) {
			t.maior();
			System.out.println("É menor!");
			return 0;
		}else {
			if(chute<this.num) {
			t.menor();
			System.out.println("É Maior!");
			return 0;
			}
		}
		return 1;
	
	}
	
	
}
