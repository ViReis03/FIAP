package aula26_03_condicionais;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CalculoIMC imc = new CalculoIMC(70, 1.7f);
		double massa = imc.calcularIMC();
		imc.mostrarDados(massa);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Peso: ");
		float peso = in.nextFloat();
		System.out.print("Altura: ");
		float altura = in.nextFloat();
		
		imc.setPeso(peso);
		imc.setAltura(altura);
		massa = imc.calcularIMC();
		imc.mostrarDados(massa);
		
	}
}
