package Arrays;

import java.util.ArrayList;

public class Subsets
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        String s = "abc";
        subset(s,"");
        System.out.println(list);
    }
    public static void subset(String s,String ans)
    {
        if(s == "")
        {
            list.add(ans);
            return;
        }
        char c = s.charAt(0);
        subset(s.substring(1),ans + c);
        subset(s.substring(1),ans);
    }
}
