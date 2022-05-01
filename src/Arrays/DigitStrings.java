package Arrays;
import java.util.ArrayList;
public class DigitStrings
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        String no = "2";
        digitString(no,"");
        System.out.println(list);
    }
    public static void digitString(String no,String ans)
    {
        if(no == "")
        {
            list.add(ans);
            return;
        }
        int digit =no.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit * 3; i++)
        {
            char ch = (char)('a'+ i);
            digitString(no.substring(1),ans+ch);
        }
    }
}
