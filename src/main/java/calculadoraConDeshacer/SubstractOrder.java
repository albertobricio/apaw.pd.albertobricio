package calculadoraConDeshacer;

import java.util.Scanner;

public class SubstractOrder extends OrderOperations{

	private Scanner sc;

	public SubstractOrder(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Resta";
	}

	@Override
	public void execute() {
		this.calculator.subtract(this.getValor());
		System.out.println("Resta realizada");
	}
	
	public int getValor()
	{
			sc = new Scanner(System.in);
			System.out.println("Ingrese el valor para la resta:");
			int valor = sc.nextInt();
			return valor;
	}

}
