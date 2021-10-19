package ex3_lista;

public class Veiculo {
	
	 Data data_entrada;
	 Data data_saida;
	 String tipo;
	 String plaquedecem;
	 String horario_entrada;
	 String horario_saida;
	 int tempo;
	
	public Veiculo(String tipo, String placa,String entrada, String saida, int tempo) {
		
		this.tipo = tipo;
		this.plaquedecem = placa;
		this.horario_entrada = entrada;
		this.horario_saida = saida;
		this.tempo = tempo;
	
	}
	
	public void setData(int dia, int mes, int ano,int verifica) {
		Data d = new Data();
		if(verifica == 1) {
		this.data_entrada = d.data(dia, mes, ano);
		}else {
			this.data_saida = d.data(dia, mes, ano);
		}
	}
}
