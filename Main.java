import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Long> F;

    public Main() {
        this.F = new ArrayList<>();
    }

    public List<Long> getFirstNFactorials(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a natural number (positive integer)");
        }

        F.clear(); // Очистка списка перед заполнением
        for (int i = 0; i < n; i++) {
            F.add(calculateF(i));
        }
        return F;
    }

    private long calculateF(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
