package text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoContenedor extends Componente {

	protected List<Componente> list;

	protected TextoContenedor() {
		this.list = new ArrayList<Componente>();
	}

	public abstract void removeChar(Componente componente);

}
