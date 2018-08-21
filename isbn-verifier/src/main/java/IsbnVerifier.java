class IsbnVerifier {

    static boolean isValid(String stringToVerify) {
        boolean verified = true;
        int answer = 0;
        stringToVerify = stringToVerify.replaceAll("-", "").toUpperCase();
        char[] x = stringToVerify.toCharArray();
        int[] y = new int[10];

        if (stringToVerify.length() != 10) {    // makes sure there are 10 numbers in the string
            verified = false;
            System.out.println("1");
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

                if (a >= 0 && a <= 9) {
                    y[i] = a;
                    answer += a * (10 - i);

                    if(i==8 && answer % 11 == 0 && x[9] == 'X'){
                        verified = false;
                    }

                    if (i == 9) {
                        if (answer % 11 != 0){
                            verified = false;
                        }
                    }
                }
            }
        }
        System.out.println(String.valueOf(verified));
        return verified;
    }
}



