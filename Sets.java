import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //Set<Integer> n=new HashSet<>();Unsorted Order
        Set<Integer> n=new TreeSet<>();//Sorted Order
        n.add(65);
        n.add(84);
        n.add(15);
        n.add(25);
        n.add(10);
        Iterator <Integer> values=n.iterator();
        while(values.hasNext())
        {
            System.out.print(values.next()+" ");
        }
        // for(Integer e:n)
        // {
        //     System.out.print(e+" ");
        // }
    }
}
