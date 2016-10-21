package Module8;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.jar.Attributes;

public class Main {
    public static void main(String[] args) {

        AbstractDAOimpl abstractDAOimpl=new AbstractDAOimpl();
        List<String>list=new ArrayList<>();
        abstractDAOimpl.save("Name");
        abstractDAOimpl.save("Name1");

        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("alfavit",5);
        map.put("alfavit1",10);
        map.put("alfavit2",12);

        System.out.println(map.keySet());

    }
}
