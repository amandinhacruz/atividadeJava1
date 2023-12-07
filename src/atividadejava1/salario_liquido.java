package atividadejava1;
import java.util.Scanner;

public class salario_liquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// receber valores de salario e abono
		//somar os dois valores e imprimir novo salario
		
		
		float salario;
		float abono;
		System.out.println("Qual é o valor do seu sálario? ");
		Scanner leia = new Scanner(System.in);
		salario = leia.nextFloat();
		
		System.out.println("E qual seria o valor do seu abono?");
		Scanner leia1 = new Scanner(System.in);
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.println("Seu novo salário é " + novoSalario);

	}

}
