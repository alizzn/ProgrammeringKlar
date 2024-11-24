package Programmering;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLogic {

    @Test
    public void FirstTest() {
        //Arrange Vilka värden ska vi testa mot, förväntat resultat
        Logic logicHandler = new Logic();
        String input = "STOP";
        boolean expected = false;

        //Act Utför kod som ska testas
        boolean actual = logicHandler.StopCommand(input);

        //Assert Kontrollera att resultat stämmer överens med kod
        assertEquals(expected, actual, "Programmet stannar inte vid stora bokstäver");
    }

    @Test
    public void SecondTest() {
        //Arrange
        Logic logicHandler = new Logic();
        String input = "stop";
        boolean expected = true;

        //Act
        boolean actual = logicHandler.StopCommand(input);

        //Assert
        assertEquals(expected, actual, "Programmet stannar när 'stop' skrivs ut");
    }

    @Test
    public void ThirdTest() {
        //Arrange
        Logic logicHandler = new Logic();
        int expectedLines = 0;
        int expectedCharacters = 0;

        //Act
        int actualLines = logicHandler.getLineCount();
        int actualCharacters = logicHandler.getCharacterCount();

        //Assert
        assertEquals(expectedLines, actualLines, "Vid start är antal rader 0");
        assertEquals(expectedCharacters, actualCharacters, "Vid start är antal tecken 0");
    }

}
