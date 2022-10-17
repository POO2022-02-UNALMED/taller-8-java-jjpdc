package futbol;

public class Jugador extends Futbolista {
    public short  golesMarcados;
    public byte dorsal;


//Getters and setters

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }


 //Constructors

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados=golesMarcados;
        this.dorsal=dorsal;
    }
    public Jugador(){
        super();
        this.golesMarcados=289;
        this.dorsal=7;
    }


 //Methods

    @Override
    public int compareTo(Object o){
        Jugador ju=(Jugador) o;
        return Math.abs(this.getEdad()-ju.getEdad());
    }
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + getDorsal() + ". Ha marcado " + getGolesMarcados();
    }
    public boolean jugarConLasManos() {
        return false;
    }


}