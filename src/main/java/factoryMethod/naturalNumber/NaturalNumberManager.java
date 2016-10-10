package factoryMethod.naturalNumber;

public class NaturalNumberManager {
	
	private NaturalNumber naturalNumber;
	
	private NaturalNumberCreator naturalNumberCreator;
	
	public void setCreator(NaturalNumberCreator naturalNumberCreator)
	{
		this.naturalNumberCreator=naturalNumberCreator;
	}
	
	public void createNaturalNumber()
	{
		this.naturalNumber=this.naturalNumberCreator.createNaturalNumber();
	}
	
	public NaturalNumber getNaturalNumber()
	{
		return naturalNumber;
	}

}
