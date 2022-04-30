package Arrays;

import java.util.ArrayList;

public class Permutation
{
    static ArrayList<String> list = new ArrayList<>();
    static int count;
    public static void main(String[] args)
    {
        String s = new String("sammit");
        permutation(s,"");
        System.out.println(list);
        System.out.println(count);
    }
    public static void permutation(String s,String ans)
    {
        if (s == "")
        {
            list.add(ans);
            count++;
            return;
        }
        char ch = s.charAt(0);
        for (int i = 0; i <= ans.length(); i++)
        {
            String left = ans.substring(0, i);
            String right = ans.substring(i, ans.length());
            permutation(s.substring(1),left + ch + right);
        }
    }
}
