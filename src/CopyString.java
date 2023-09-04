
import java.util.Scanner;
public class CopyString {

    public static void main (String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter  String");
        String data= sc.next();
        String copydata="";
        for(int i=0;i< data.length();i++){
            copydata = copydata + data.charAt(i);


        }
          System.out.println ("copydata is" + copydata);
    }


}
