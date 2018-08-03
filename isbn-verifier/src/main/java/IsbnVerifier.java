class IsbnVerifier {
    boolean verified = true;

    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replaceAll("-", ""); // removes all instances of '-' if there are any

        char[] x = stringToVerify.toCharArray();
        int [] y = new int[10];

        if (stringToVerify.length() != 10) {    // makes sure there are 10 numbers in the string
            verified = false;
        }

        else if (verified == true) {
            for (int i = 0; (i < 10) && verified == true; i++) {
                int a = Character.getNumericValue(x[i]);
                if (a < 0 || a > 9 || a != 33) {
                    verified = false;
                }

                else if(a == 33) { //if x[i] == X
                    y[i] = 10;
                }

                else {
                    y[i] = a;
                }
            }
        }

        else if(verified == true){
            if (((y[0] * 10 + y[1] * 9 + y[2] * 8 + y[3] * 7 + y[4] * 6 + y[5] * 5 + y[6] * 4 + y[7] * 3 + y[8] * 2 + y[9]) % 11) != 0) {
                verified = false;
            }
        }
        return verified;
    }

}



