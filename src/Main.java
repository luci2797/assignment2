import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        StringProblems stringProblems = new StringProblems();
        TryCatchProblems tryCatchProblems = new TryCatchProblems();
        HashMapProblems hashMapProblems = new HashMapProblems();

        StringBuffer myString = new StringBuffer();
        StringBuffer myString2 = new StringBuffer("fffffffff");
        StringBuffer myString3 = new StringBuffer("aaaaaaaaaaff");
        StringBuffer myString4 = new StringBuffer("aff");
        StringBuffer myString5 = new StringBuffer("0740123456");
        StringBuilder myStringBuilder = new StringBuilder();
        String str1 = "cccccccccc";
        String str2 = "fffffffff";
        String str3 = "AAAAA";
        String str4 = "abcdefghijkl";
        String str5 = "bacrapa dunga acdunga";
        //myStringBuilder.append("salamander man");
        myString.append("blessings");

        myString.insert(0, "Good ");

        myString.delete(1, 2);

        myString.append(" be with you");

        //myString.setLength(3);

        // System.out.println(myString);

        //stringProblems.printDetails(myStringBuilder);

        //System.out.println(stringProblems.pr8(myString, 0));

        //stringProblems.pr9(myString2, myString);

        //stringProblems.pr10(str3 , str2 );

        //System.out.println(stringProblems.pr12(str1, "cc"));

        //System.out.println(stringProblems.pr13(str2, myString2));

        //System.out.println(stringProblems.pr14(myString3, myString4));

        //System.out.println(stringProblems.pr17("aBcDeF"));

        //String[] parts = stringProblems.pr19(str4, 3);
        //System.out.println(stringProblems.pr20(str5));
        //System.out.println(stringProblems.pr21(myString5));

        //tryCatchProblems.pr1();
        /*int[] arr =  tryCatchProblems.pr3(7);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }*/

        //tryCatchProblems.waitMethod(5);

        HashSet<Integer> h = new HashSet<Integer>();

        h.add(2);
        h.add(17);
        h.add(3);
        h.add(9);
        h.add(10);

        //hashMapProblems.pr1(h,99);

        HashSet<Integer> h2 = hashMapProblems.pr6(h);
        h2.add(22);

        /*for(Integer i:h2){
            System.out.println(i);
        }*/

        System.out.println(hashMapProblems.pr7(h,h2));


        HashMap<Integer,String> hmap = new HashMap<Integer, String>();

        hmap.put(12, "blue");
        hmap.put(2, "red");
        hmap.put(7, "purple");
        hmap.put(49, "yellow");
        hmap.put(3, "Thursday");


        //hashMapProblems.pr2(hmap);
        //System.out.println(hashMapProblems.pr3(hmap));


    }
}
