package calculadoraConDeshacer;

public class ResetOrder extends OrderOperations{
	
	public ResetOrder(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Reset";
	}

	@Override
	public void execute() {
		this.calculator.reset();
		System.out.println("Reset done.");
	}


}
