package state.connection;

public abstract class Estado {
	
	 public abstract void abrir();
	 
	 public abstract void cerrar(); 
	 
	 public abstract void parar();
	 
	 public abstract void iniciar();
	 
	 public abstract void enviar(String msg);
	 
	 public abstract void recibir(int respuesta);

}
