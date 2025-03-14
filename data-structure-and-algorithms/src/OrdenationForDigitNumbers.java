import java.util.ArrayList;
import java.util.List;

public class OrdenationForDigitNumbers {
    public static void main(String[] args) {
        int[] test = {45, 32, 12, 3, 2, 1, 5, 6, 123, 333};
        sortArrayByDigitNumbers(test);
    }

    public static void sortArrayByDigitNumbers(int[] integerArray){
        int[] aux = new int[integerArray.length];
        int[] ordenedArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            aux[i] = decimalNumberOf(integerArray[i]);
            ordenedArray[i] = integerArray[i];
        }
        for (int i = 0; i < integerArray.length; i++) {
            int atual = i;
            if (i > 0) {
                while (aux[atual] < aux[atual-1]) {
                    int anterior = atual - 1;
                    if (aux[atual] == aux[anterior]) {
                        break;
                    }

                    else {
                        int auxilio = ordenedArray[atual];
                        int auxilio2 = aux[atual];
                        ordenedArray[atual] = ordenedArray[anterior];
                        aux[atual] = aux[anterior];
                        ordenedArray[anterior] = auxilio;
                        aux[anterior] = auxilio2;
                        atual--;
                    }
                    if (atual == 0) {
                            break;
                    }
                }
            }
        }
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(ordenedArray[i]);
        }
    }
    public static int decimalNumberOf(int number){
        int decimalNumber = 1;
        while(true){
            number = number / 10;
            if (number > 0){
                decimalNumber++;
            }
            else {
                break;
            }
        }
        return decimalNumber;
    }
}
