/*Scrivere un programma che legga da riga di comando un numero intero n e stampi a video i divisori propri del numero letto, ovvero tutti i suoi divisori escluso il numero stesso. Ad esempio, 
i divisori del numero 12 sono: 1, 2, 3, 4, 6, 12; quindi i divisori propri di 12 sono: 1, 2, 3, 4, 6.*/

public class Div{
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        System.out.print("Divisori di "+args[0]+": ");
        for (int i=1; i<n; i++){
            if (n%i==0){
            System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}