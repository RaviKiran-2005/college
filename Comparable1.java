import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stu implements Comparable<Stu>
{
    int age;
    String name;
    
    public Stu(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int compareTo(Stu o) {
        return this.age>o.age?1:-1;
    }


}
public class Comparable1{
    public static void main(String[] args) {
        List<Stu> n=new ArrayList<>();
        //Comparator<Integer> c=(a,b)-> a%10>b%10?1:-1;
        n.add(new Stu(24,"Ravi"));
        n.add(new Stu(18,"Sri"));
        n.add(new Stu(15,"Kiran"));
        Collections.sort(n);
        for(Stu s:n)
        {
        System.out.println(s.name+":"+s.age);
        }
    }
}

