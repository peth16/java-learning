package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class hashSet_basic {

    public static void main(String[] args){

        Set<Integer> num = new HashSet<Integer>();
        for (int i=1; i<=5; i++){
            num.add(i);
        }

        num.stream().forEach(System.out::print);

        num.remove(5);
        System.out.println("\n After Performing Operation");

        num.stream().forEach(System.out::print);

        System.out.println("\nSet is also by Default Readable and Writable");

        try{
            num = Collections.unmodifiableSet(num);
            num.remove(5);
        }
        catch (UnsupportedOperationException
        unsupportedOperationException){
            System.out.println("Exceptions is" + unsupportedOperationException);
        }
        finally {
            System.out.println(num.contains(3));
            System.out.println("Now set is Read-Only");
        }

    }

}
