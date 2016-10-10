package factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEs(4);
	}

}
