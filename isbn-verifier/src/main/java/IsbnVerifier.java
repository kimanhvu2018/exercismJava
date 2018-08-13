class IsbnVerifier {


    public static void main(String[] args){
        isValid("3-598-21508-9"); //invalidIsbnCheckDigit
        isValid("3-598-21515-X");
        isValid("3-598-2X507-9");

    }

    static boolean isValid(String stringToVerify) {
        boolean verified = true;
        stringToVerify = stringToVerify.replaceAll("-", ""); // removes all instances of '-' if there are any
        System.out.println(String.valueOf(verified));
        char[] x = stringToVerify.toCharArray();
        int [] y = new int[10];

        System.out.println(stringToVerify);

        if (stringToVerify.length() != 10) {    // makes sure there are 10 numbers in the string
            verified = false;
            System.out.println(String.valueOf(verified));
        }

        else if (verified == true) {
            for (int i = 0; (i < 10) && verified == true; i++) {
                int a = Character.getNumericValue(x[i]);
                if (a < -1 || a > 9) {
                    verified = false;
                }

                if (i == 9 && a == 33) {
                    verified = true;
                    y[9] = 10;
                }
                System.out.println(String.valueOf(verified));

                if(a >= 0 || a <= 9) {
                    y[i] = a;
                }
            }
        }

        else if(verified == true){
            if (((y[0] * 10 + y[1] * 9 + y[2] * 8 + y[3] * 7 + y[4] * 6 + y[5] * 5 + y[6] * 4 + y[7] * 3 + y[8] * 2 + y[9]) % 11) != 0) {
                verified = false;
                System.out.println(String.valueOf(verified));
            }
        }
        System.out.println(String.valueOf(verified));
        return verified;
    }

}



