public class Lab4Task13{
    public static int hexCharToDecimal(char hexChar) {
        if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        } else if (hexChar >= 'A' && hexChar <= 'F') {
            return hexChar - 'A' + 10;
        } else if (hexChar >= 'a' && hexChar <= 'f') {
            return hexChar - 'a' + 10;
        } else {
            return -1;
        }
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        int power = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexChar = hex.charAt(i);
            int digitValue = hexCharToDecimal(hexChar);
            decimalValue += digitValue * Math.pow(16, power);
            power++;
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        int decimalNumber = hexToDecimal(hexNumber);
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + decimalNumber);
    }
}