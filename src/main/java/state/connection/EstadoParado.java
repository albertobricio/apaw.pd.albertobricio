package state.connection;

public class EstadoParado extends State{

	@Override
	public void abrir(Conexion conexion) {
	}

	@Override
	public void cerrar(Conexion conexion) {
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setState(this);
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setState(new EstadoPreparado());
	}

	@Override
	public void enviar(String msg, Conexion conexion) {	
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
	}

	public Estado getEstado()
	{
		return Estado.PARADO;
	}

}
