package ex5_lista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		
Scanner texto = new Scanner(System.in);	
Descobrir numero = new Descobrir();	
Tentativas t = new Tentativas();

numero.gerador();

System.out.println("N�mero aleat�rio gerado!");
System.out.println("Qual � o n�mero?");


int acerto = 0;

while(acerto != 1) {
	int chute = texto.nextInt();
	acerto = numero.verificador(chute,t);
	t.n_tentativas();
}

System.out.println("Parab�ns! Voc� acertou, � o n�mero "+numero.num);
t.getTentativas(t);

texto.close();
		}
	}


