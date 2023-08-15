package Busca;

public class BuscaValor {

    public static int busca(int[] array, int tamanho, int k) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == k) {
                return i + 1;
            }
        }
        return -1;
    }
}