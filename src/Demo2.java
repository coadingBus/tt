import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> languages =  Arrays.asList("java","scala","python");
        languages.forEach(x-> System.out.println(x));
        languages.forEach(System.out::println);
    }
}
