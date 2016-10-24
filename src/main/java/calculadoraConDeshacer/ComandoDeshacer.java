package calculadoraConDeshacer;

public class ComandoDeshacer extends OrderOperations{

	private Originador originador;
	private GestorMementos<MementoCalculadora> gestor;

	public ComandoDeshacer(Calculator calculator,GestorMementos<MementoCalculadora> gestor) {
		super(calculator);
		this.originador=new Originador();
		this.gestor=gestor;
	}

	@Override
	public String name() {
		return "Deshacer";
		}

	@Override
	public void execute() {
		originador.restoreMemento(gestor.getMemento("Guardar"));
		calculator.setTotal(originador.getValor());
		System.out.println(">>Recuperado punto de restauracion:\n");
		System.out.println("Estado Anterior: "+originador.getEstado()+"Valor: "+originador.getValor());
		
	}

}
