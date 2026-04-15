package mi_proyecto;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the {@link Hola} class.
 * Verifies that the main method prints the expected messages to the console.
 */
class HolaTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void mainPrintsHolaCaracola() {
        Hola.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Hola caracola"),
                "Expected output to contain 'Hola caracola' but was: " + output);
    }

    @Test
    void mainPrintsHolaGit() {
        Hola.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Hola Git"),
                "Expected output to contain 'Hola Git' but was: " + output);
    }
}
