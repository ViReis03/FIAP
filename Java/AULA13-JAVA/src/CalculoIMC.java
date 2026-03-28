package aula26_03_condicionais;

public class CalculoIMC {
	private float peso;
	private float altura;
	
	public CalculoIMC(float peso, float altura) {
		System.out.println("*-* Calculo IMC *-*");
		this.peso = peso;
		this.altura = altura;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public double calcularIMC() {
		double massa = peso / (altura*altura);
		return massa;
	}
	
	public void mostrarDados(double massa) {
		System.out.printf("Massa: %.2f\n", massa);
		
		if(massa < 18.5) {
			System.out.println("Abaixo do peso!");
		} else if(massa >= 18.5 && massa < 25) {
			System.out.println("Peso normal!");
		} else if(massa >= 25 && massa < 30) {
			System.out.println("Sobrepeso!");
		} else if(massa >= 30 && massa < 35) {
			System.out.println("Obesidade - Grau I!");
		} else if(massa >= 35 && massa < 40) {
			System.out.println("Obesidade - Grau II!");
		} else {
			System.out.println("Obesidade Grau Morte!");
		}
	}
}
