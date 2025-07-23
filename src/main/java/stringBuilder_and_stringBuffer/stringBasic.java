package stringBuilder_and_stringBuffer;

public class stringBasic {

    public static void main(String[] args){

        String name = "My name is Peth Aravind";

        String remove = name.replace("a", "");
        System.out.println(remove);

        String[] splitWord = name.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (String word : splitWord){
            StringBuilder reverseWords = new StringBuilder(word);
            reverseString.append(reverseWords.reverse().toString()).append(" ");
        }
        System.out.println("Reversed String : " + reverseString.toString());

    }

}
