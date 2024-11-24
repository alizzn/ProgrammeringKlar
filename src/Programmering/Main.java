package Programmering;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic processor = new Logic();

        System.out.println("Skriv in text här(ange 'stop' för att avsluta):");

        //Loop Programmet körs tills användaren skriver "stop"
        while (true) {
            String input = scan.nextLine();

            //Kontrollera om användaren skrev "stop"
            if (processor.StopCommand(input)) {
                break;
            }

            //Skicka raden till logikklassen
            processor.addLine(input);
        }

        System.out.println("Antal rader: " + processor.getLineCount());
        System.out.println("Antal tecken: " + processor.getCharacterCount());
    }
}
