/*Scrivere un programma che legga da riga di comando una stringa composta da parentesi quadre aperte 
[ e parentesi quadre chiuse ]. Il programma stampa bilanciata se la stringa ha le parentesi bilanciate
 o non bilanciata altrimenti. Le parentesi sono bilanciate se a ogni parentesi aperta corrisponde una chiusa.
NOTA:È indispensabile mettere la stringa di parentesi tra virgolette per permetterne la lettura da riga di comando*/

public class Paren{
    public static void main(String[] args){
        String parentesi = args[0];
        int count = 0;

        for (int i=0; i<parentesi.length(); i++){
               if (parentesi.charAt(i)=='['){
                count++;
               }else{
                count--;
                if (count<0){ 
                   System.out.println("non bilanciate");
                    return;
                }
               }
        }
        if (count!=0){
          System.out.println("non bilanciate");
        }else{
            System.out.println("bilanciate");
        }

    }
}