/*Scrivere un programma che legga da riga di comando
 due numeri interi a e b e stampi a video la somma dei numeri pari compresi tra a e b (estremi esclusi).*/
 
 public class Somma{
    public static void main(String[] args){
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int somma=0;
       for (int i=a; i<=b; i++){
          somma+=i;
       }
       System.out.println("Somma: "+somma);
    }
 }