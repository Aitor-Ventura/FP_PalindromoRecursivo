public class Recursion {
    /*  Aitor Ventura Delgado
        11.03.2019
        
        Crearemos un método que nos diga si una String pasada como parámetro es
        capicúa. Es decir, si se lee de un lado igual que se lee de otros. Por
        ejemplo la palabra "oso" es capicúa. De manera recursiva.   */
        
    public static boolean isPalindrome(String s1){
        /*  Si la longitud de la String es menor que dos, será capicúa, porque
            tamaño 1 < 2 => "a" */
        if (s1.length() < 2){
            return true;
        }
        
        /*  Si la letra que se encuentra al principio de la ristra es igual
            que la que se encuentra al final, continuará siendo capicúa, pero
            se tiene que cumplir siempre. Si no lo es (caso aquí), devolvemos
            falso.  */
        if (s1.charAt(0) != s1.charAt(s1.length() - 1)){
            return false;
        }
        
        /*  Si no entra en la segunda condición, será que se cumple que tengan
        las mismas letras al principio y al final, luego repetimos el proceso hasta que su
        longitud sea menor que uno. */
        return isPalindrome(s1.substring(1, s1.length() - 1));
    }
}