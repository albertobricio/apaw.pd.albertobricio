package state.connection;

public class EstadoPreparado extends State {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setState(this);
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setState(new EstadoCerrado());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setState(new EstadoParado());
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setState(this);
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		conexion.setState(new EstadoEsperando());
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
	}

	public Estado getEstado() {
		return Estado.PREPARADO;
	}

}
