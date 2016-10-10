package state.connection;

public class EstadoCerrado extends State{

	@Override
	public void abrir(Conexion conexion) {
		conexion.setState(new EstadoPreparado());
	
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setState(this);
		
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
	}
	
	public Estado getEstado()
	{
		return Estado.CERRADO;
	}

}
