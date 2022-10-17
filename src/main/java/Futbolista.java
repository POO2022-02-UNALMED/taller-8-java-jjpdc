package futbol;

public abstract class Futbolista implements Comparable<Object> {

	private String nombre;
	private int edad;
	private final String posicion;

	public Futbolista(String nombre, int edad, String posicion) {   //Constructor
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	//Getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}


	public Futbolista() {
		this("Maradona", 30, "delantero");
	}

	//constructor

	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion();
	}


	//Methods


	public boolean equals(Futbolista f) {
		if(f != this) {return false;}
		return true;
	}


	public abstract boolean jugarConLasManos();


}