package calculadoraConDeshacer;

public class ComandoGuardar extends OrderOperations {

	private Originador originador;
	private GestorMementos<MementoCalculadora> gestor;

	public ComandoGuardar(Calculator calculator, GestorMementos<MementoCalculadora> gestor) {
		super(calculator);
		this.originador = new Originador();
		this.gestor = gestor;
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		originador.setEstado(this.name());
		originador.setValor(calculator.getTotal());
		gestor.addMemento(this.name(), originador.createMemento());
		System.out.println(">>Guardado punto de restauracion");
	}

}
