import java.util.Scanner;




public class CalculoMedia {

	public static void main(String[] args) {
		double nota1,nota2,media;
		System.out.println("Cálculo da média");
		//criando um objeto para entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a nota1: ");
		nota1 = leia.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2 = leia.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.print("Média: " + media);
		leia.close();
	}

}
