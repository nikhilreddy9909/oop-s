import java.util.ArrayList;
import java.util.List;

public class BoxingExample {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>();

for(int i = 0; i< 10; i++){

list.add(i);
}
System.out.println(list);

char c = 'a'; 

Character ch = c;
System.out.println(ch); }  }