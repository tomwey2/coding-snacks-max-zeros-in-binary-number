import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void solve() {
        assertEquals(0, solution.solve(0b0));
        assertEquals(0, solution.solve(0b1));
        assertEquals(0, solution.solve(0b10));
        assertEquals(0, solution.solve(0b11));
        assertEquals(0, solution.solve(0b1000));
        assertEquals(0, solution.solve(0b1111));
        assertEquals(1, solution.solve(0b101));
        assertEquals(2, solution.solve(0b1001));
        assertEquals(2, solution.solve(0b1001_1101));
        assertEquals(2, solution.solve(0b1010_0101));
        assertEquals(5, solution.solve(0b1_0000_0101));
        assertEquals(4, solution.solve(0b1001_0001_0000_1101));
    }
}