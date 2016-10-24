package factoryMethod.naturalNumber;

public class NaturalNumberMain {
	private NaturalNumberCreator[] creadores = { new NaturalNumberEnCreator(), new NaturalNumberEsCreator(),
			new NaturalNumberFrCreator() };

	public static void main(String[] args) {
		NaturalNumberMain main = new NaturalNumberMain();
		for (NaturalNumberCreator creator : main.creadores) {
			creator.createNaturalNumber();
			System.out.println(creator.createNaturalNumber().getTextValue());
		}
	}

}
