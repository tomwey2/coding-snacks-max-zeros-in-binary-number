
public class Solution {

    /*
    The idea:
    1 0 0 1  0 0 0 1
                   ^
                   | cntZeros = 0
                   | maxZeros = 3
     */

    public int solve(final int number) {
        String binary = Integer.toBinaryString(number);

        int maxZeros = 0;
        int cntZeros = 0;
        for (int index = 0; index < binary.length(); index++) {
            char c = binary.charAt(index);
            if (c == '1') {
                maxZeros = Math.max(maxZeros, cntZeros);
                cntZeros = 0;
            } else {
                cntZeros++;
            }
        }
        return maxZeros;
    }

}

