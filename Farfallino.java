/*Nel linguaggio farfallino ciascuna vocale non accentata (vocale) viene sostituita da una sequenza 
di tre caratteri vocale-f-vocale. Per esempio, la vocale a viene sostituita dalla sequenza afa, 
la vocale e dalla sequenza efe e così via. Se una vocale è maiuscola, 
anche la sequenza di tre caratteri che sostituisce la vocale deve essere definita da caratteri maiuscoli 
(ad esempio, la vocale A viene sostituita dalla sequenza AFA).
Scrivere un programma che:legga da standard input un testo su più righe;
termini la lettura quando, premendo la combinazione di tasti Ctrl+D, 
viene inserito da standard input l'indicatore End-Of-File (EOF);
ristampi il testo letto dopo averlo tradotto in linguaggio farfallino.*/
import java.util.Scanner;
public class Farfallino{
    
  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    String testoTradotto="";
    while (scanner.hasNextLine()){
     String line= scanner.nextLine();
        for (int i=0; i<line.length(); i++){
         testoTradotto+=line.charAt(i);
           switch (line.charAt(i)){
            case 'a':
         testoTradotto+=("fa");
            break;
             case 'e':
            testoTradotto+=("fe");
            break;
             case 'i':
           testoTradotto+=("fi");
            break;
             case 'o':
           testoTradotto+= ("fo");
            break;
             case 'u':
            testoTradotto+=("fu");
            break;
        
           }
       }
       testoTradotto+=("\n");
      
    }
     System.out.println(testoTradotto);
 }
  
    
}