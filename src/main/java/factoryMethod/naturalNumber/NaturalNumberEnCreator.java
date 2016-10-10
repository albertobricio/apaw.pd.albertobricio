package factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEn(4);
	}
	
	

}
