package state.connection;

public class EstadoEsperando extends State {

	@Override
	public void abrir(Conexion conexion) {
	}

	@Override
	public void cerrar(Conexion conexion) {
	}

	@Override
	public void parar(Conexion conexion) {
	}

	@Override
	public void iniciar(Conexion conexion) {
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {

		if (respuesta > 0) {
			conexion.setState(new EstadoCerrado());
		} else if (respuesta == 0) {
			conexion.setState(new EstadoPreparado());
		}
	}

	public Estado getEstado() {
		return Estado.ESPERANDO;
	}

}
