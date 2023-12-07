package atividadejava1;

public class salario_liquido2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//somar sálario bruto + adc noturno + horas extras - descontos 
		
		float salarioBruto = 2000.00f ;
		float adcNoturno = 500.00f;
		float horasExtras = 100.00f;
		float descontos = 200.00f ;
		
		float salarioLiquido = (salarioBruto + adcNoturno + (horasExtras * 5) - descontos);
		System.out.println("Seu salário esse mês é " + salarioLiquido);

	}

}
