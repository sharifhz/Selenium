package company;

import java.util.Stack;

public class StackDemo {
    public static void main(String args[])
    {
        Stack stk = new Stack();

        stk.push("Maggiiee");
        stk.push("Coke");
        stk.push("Pepsi");
        stk.push("DairyMilk");


        System.out.println(stk);
        System.out.println("No of item's : "+stk.size());

        System.out.println("\n---------------\n");

        System.out.println(stk.pop());
        //System.out.println(stk.peek());
        System.out.println(stk);
        System.out.println("No of item's : "+stk.size());
    }
}


