package text;

public class Parrafo extends TextoContenedor {

	public Parrafo() {
		super();
	}

	@Override
	public void add(Componente componente) {
		if (componente.getClass().getName() == "Parrafo" || componente.getClass().getName() == "Texto") {
			throw new UnsupportedOperationException();
		} else {
			list.add(componente);
		}
	}

	@Override
	public String dibujar(boolean confirm) {
		String parrafo = "";
		for (Componente item : this.list) {
			parrafo += item.dibujar(confirm);
		}
		parrafo += "\n";
		return parrafo;
	}

	@Override
	public void removeChar(Componente componente) {
		if(componente.getClass().getName()=="Caracter"){
			this.list.remove(this.list.size()-1);
		}
	}

}
