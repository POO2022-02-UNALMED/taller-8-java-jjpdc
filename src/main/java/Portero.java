package futbol;

public class Portero extends Futbolista{

    public short golesRecibidos;
    public byte dorsal;


 //Getters and setters

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

//Constructor

    public Portero(String nombre, int edad,  short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + getDorsal() + ". Le han marcado " + getGolesRecibidos();
    }


//Methods

    public int compareTo(Object o){
        Portero por=(Portero) o;
        return Math.abs(this.golesRecibidos-por.golesRecibidos);
    }
    public boolean jugarConLasManos(){
        return true;
    }


}