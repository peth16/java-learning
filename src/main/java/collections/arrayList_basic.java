package collections;

import java.util.*;

public class arrayList_basic {
    public static void main(String[] args){
        String[] a = {"Peth", "Aravind", "Mari", "Jana"};

        List<String> a1 = new ArrayList<String>();

        Collections.addAll(a1, a);

        System.out.println(a1);
    }
}
