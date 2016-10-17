package text;

public class Caracter extends Componente{
	
	private char caracter;
	
	public Caracter(char caracter)
	{
		this.caracter=caracter;
	}
	
	public char getCaracter()
	{
		return this.caracter;
	}
	
	public char getCaracterMayus()
	{
		return Character.toUpperCase(this.caracter);
	}

	@Override
	public void add(Componente componente) {	
	}

	@Override
	public String dibujar(boolean confirm) {
		if (confirm==false){
		  return Character.toString(getCaracter());
		}
		else
			return Character.toString(getCaracterMayus());	
	}
	
}
