package factoryMethod.naturalNumber;

public abstract class NaturalNumber {

	protected int value;

	protected NaturalNumber(int value) {
		this.value = value;
	}

	protected int getValue() {
		return value;
	}

	protected void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	protected void add(int value) {
		this.setValue(this.value + value);
	}

	public abstract String getTextValue();

}
