/*
 * Classe referente ao exercicio 2
 * Essa classe tem como propósito calcular e exibir o tempo de execução do programa em milisegundos
 * */

package ex1_lista;

public class Tempo {

	long tempo_inicial;
	long tempo_final;
	long tempo_execucao;
	
	public void setTempoinicial(long tempo) {
		this.tempo_inicial = tempo;
	}

	public void setTempofinal(long tempo) {
		this.tempo_final = tempo;
	}
	
	public Tempo setTempototal(){
		this.tempo_execucao = this.tempo_final - this.tempo_inicial;
		return this;
	}
	
	public Tempo getTempototal(){
		System.out.println("Tempo de execução do programa: "+this.tempo_execucao+" ms");
		return this;
	}
	
}
