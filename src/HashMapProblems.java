import java.util.*;

public class HashMapProblems {

    public void pr1(HashSet<Integer> h, Integer i) {
        h.add(i);
    }

    public void pr2(HashMap<Integer, String> h) {
        Set set = h.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println(mentry.getKey() + " : " + mentry.getValue());
        }
    }

    public int pr3(HashSet<Integer> h) {
        int nr = 0;
        for (Integer i : h) {
            nr++;
        }
        return nr;
    }

    public int pr3(HashMap<Integer, String> h) {
        int n = 0;
        Set s = h.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            n++;
            Map.Entry mentry = (Map.Entry) it.next();
        }
        return n;

    }

    public void pr4(HashSet<Integer> h) {
        h.clear();
    }

    public boolean pr5(HashSet<Integer> h) {
        if (h.isEmpty()) {
            return true;
        } else return false;
    }

    public HashSet<Integer> pr6(HashSet<Integer> h){
        HashSet<Integer> cloneSet = new HashSet<Integer>();
        cloneSet = (HashSet<Integer>) h.clone();
        return cloneSet;
    }

    public boolean pr7(HashSet<Integer> h1, HashSet<Integer> h2){
        if (h1.equals(h2)){
            return true;
        }
        else return false;
    }


}
