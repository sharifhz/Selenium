package company;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String args[])
    {
        List ls = new ArrayList();

        ls.add("Magiiee");
        ls.add("Coke");
        ls.add(2000);
        ls.add(5.7);
        ls.add("DairyMilk");
        ls.add("DairyMilk");
        System.out.println("\n-------------------\n");

        //System.out.println(ls.get(1));
        //ls.set(1,"Pepsi");
        //ls.add(2,"Chicken");

        //ls.remove("Coke");
        ls.clear();
        System.out.println(ls);
        System.out.println("No of item's : "+ls.size());

        System.out.println(ls);
        System.out.println("No of item's : "+ls.size());
    }
}



