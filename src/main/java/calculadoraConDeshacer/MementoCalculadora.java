package calculadoraConDeshacer;

public class MementoCalculadora {

	private String estado;

	private int valor;

	public MementoCalculadora(String estado, int valor) {
		this.estado = estado;
		this.valor = valor;
	}

	public String getEstado() {
		return estado;
	}

	public int getValor() {
		return valor;
	}

}
