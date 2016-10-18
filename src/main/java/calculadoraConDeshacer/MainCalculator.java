package calculadoraConDeshacer;

public class MainCalculator {
	private CommandManager commandManager;

	public MainCalculator() {
		Calculator calculator = new Calculator();
		MementoCalculadora mc = new MementoCalculadora();
		this.commandManager = new CommandManager();
		this.commandManager.add(new AddOrder(calculator));
		this.commandManager.add(new SubstractOrder(calculator));
		this.commandManager.add(new ResetOrder(calculator));
		this.commandManager.add(new GetTotalOrder(calculator));
		this.commandManager.add(new SaveCommand(calculator));
		this.commandManager.add(new UndoCommand(calculator));
	}

	public void execute() {
		String keys[] = this.commandManager.keys();
		for (int i = 0; i < keys.length; i++) {
			this.commandManager.execute(keys[i]);
		}
	}

	public static void main(String[] args) {
		MainCalculator mc = new MainCalculator();
		mc.execute();
	}
}
