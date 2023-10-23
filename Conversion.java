/*Scrivere un programma che esegua la conversione temporale specificata da riga di comando. 
Permettere la conversione da e verso secondi, minuti, ore, giorni, mesi e anni.*/

public class Conversion{
    public static void main(String[] args){
        double risultato= Double.parseDouble(args[0]);

        switch (args[1]){
            case "minuti":
            risultato*=60;
            break;
            case "ore":
             risultato*=60*60;
            break;
            case "giorni":
             risultato*=60*60*24;
            break;
            case "mesi":
            risultato*=60*60*24*30;
            break;
            case "anni":
             risultato*=60*60*24*365;
        }
        switch (args[3]){
            case "minuti":
            risultato/=60;
            break;
            case "ore":
             risultato/=60*60;
            break;
            case "giorni":
             risultato/=60*60*24;
            break;
            case "mesi":
            risultato/=60*60*24*30;
            break;
            case "anni":
             risultato/=60*60*24*365;
            break;
        }
        System.out.println(args[0]+" "+args[1]+" corrispondono a "+risultato+" "+args[3]);
    }
}