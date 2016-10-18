package calculadoraConDeshacer;

public class UndoCommand implements Order, CalculadoraMementable<MementoCalculadora> {

	private MementoCalculadora calculadora;

	private String estado;

	private int valor;

	public UndoCommand(MementoCalculadora calculadora) {
		this.calculadora = calculadora;
	}

	public int getValor() {
		return this.valor;
	}

	public String getState() {
		return this.estado;
	}

	public void setState(String estado) {
		this.estado = estado;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String name() {
		return "Deshacer";
	}

	@Override
	public void execute() {
		System.out.println("Restoring Memento...");
		this.restoreMemento(this.calculadora);
	}

	@Override
	public MementoCalculadora createMemento() {
		return null;
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		this.setState(memento.getSavedState());
		this.setValor(memento.getSavedValue());

	}

}
