public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setCilindrada(2.0);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AMARILLO, 3.5, 50);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.AZUL);
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente" + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " +Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Tipo desc. subaru: " + tipoSubaru.getDescripcion());
    }
}
