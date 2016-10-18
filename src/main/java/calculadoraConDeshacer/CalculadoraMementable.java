package calculadoraConDeshacer;

public interface CalculadoraMementable<T> {
	T createMemento();

	void restoreMemento(T memento);

}
