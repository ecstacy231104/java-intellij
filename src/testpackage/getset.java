import java.util.*;
public class getset
{
    private int num;
    public void setnumber(int number)
    {
        num=number;
    }
    public int getnumber()
    {
        return num;
    }
    public static void main(String[] args)
    {
        getset obj= new getset();
        obj.setnumber(5);
        obj.getnumber();

    }
}