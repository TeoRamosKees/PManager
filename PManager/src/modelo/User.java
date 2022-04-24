package modelo;

import java.util.ArrayList;

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

	public String getPassword() {
		return password;
	}
	
	public void agregarCuenta(Social cuenta) {
		this.cuentas.add(cuenta);
	}
	
	public void mostrarSocial() {
		Social social=new Social(null,null,null);
		for (int i=0;i<cuentas.size();i++)
			if (cuentas.get(i).getClass()==social.getClass()) {
				cuentas.get(i).toString();	
				System.out.println("\n");
			}		
	}
	public void mostrarEducation() {
		Education education=new Education(null,null,null);
		for (int i=0;i<cuentas.size();i++)
			if (cuentas.get(i).getClass()==education.getClass()) {
				cuentas.get(i).toString();		
				System.out.println("\n");
			}			
	}
	public void mostrarWork() {
		Work work=new Work(null,null,null);
		for (int i=0;i<cuentas.size();i++)
			if (cuentas.get(i).getClass()==work.getClass()) {
				cuentas.get(i).toString();		
				System.out.println("\n");
			}	
	
	}
	public void mostrarOther() {
		Other other=new Other(null,null,null);
		for (int i=0;i<cuentas.size();i++)
			if (cuentas.get(i).getClass()==other.getClass()) {
				cuentas.get(i).toString();
				System.out.println("\n");
			}	
	
	}
	

	
	public void mostrarTodasCuentas() {
		System.out.println(cuentas.toArray());	
	}
	
}
