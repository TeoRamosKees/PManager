package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class User {
	private String username;
	private String password;
	private ArrayList<Cuenta> cuentas=new ArrayList<>();
	
	public User(String name, String password) {
		this.username=name;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	private String getPassword() {
		return password;
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		this.cuentas.add(cuenta);
	}
	
	public boolean login(String password) {
		return this.getPassword().equals(password);
	}
	
	public Iterator<Cuenta> getAll(){
		return cuentas.iterator();
	}
	public Iterator<Cuenta> getSocial(){
		ArrayList<Cuenta> sociales=new ArrayList<>();
		for (int i=0;i<cuentas.size();i++) {
			if (cuentas.get(i).getType().equals("Social"))
				sociales.add(cuentas.get(i));
		}
		return sociales.iterator();			
	}
	public Iterator<Cuenta> getEducation(){
		ArrayList<Cuenta> educacionales=new ArrayList<>();
		for (int i=0;i<cuentas.size();i++) {
			if (cuentas.get(i).getType().equals("Education"))
				educacionales.add(cuentas.get(i));
		}
		return educacionales.iterator();	
	}
	
	public Iterator<Cuenta> getWork(){
		ArrayList<Cuenta> trabajo=new ArrayList<>();
		for (int i=0;i<cuentas.size();i++) {
			if (cuentas.get(i).getType().equals("Work"))
				trabajo.add(cuentas.get(i));
		}
		return trabajo.iterator();	
	}
	public Iterator<Cuenta> getOther(){
		ArrayList<Cuenta> otros=new ArrayList<>();
		for (int i=0;i<cuentas.size();i++) {
			if (cuentas.get(i).getType().equals("Other"))
				otros.add(cuentas.get(i));
		}
		return otros.iterator();	
	}
	public void eliminarCuenta(Cuenta cuenta) {
		cuentas.remove(cuenta);
	}
	
}
