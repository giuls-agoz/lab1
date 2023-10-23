public class Multipli{
    /*crivere un programma che legga da riga di comando due numeri interi 
    e verifichi se il primo numero è multiplo del secondo. */
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.print(x);
      if (x%y!=0){
        System.out.print(" non");
    }
    System.out.println(" è multiplo di "+y);
    }
}