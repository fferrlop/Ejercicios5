package org.example;

public class DigitosHexa {
    public static int hexToDecimal(String hex, int length) {
        if (length == 0) {
            return 0;
        } else {
            char lastDigit = hex.charAt(length - 1);
            int decimalValue = Character.digit(lastDigit, 16);
            return decimalValue + 16 * hexToDecimal(hex.substring(0, length - 1), length - 1);
        }
    }
}