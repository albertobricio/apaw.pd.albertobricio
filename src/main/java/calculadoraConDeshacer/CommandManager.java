package calculadoraConDeshacer;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Map<String, Order> comandos = new HashMap<>();

    public void add(Order order) {
        this.comandos.put(order.name(), order);
    }

    public void execute(String key) {
        this.comandos.get(key).execute();
    }

    public String[] keys() {
        return this.comandos.keySet().toArray(new String[0]);
    }
}
