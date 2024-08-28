import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Collection1
{
    public static void main(String[] args) {
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            n.add(i);
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(n.get(i)+" ");
        }
       
    }
}