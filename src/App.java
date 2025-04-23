import Controllers.PersonaController;
import Models.Persona;
import View.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();

        vC.printMessage("Arreglo de personas:");
        vC.printPersonsArray(personas);

        vC.printMessage("Arreglo ordenado por inserción ascendente:");
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);

        vC.printMessage("Buscando persona con edad 40:");
        Persona personaBuscar = pC.buscarPorEdad(personas, 40);
        if (personaBuscar != null) {
            vC.printMessage("Persona encontrada: " + personaBuscar);
        } else {
            vC.printMessage("No se encontró ninguna persona con esa edad.");
        }

        vC.printMessage("Buscando persona con edad 90:");
        Persona personaBuscar2 = pC.buscarPorEdad(personas, 90);
        if (personaBuscar2 != null) {
            vC.printMessage("Persona encontrada: " + personaBuscar);
        } else {
            vC.printMessage("No se encontró ninguna persona con esa edad.");
        }
    }
}