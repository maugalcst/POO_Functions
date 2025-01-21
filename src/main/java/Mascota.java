public class Mascota {

    // ATRIUBUTOS
    private String nombre;
    private int edad;
    private String tipo;
    private int energia;

    //CONSTRUCTOR
    public Mascota(String nombre, int edad, String tipo, int energia){
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.energia = energia;
    }

    //GETTER & SETTER
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor a 0.");
        }
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo){
        if (tipo.equalsIgnoreCase("Perro")
                || tipo.equalsIgnoreCase("Gato")
                || tipo.equalsIgnoreCase("Ave")) {
            this.tipo = tipo;
        } else {
            System.out.println("Solamente acepto perros, gatos y aves.");
        }
    }

    public int getEnergia(){
        return this.energia;
    }

    public void setEnergia(int energia){
        if (energia >= 0 && energia <= 100){
            this.energia = energia;
        }
    }

    // METODOS
    public void comer(int cantidadDeComida) {
        if (cantidadDeComida > 0) {
            this.energia += cantidadDeComida;
            if (this.energia > 100) {
                this.energia = 100;
            }
        } else {
            System.out.println("La cantidad de comida debe ser mayor a 0.");
        }
    }

    public void jugar(int tiempo) {
        if (tiempo > 0) {
            this.energia -= tiempo;
            if (this.energia < 0) {
                this.energia = 0;
            }
        } else {
            System.out.println("El tiempo de juego debe ser mayor a 0.");
        }
    }

    public String mostrarResultado(){
        return "Mi nombre es " + this.nombre + ", soy un " + this.tipo.toLowerCase()
                + ", tengo " + this.edad + " años y mi energía es " + this.energia;
    }
}
