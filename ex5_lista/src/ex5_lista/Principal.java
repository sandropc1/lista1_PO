package ex5_lista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		
Scanner texto = new Scanner(System.in);	
Descobrir numero = new Descobrir();	
Tentativas t = new Tentativas();

numero.gerador();

System.out.println("Número aleatório gerado!");
System.out.println("Qual é o número?");


int acerto = 0;

while(acerto != 1) {
	int chute = texto.nextInt();
	acerto = numero.verificador(chute,t);
	t.n_tentativas();
}

System.out.println("Parabéns! Você acertou, é o número "+numero.num);
t.getTentativas(t);

texto.close();
		}
	}


