package modelo;

public class Cuenta {
	private String loginid;
	private String password;
	private String description;
	private String type;
	
	public Cuenta(String loginid, String password,String description,String type){
		this.loginid=loginid;
		this.password=password;
		this.description=description;
		this.type=type;
	}

	@Override
	public String toString() {
		return "\n Cuenta \n {\n loginid=" + loginid + ", \n password=" + password + ", \n description=" + description + ", \n type="
				+ type + "\n}";
	}
	public void mostrar(Cuenta cuenta) {
		System.out.println(cuenta.toString());
	}

	public String getType() {
		return type;
	}
	

}
