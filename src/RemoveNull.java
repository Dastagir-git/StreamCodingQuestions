import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNull {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("xyz","das","prabhas", "ram", "das","xyz", null,"");

       List<String> res=names.stream().filter(s -> s!=null&& !s.isEmpty()).toList();

       System.out.println(res);
    }
}













