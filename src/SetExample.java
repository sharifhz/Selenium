
import java.util.HashSet;
import java.util.Set;
public class SetExample {
    void func()
    {
        Set st = new HashSet();

        /*st.add("Maggiiee");
        st.add("Coke");
        st.add(2000);
        st.add(5.7);
        st.add("DairyMilk");
        st.add("DairyMilk");

         */
        if(st.isEmpty())

        {
            System.out.println("set is empt");

        }
        else
        {
            System.out.println("st");
        }


        System.out.println(st);
        System.out.println("No of item's "+st.size());
    }
    public static void main(String args[])
    {
        SetExample obj = new SetExample();
        obj.func();
    }
}


