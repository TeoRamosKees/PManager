package modelo;

public abstract class Cuenta {
	private String loginid;
	private String password;
	private String description;
	
	public Cuenta(String loginid, String password,String description){
		this.loginid=loginid;
		this.password=password;
		this.description=description;
	}

	@Override
	public String toString() {
		return "Cuenta [loginid=" + loginid + ", password=" + password + ", description=" + description + "]";
	}
	public void mostrar(Cuenta cuenta) {
		System.out.println(cuenta.toString());
	}
	

}
