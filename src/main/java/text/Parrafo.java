package text;

public class Parrafo extends TextoContenedor{
	
	private java.util.List<Componente> list;
	
	public Parrafo()
	{
		this.list = new java.util.ArrayList<Componente>();
	}

	@Override
	public void add(Componente componente) {
		if(componente.getClass().getName()=="Parrafo" ||
				componente.getClass().getName()=="Texto")
		{
			throw new UnsupportedOperationException();
		}
		else
		{
			list.add(componente);
		}
	}

	@Override
	public String dibujar(boolean confirm) {
		if (confirm==false){
			for(Componente item : list)
			{
				
			}
			else
			{
				return Character.toString(getCaracterMayus());
			}		
		}
	}

	@Override
	public void removeChar() {
		list.remove(list.size()-1);
	}




}
