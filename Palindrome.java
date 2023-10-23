public class Palindrome {
    
    private static boolean isPalindroma(String s){
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i)!= s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String parola = args[0];
        System.out.print("[");

        for (int i=0; i<parola.length(); i++){
            for (int j=i+1; j<parola.length(); j++){
                String temp = parola.substring(i,j+1);
               if (isPalindroma(temp)){
                System.out.print(temp+" ");
               }
            }
        }
        System.out.print("]");
    }
}
