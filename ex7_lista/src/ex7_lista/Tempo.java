/*
 * Classe referente ao exercicio 8
 * Essa classe calculo o tempo necess�rio para finalizar todos os processos de oscila��o,
 * o tempo necess�rio para realizar uma oscila��o � coletado do usu�rio
 */

package ex7_lista;

public class Tempo {

	int horas;
	int minutos;
	int segundos;
	


public void calculo(int oscilacoes, int tempo) {
	
	int tempo_total = oscilacoes * tempo;
	
this.horas = tempo_total / 3600;

int aux = tempo_total % 3600;
this.minutos = aux / 60;

this.segundos = aux % 60;
	
	

	}	

}