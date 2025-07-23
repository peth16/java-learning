package stringBuilder_and_stringBuffer;

public class stringBuilder {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("String builder");
        System.out.println("Initial : "+ sb);

        sb.append(" is Awesome!");
        System.out.println("After Append: "+ sb);

        sb.reverse();
        System.out.println("Reversed"+ sb);

    }

}
