package calculadoraConDeshacer;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        Calculator calculator = new Calculator();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddOrder(calculator));
        this.commandManager.add(new SubstractOrder(calculator));
        this.commandManager.add(new ResetOrder(calculator));
        this.commandManager.add(new GetTotalOrder(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }
}
