package calculadoraConDeshacer;

public class SaveCommand implements Order, CalculadoraMementable<MementoCalculadora> {

	private MementoCalculadora calculadora;
	private String state;
	private int valor;

	public SaveCommand(MementoCalculadora calculadora) {
		this.calculadora = calculadora;
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		System.out.println("Saving to Memento.");
		this.calculadora = this.createMemento();
	}

	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(this.state, this.valor);
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
	}

}
