import java.util.Arrays;

public class WordWithVowels {

    public static void main(String[] args) {
        String str = "I am Learning Streams API in java";



        Arrays.stream(str.split(" ")).filter(s->s.replaceAll("aeiouAEIOU","").length()==2).forEach(System.out::println);
    }
}
