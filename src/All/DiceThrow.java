package All;

import java.util.ArrayList;

public class DiceThrow
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        diceThrow(6,"");
        System.out.println(list);
    }
    public static void diceThrow(int no,String ans)
    {
        if(no == 0)
        {
            list.add(ans);
            return;
        }
        for (int i = 1; i <=no; i++)
        {
            diceThrow( no - i,ans+i);
        }
    }
}
