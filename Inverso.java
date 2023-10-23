import java.util.Scanner;
public class Inverso {

    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
     String testo = "";
     while (s.hasNext()){
        testo+=s.nextLine()+"\n";
     }
     
     for (int i=testo.length()-1; i>=0; i--){
        System.out.print(testo.charAt(i));
     }
    }
}
