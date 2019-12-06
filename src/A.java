import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class A{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            
            System.out.println(new MyRegex().pattern);
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}




class MyRegex{
public String pattern="[0-255]{1,3}[.]+[0-255]{1,3}+[.]+[0-255]{1,3}+[.]+[0-255]{1,3}";
       
            
        
    
}