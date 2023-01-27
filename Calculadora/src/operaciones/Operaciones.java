package operaciones;
/**
 * 
 * @author Iker Elorrieta
 * @version 1.0
 *
 */
public class Operaciones{
/**
 * 
 * @param valor1
 * @param valor2
 * @numero
 * @return valor1+valor2=numero
 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * 
     * @param valor1
     * @param valor2
     * @numero
     * @return valor1-valor2=numero
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * 
     * @param valor1
     * @param valor2
     * @numero
     * @return valor1*valor2=numero
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * 
     * @param valor1
     * @param valor2
     * @numero
     * @return valor1/valor2=numero
     */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * 
     * @param valor1
     * @param valor2
     * @numero
     * @return valor1%valor2=numero
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}