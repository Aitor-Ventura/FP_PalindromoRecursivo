public class Main {
    /**
     * Prueba el método Recursion.isPalindrome
     * @param input - Ristra a tratar
     * @param expected - resultado esperado
     */
    static void test(String input, boolean expected) {
        // Se informa del caso que se está probando
        System.out.println("probando: isPalindrome(\"" + input + "\")");
    	
        // Llamada al método a probar
        boolean result = Recursion.isPalindrome(input);
        
        // Comprobación de los resultados
        if (result != expected) {
            System.out.print(">> Resultado erróneo, deberia ser: " + expected + "");
            System.out.println(" y es: " + result + "");
        } else {
            System.out.println(">> Resultado correcto: " + result + "");
        }        
    }

    /**
     * Invoca a test para realizar múltiples pruebas
     * @param args
     */
    public static void main(String[] args) {
        test("oso", true);
        test("osa", false);
        test("arenera", true);
        test("arienera", false);
   }
}
