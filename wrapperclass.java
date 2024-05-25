public class wrapperclass {
    public static void main(String args[]) {
        // Integer class

        // String to integer
        String sNum1 = "1000";
        String sNum2 = "2000";
        int iNum1 = Integer.parseInt(sNum1);
        int iNum2 = Integer.parseInt(sNum2);
        System.out.println(sNum1 + sNum2);
        System.out.println(iNum1 + iNum2);

        // Decimal to other bases
        System.out.println(iNum1 + " in binary: " + Integer.toBinaryString(iNum1));
        System.out.println(iNum1 + " in octal: " + Integer.toOctalString(iNum1));
        System.out.println(iNum1 + " in hexadecimal: " + Integer.toHexString(iNum1));

        // Decimal from other bases
        System.out.println("Binary: 1111101000" + " in decimal: " + Integer.parseInt("1111101000", 2));
        System.out.println("Octal: 1750" + " in decimal: " + Integer.parseInt("1750", 8));
        System.out.println("Hexadecimal: 3e8" + " in decimal: " + Integer.parseInt("3e8", 16));

        // Character class
        String str = "4, D.H. Road";
        char ch;
        for (int i = 0; i < str.length(); ++i) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is in uppercase");
            } else if (Character.isLowerCase(ch)) {
                System.out.println(ch + " is in lowercase");
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit");
            } else if (Character.isWhitespace(ch)) {
                System.out.println(ch + " is a whitespace");
            } else {
                System.out.println(ch + " is a special character");
            }
        }
    }
}