package calculadoraConDeshacer;

public class MementoCalculadora {

	private String stateToSave;

	private int valor;

	public MementoCalculadora(String stateToSave, int valor) {
		this.stateToSave = stateToSave;
		this.valor = valor;
	}

	public String getSavedState() {
		return this.stateToSave;
	}

	public void setStateToSave(String stateToSave) {
		this.stateToSave = stateToSave;
	}

	public int getSavedValue() {
		return this.valor;
	}

	public void setValueToSave(int valor) {
		this.valor = valor;
	}

}
