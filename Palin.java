/*Scrivere un programma che legga da riga di comando una stringa senza spazi e stampi 
a video il messaggio Palindroma nel caso in cui la stringa letta sia palindroma e Non palindroma altrimenti.*/

public class Palin{
    public static void main(String[] args){
        String parola = args[0];

        if (!palin(parola)){
            System.out.print("non ");
        }
         System.out.println("palindroma");
    }

    public static boolean palin(String s){
        int len = s.length();
      for (int i=0; i<len/2; i++){
          if (s.charAt(i)!=s.charAt(len-i-1)){
            return false;
          }
        }
        return true;
    }
}