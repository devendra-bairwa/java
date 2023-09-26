
import java.util.Scanner;

public class max {
    public static void main(String[] args)
    {
        //greater among numbers
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter three numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        
        if(a>b)
        {
           if(a>c)
           {
            System.out.println("greater is "+a);
           }

           else
           {
             System.out.println("greater is "+c);
           }

        }

        else if(b>c)
        {
           if(b>a)
           {
            System.out.println("greater is "+b);
           }

           else
           {
             System.out.println("greater is "+a);
           }

        }

        else{
            System.out.println("greater is "+c);
        }
    }
    
}
