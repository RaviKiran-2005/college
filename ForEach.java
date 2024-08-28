import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
   public static void main(String[] args) {
     List<Integer> nums=Arrays.asList(5,6,8,3);
     Consumer<Integer> c=new Consumer<Integer>() {
      public void accept(Integer i)
      {
        System.out.println(i);
      }
     };
     nums.forEach(c);
   }
}
