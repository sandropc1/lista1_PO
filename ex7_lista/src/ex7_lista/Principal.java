package ex7_lista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Scanner texto = new Scanner(System.in);
	
	Pendulo p = new Pendulo();
	
	int contador = 0;
	int tempo;
	
	System.out.println("Qual o tempo (em segundos) necess�rio para realizar uma oscila��o?");
	tempo = texto.nextInt();
	
	
	while(p.a < 30 ) {
		p.pendulo();

		System.out.println("A["+ p.a +",30]  |  B["+ p.b +",30]  |  C["+ p.c + ",30]");
		contador++;
		}
	
	
	Tempo t = new Tempo();
	
	t.calculo(contador,tempo);
	System.out.println("O tempo necess�rio para realizar todas as oscila��es foi:");
	System.out.println("Horas:"+t.horas+" Minutos:"+t.minutos+" Segundos: "+t.segundos);
	
	}
}
