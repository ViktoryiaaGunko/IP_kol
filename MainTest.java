import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    private Main main;

    @BeforeEach
    public void setUp() {
        main = new Main();
    }

    @Test
    public void testGetFirstNFactorials_ValidInput() {
        List<Long> result = main.getFirstNFactorials(5);
        assertEquals(5, result.size());
        assertEquals(1L, result.get(0)); // 0! = 1
        assertEquals(1L, result.get(1)); // 1! = 1
        assertEquals(2L, result.get(2)); // 2! = 2
        assertEquals(6L, result.get(3)); // 3! = 6
        assertEquals(24L, result.get(4)); // 4! = 24
    }

    @Test
    public void testGetFirstNFactorials_ZeroInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            main.getFirstNFactorials(0);
        });
        assertEquals("Input must be a natural number (positive integer)", exception.getMessage());
    }

    @Test
    public void testGetFirstNFactorials_NegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            main.getFirstNFactorials(-5);
        });
        assertEquals("Input must be a natural number (positive integer)", exception.getMessage());
    }

    @Test
    public void testCalculateF_NegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            main.calculateF(-1);
        });
        assertEquals("n must be a non-negative integer", exception.getMessage());
    }

    @Test
    public void testCalculateF_ValidInput() {
        assertEquals(1L, main.calculateF(0)); // 0! = 1
        assertEquals(1L, main.calculateF(1)); // 1! = 1
        assertEquals(2L, main.calculateF(2)); // 2! = 2
        assertEquals(6L, main.calculateF(3)); // 3! = 6
        assertEquals(24L, main.calculateF(4)); // 4! = 24
        assertEquals(120L, main.calculateF(5)); // 5! = 120
    }
}
