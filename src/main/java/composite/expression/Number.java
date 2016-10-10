package composite.expression;

public class Number extends Expression{
	
	private int number;
	
	public Number(int number)
	{
		this.number=number;
	}

	@Override
	public int operar() {
		return number;
	}
	
	@Override
	public String toString() {
		return Integer.toString(number);
	}


}
