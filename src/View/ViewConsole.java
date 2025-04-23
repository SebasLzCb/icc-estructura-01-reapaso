package View;
import Models.Persona;

public class ViewConsole {

    public void printPersonsArray(Object personas) {
        Persona[] personasArray = (Persona[]) personas;
        for (int i = 0; i < personasArray.length; i++) {
            System.out.println("Persona " + (i + 1) + ": " + personasArray[i]);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
