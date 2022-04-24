package modelo;

import java.util.ArrayList;

import excepciones.ContraseniaIncorrectaException;
import excepciones.UsuarioExistenteException;

public class PManager {
	private static PManager _instancia=null;
	private ArrayList<User> usuarios=new ArrayList<>();
	
	public static PManager getInstancia()
	{
		if (_instancia==null)
			_instancia= new PManager();
		
		return _instancia;
	}
	
	public void agregarUsuario(User usuario) throws UsuarioExistenteException{
	 if(this.usuarios!=null) {
			for (int i=0;i<usuarios.size();i++) {
				if (usuario.getUsername().equals(usuarios.get(i).getUsername())) 
					throw new UsuarioExistenteException("Nombre de usuario existente");				
			}
	 }
	 usuarios.add(usuario);
	}
	
	public User login(String username, String password) throws ContraseniaIncorrectaException{
			for (int i=0;i<usuarios.size();i++) {
				if (usuarios.get(i).getUsername().equals(username))
					if ( usuarios.get(i).login(password))
						return this.usuarios.get(i);
					else
						break;
			}
			throw new ContraseniaIncorrectaException("Usuario y/o contrasenia incorrectas");
}
/*	public User getUser(String username, String password) {
		User user=null;
		for (int i=0;i<usuarios.size();i++) {
		 if (usuarios.get(i).getUsername().equals(username))
			if ( usuarios.get(i).getPassword().equals(password))
				user=usuarios.get(i);
		
	}
		return user;
}*/
	private User getUserByUsername(String username) {
		
		return null;
	}
}
