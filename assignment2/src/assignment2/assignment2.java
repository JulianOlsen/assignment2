package assignment2;
import java.util.Scanner;
 
public class assignment2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        
        String Aardvark;
        
        System.out.println("Enter line: ");
        
        while(true){
        Aardvark = scan.nextLine();
        if(Aardvark.contains("Aardvark")){
        System.out.println("Aardvark!");
        break;
        }
        else if(Aardvark.contains("aardvark")) {
        System.out.println("Aardvark!");
        break;        
        }
        else{
        System.out.println("dosen't contain Aardvark");
        }
        }
 
        
        String mouse;
        System.out.println("Loud: ");
        mouse = scan.nextLine();
        System.out.println("Quiet: "+mouse.toLowerCase());
        
        String brokenkeybord;
        System.out.println("what did she say?");
        brokenkeybord = scan.nextLine();
        String s1 = brokenkeybord.replaceAll("###","o");
        String s2 = s1.replaceAll("##","e");
        String s3 = s2.replaceAll("%%","a");
        System.out.println(s3);
        

    }   
}
