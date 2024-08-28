import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer>stu=new Hashtable<>();
        stu.put("Ravi", 84);
        stu.put("Chaitrika", 73);
        stu.put("Darshan", 79);
        System.out.println(stu.keySet());
        for(String s:stu.keySet())
        {
            System.out.println(s+" : "+stu.get(s));
        }
    }
}
