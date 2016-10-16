package visitor.figure;

public abstract class Figure {
	
	protected String description;
	
	protected abstract void accept(Visitor v);
	
	public Figure(String description)
	{
		this.description=description;
	}
	
	protected String getDescription()
    {
    	return this.description;
    }

}
