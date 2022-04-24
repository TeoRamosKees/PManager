package modelo;

import java.util.ArrayList;

import excepciones.ContraseniaIncorrectaException;
import excepciones.UsuarioExistenteException;
import excepciones.UsuarioInexistenteException;

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
	
	public boolean login(String username, String password) throws UsuarioInexistenteException,ContraseniaIncorrectaException{
		if (usuarios==null) {
			throw new UsuarioInexistenteException("Usuario inexistente");
		}
		else {
			for (int i=0;i<usuarios.size();i++) {
				if (usuarios.get(i).getUsername().equals(username))
					if ( usuarios.get(i).getPassword().equals(password))
						return true;
					else
						throw new ContraseniaIncorrectaException("Usuario y/o contrasenia incorrectas");
			}
		}
	return false;
	}
	public User getUser(String username, String password) {
		for (int i=0;i<usuarios.size();i++) {
		 if (usuarios.get(i).getUsername().equals(username))
			if ( usuarios.get(i).getPassword().equals(password))
				return usuarios.get(i);
		
	}
		return null;
}
}
