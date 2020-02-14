package revisaojava2020;

/** - Crie um método que imprima 2 textos recebidos como argumentos 
 * do método
 *  - Crie um método que faça a multiplicação de um array de números
 */
public class Exercicio2 {
    
    public static void main(String[] args){
        int numeros[] = {3, 2};
        System.out.println(mult(numeros));
    }
    
    private static int mult(int[] numeros) {
        int resultado = 1;
        
        for (int num : numeros) {
            resultado *= num;
        }
        return resultado;
    }
    
}
