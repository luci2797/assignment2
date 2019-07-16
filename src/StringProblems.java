public class StringProblems {

    public void printDetails(StringBuilder myString) {
        System.out.println("content: " + myString);
        System.out.println("capacity: " + myString.capacity());
        System.out.println("length: " + myString.length());
    }

    public char pr8(StringBuffer myString, int index) {
        return myString.charAt(index);
    }

    public void pr9(StringBuffer str1, StringBuffer str2) {
        if (str1.compareTo(str2) == 0) {
            System.out.println("first string = second string");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("first string < second string");
        } else {
            System.out.println("first string > second string");
        }
    }

    public void pr10(String str1, String str2) {
        if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("first string = second string");
        } else if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println("first string < second string");
        } else {
            System.out.println("first string > second string");
        }
    }

    public void pr11(StringBuffer str1, StringBuffer str2) {
        str1.append(str2);
    }

    public boolean pr12(String str1, String str2){
        if(str1.contains(str2)){
            return true;
        }
        else return false;
    }

    public boolean pr13(String str1 , StringBuffer str2){
        if(str1.equals(str2.toString())){
            return true;
        }
        else return false;
    }

    public boolean pr14(StringBuffer str1 , StringBuffer str2){
        int n = str2.length();
        int m = str1.length();
        if (m<n){
            return false;
        }
        else {
            char[] str3 = new char[n];
            str1.getChars(m-n, m, str3, 0);
            System.out.println(str3);
            String myString = new String(str3);
            if(myString.equals(str2.toString())){
                return true;
            }
        }
        return false;

    }

    public String pr16(String str){
        return str.toLowerCase();
    }

    public String pr17(String str){
        return str.toUpperCase();
    }

    public String pr18(String str){
        return str.trim();
    }

    public String[] pr19(String str, int n){
        int length = str.length();
        String[] parts = new String[n];
        int lengthOfPart = length/n;
        for(int j = 0; j < n ; j++){
            parts[j] = "";
        }
        //int count = 0;
        if(length%n!=0){
            System.out.println("string can't be divided in n equal parts");
            return parts;
        }
        else {
            for(int i = 0; i<length; i++){
                parts[i/lengthOfPart] += str.charAt(i);
            }
        }
        return parts;
    }

    public String pr20(String str){
        String result = str.replaceAll("b", "");
        result = result.replaceAll("ac", "");
        return result;
    }

    public StringBuffer pr21(StringBuffer phone){
        StringBuffer result = new StringBuffer();
        if(phone.length()!=10){
            System.out.println("phone number is not the right length");
            return result;
        }
        else {
            phone.insert(0,"(");
            phone.insert(5,")");
            phone.insert(6,"-");
            phone.insert(10,"-");

        }
        result = phone;
        return result;
    }

}
