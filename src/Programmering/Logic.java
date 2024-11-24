package Programmering;

public class Logic {
    //Håller reda på antal rader och tecken
    int lineCount = 0;
    int characterCount = 0;

    //Bearbetar raderna en efter en och lägger till efter varje
    void addLine(String line) {
        lineCount++;
        characterCount += line.length();
    }

    //Kontrollerar om inmatningen är "stop"
    boolean StopCommand(String line) {
        return line.equals("stop"); // Returnerar true om raden är "stopp"
    }

    //Hämtar antal rader
    int getLineCount() {
        return lineCount;
    }

    //Hämtar antal tecken
    int getCharacterCount() {
        return characterCount;
    }
}
