public class TareaGPTPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona(
                "Mauricio",
                22,
                1.74);

        Persona persona2 = new Persona(
                "Mirna",
                21,
                1.60);

        System.out.println(persona1.presentarse());
        System.out.println(persona2.presentarse());

    }
}
