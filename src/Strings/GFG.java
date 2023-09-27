package Strings;

class GFG {
//    public static void main (String[] args) {
//
//        String str= "Geeks", nstr="";
//        char ch;
//
//        System.out.print("Original word: ");
//        System.out.println("Geeks"); //Example word
//        System.out.println(str.length());
//        for (int i=0; i<str.length(); i++)
//        {
//            ch= str.charAt(i); //extracts each character
//            nstr= ch+nstr; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: "+ nstr);
//    }


//    ============================================================================


    public static boolean reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        System.out.println(s.length);

        while(left<=right){
            char temp = s[left];
            s[left] = s [right];
            s[right] = temp;

            left++;
            right--;
        }
        return false;
    }

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(s.length-1);
//        System.out.println(reverseString(s));
    }
}

