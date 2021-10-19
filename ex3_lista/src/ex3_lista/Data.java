/*
 * classe relativa ao ex 4.
 * O objetivo dessa classe é registrar e armazenar a data em que o veiculo entrou e
 *  saiu do estacionamento
 */
package ex3_lista;

public class Data {

private int dia;
private int mes;
private int ano;

	public Data data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		return this;
	}

}
