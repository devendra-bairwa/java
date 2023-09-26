
import java.util.Scanner;
//switch
public class swch {
    public static void main(String[] args)
    {
        int n1,n2;
        String ch;
    Scanner obj= new Scanner(System.in);
    System.out.println("enter number");
    n1=obj.nextInt();
    n2=obj.nextInt();
System.out.println("enter choice ");
    ch= obj.next();

    switch(ch)
    {
        case "/" : 
        System.out.println(n1/n2);
        break;

        case "*" : 
        System.out.println(n1*n2);
        break;

        case "-" : 
        System.out.println(n1-n2);
        break;

        case "+" : 
        System.out.println(n1+n2);
        break;

        default:
        System.out.println("invalid");

        
    }


    }
}