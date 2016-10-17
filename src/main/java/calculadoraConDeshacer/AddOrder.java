package calculadoraConDeshacer;

import java.util.Scanner;

public class AddOrder extends OrderOperations{
	
	private int valor;
	
	private Scanner sc;

	public AddOrder(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Suma";
	}

	@Override
	public void execute() {
		this.calculator.add(this.getValor());
		System.out.println("Suma realizada");
	}
	
	public int getValor()
	{
		sc = new Scanner(System.in);
		System.out.println("Ingrese el valor para la suma:");
		this.valor = sc.nextInt();
		return valor;
	}

}
