package factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber{
	
	private int value;

    private static final String[] textValue = {"zero", "un", "deux", "trois", "quatre", "cinq"};

    public NaturalNumberFr(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberFr.textValue[this.value];
        } else {
            return "???";
        }
    }

}
