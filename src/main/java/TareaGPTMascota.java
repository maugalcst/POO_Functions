public class TareaGPTMascota {
    public static void main(String[] args) {

        Mascota yibo = new Mascota("Yibo", 3, "Perro", 80);
        Mascota gorda = new Mascota("Gorda", 7, "Gato", 40);

        gorda.comer(30);
        System.out.println(gorda.mostrarResultado());

        yibo.jugar(34);
        System.out.println(yibo.mostrarResultado());
    }
}

