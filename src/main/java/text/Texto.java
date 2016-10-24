package text;

public class Texto extends TextoContenedor {

	public Texto() {
		super();
	}

	@Override
	public void add(Componente componente) {
		if (componente.getClass().getName() == "Caracter") {
			throw new UnsupportedOperationException();
		} else {
			list.add(componente);
		}
	}

	@Override
	public String dibujar(boolean confirm) {
		String texto = "";
		for (Componente item : this.list) {
			texto += item.dibujar(confirm);
		}
		texto += "---o---\n";
		return texto;
	}

	@Override
	public void removeChar(Componente componente) {
		if (componente.getClass().getName() == "Texto" || componente.getClass().getName() == "Parrafo") {
			this.list.remove(this.list.size() - 1);
		}
	}

}
