import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void testExample() {
        ComputerRepairRequestTest crr = new ComputerRepairRequestTest();
        assertEquals("", crr.getOwnerName());
        assertEquals("", crr.getOwnerAddress());
    }

    @Test
    @DisplayName("Test Exemplu")
    public void testExemplu() {
        assertEquals(2, 2, "Numere ar trebui sa fie egale!");
    }

}
