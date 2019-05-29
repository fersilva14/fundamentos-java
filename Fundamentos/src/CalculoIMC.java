import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double peso, altura, imc;
		System.out.println("==========");
		System.out.println("C�culo do IMC");
		System.out.println("==========");
		System.out.println("Digite o seu peso: ");
		peso = leia.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = leia.nextDouble();
		imc = peso / (altura * altura);
		System.out.println("Seu IMC �: " + formatador.format(imc));
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Acima do peso");
		} else {
			System.out.println("Obeso");
		}
		leia.close();
	}
}