package ex1_lista;
import java.util.Scanner;
import java.lang.Math;

public class ClasseScanner {

	public static void main(String[] args){
		Scanner texto = new Scanner(System.in);
		
		Tempo t = new Tempo();
		
		System.out.println("Menu: \n1-Abs\n2-Ceil\n3-Cos\n4-Exp\n5-Floor\n6-Log\n7-Max\n8-Min\n9-Pow\n10-Sqrt");
			
		System.out.println("Digite a opcao:");
		int opcao = texto.nextInt();
		
		double numero;
		double numero_1;
		
		long aux;
		aux = System.currentTimeMillis();
		t.setTempoinicial(aux);
		
		
		switch (opcao) {
		  case 1://abs
			 System.out.println("digite o numero:");
			 numero = texto.nextDouble();
				abs(numero);

		    break;
		  case 2://Ceil
			  System.out.println("digite o numero:");
			  numero = texto.nextDouble();
					ceil(numero);
		    break;
		  case 3://Cos
			  System.out.println("digite o numero:");
			   numero = texto.nextDouble();
			   		cos(numero);
		    break;
		    
		  case 4://Exp
			  System.out.println("digite o numero:");
			  numero = texto.nextDouble();
					exp(numero);
		    break;
		  case 5://Floor
			  System.out.println("Digite o numero:");
			  numero = texto.nextDouble();
					floor(numero);
		    break;
		  case 6://Log
			  System.out.println("Digite o numero:");
			  numero = texto.nextDouble();
					log(numero);
		    break;
		  case 7://Max
			  System.out.println("Digite o primeiro numero:");
			  numero = texto.nextDouble();
			  System.out.println("Digite o segundo numero:");
			  numero_1 = texto.nextDouble();
					max(numero,numero_1);
			break;
		  case 8://Min
			  System.out.println("Digite o primeiro numero:");
			  numero = texto.nextDouble();
			  System.out.println("Digite o segundo numero:");
			  numero_1 = texto.nextDouble();
					min(numero,numero_1);
			break;
		  case 9://Pow
			  System.out.println("Digite a base:");
			  numero = texto.nextDouble();
			  System.out.println("Digite o expoente:");
			  numero_1 = texto.nextDouble();
					pow(numero,numero_1);
			break;
		  case 10://Sqrt
			  System.out.println("Digite o numero:");
			  numero = texto.nextDouble();
			  
					sqrt(numero);
			break;		    
		    
		  default:
			  System.out.println("Opção invalida!");
		   break;
		}

		
	aux = System.currentTimeMillis();
	t.setTempofinal(aux);
	
	t.setTempototal().getTempototal();
	
		
		texto.close();
	}
	
	
	
	//Abs
	public static void abs(double numero){
		numero = Math.abs(numero);
		System.out.println("Valor absoluto: "+ numero);
	}
	
	//Ceil
	public static void ceil(double numero){
		numero = Math.ceil(numero);
		System.out.println("Teto: "+ numero);	

	}
	//Cos
		public static void cos(double numero){
			numero = Math.cos(numero);
			System.out.println("Cosseno: "+ numero);
		}
	//Exp
		public static void exp(double numero){
			double resultado = Math.exp(numero);
			System.out.println("e^"+ numero + " = " + resultado);
		}
	//Floor
		public static void floor(double numero){
			numero = Math.floor(numero);
			System.out.println("Piso: "+ numero);	
		}
	//Log
		public static void log(double numero){
			numero = Math.log(numero);
			System.out.println("Log: "+ numero);
				}
	//Max
		public static void max(double numero,double numero_1){
			double resultado = Math.max(numero,numero_1);
			System.out.println("Max: "+ resultado);
		}
	//Min
		public static void min(double numero,double numero_1){
			double resultado = Math.min(numero,numero_1);
			System.out.println("Min: "+ resultado);
		}
	//Pow
		public static void pow(double numero,double numero_1){
			double resultado = Math.pow(numero,numero_1);
			System.out.println(numero + "^"+ numero_1 + " = " + resultado);
		}
	//Sqrt
		public static void sqrt(double numero){
			numero = Math.sqrt(numero);
			System.out.println("Sqrt: "+ numero);
	}
}
