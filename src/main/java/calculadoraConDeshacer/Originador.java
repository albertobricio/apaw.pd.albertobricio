package calculadoraConDeshacer;

public class Originador implements CalculadoraMementable<MementoCalculadora> {
    private int id;

    private int valor;

    private String estado;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public MementoCalculadora createMemento() {
        return new MementoCalculadora(this.estado, this.valor);
    }

    @Override
    public void restoreMemento(MementoCalculadora memento) {
        this.setValor(memento.getValor());
        this.setEstado(memento.getEstado());
    }

    @Override
    public String toString() {
        return "Originador[" + id + "," + estado + "," + valor + "]";
    }

}
