//remove a from the given string
package Arrays;
public class StringCharRemove
{
    public static void main(String[] args)
    {
        String s = new String("aabbccaa");
        System.out.println(stringCharRemove(s));
    }
    public static String stringCharRemove(String s)
    {
        if(s == "")
        {
            return s;
        }
        char c = s.charAt(0);
        if(c == 'a')
        {
            return stringCharRemove(s.substring(1));
        }
        else
        {
            return c + stringCharRemove(s.substring(1));
        }
    }
}
