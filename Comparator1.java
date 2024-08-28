import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1{
    public static void main(String[] args) {
        List<Integer> n=new ArrayList<>();
        Comparator<Integer> c=new Comparator<Integer>()
        {
            public int compare(Integer a,Integer b)
            {
                if(a<b)
                  return 1;
                else
                  return -1;
            }
        };
        //Comparator<Integer> c=(a,b)-> a%10>b%10?1:-1;
        n.add(24);
        n.add(18);
        n.add(15);
        n.add(36);
        n.add(12);
        Collections.sort(n,c);
        System.out.println(n);
    }
}
