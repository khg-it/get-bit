public class get {
    public static void main(String args[])
    {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int op=(bitmask)&n;
        if(op==0)
        {
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is non-zero");
        }
    }
    
}
