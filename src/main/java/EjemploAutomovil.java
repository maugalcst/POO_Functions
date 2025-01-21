import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setCilindrada(2.0);
        
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.AMARILLO, 3.0);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("son iguales? " + (nissan == nissan2)); //false
        System.out.println("son iguales? " + (nissan.equals(nissan2))); //true
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 60));
        
    }
}
