class IsbnVerifier {


    public static void main(String[] args){
        isValid("3-598-21508-8"); //all true
        // isValid("3598215088");
       // isValid("359821507X");
      //  isValid("3-598-21507-X");
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
                if (a != 0 || a != 1 || a != 2 || a != 3 || a != 4 || a != 5 ||
                        a != 6 || a != 7 || a != 8 || a != 9 || a != 33) {
                    verified = false;
                    System.out.println(String.valueOf(verified));
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
                System.out.println(String.valueOf(verified));
            }
        }
        System.out.println(String.valueOf(verified));
        return verified;
    }

}



