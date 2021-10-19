/*
 * Classe referente ao exercicio 6
 * Essa classe tem como proposito registrar a quantidade de tentativas de usu�rio ao
 * tentar acertar o n�mero ale�torio, quantas delas foram maiores e menores que o n�mero, e por fim
 * informa-las ao usu�rio
 */
package ex5_lista;

public class Tentativas {

	int tentativas_total = 0;
	int maiores = 0;
	int menores = 0;
	
	public void n_tentativas() {
		this.tentativas_total++;
	}

	public void maior() {
		this.maiores++;
	}
	
	public void menor() {
		this.menores++;
	}
	public void getTentativas(Tentativas t) {
		System.out.println("Houveram no total "+t.tentativas_total +" tentativas.");
		System.out.println(+t.maiores +" das tentativas foram n�meros maiores que o n�mero alvo.");
		System.out.println(+t.menores +" das tentativas foram n�meros menores que o n�mero alvo.");
	}
}
