package br.com.dio.exceptions;

public class ExceptionCustomizada {
    public static void main(String[] args) {
        int[] numeradores = {4, 5, 8, 10};
        int[] denominadores = {2, 4, 0, 2, 8};


        for(int i = 0; i < denominadores.length; i++){
            try {
                if (numeradores[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata! \nNumerador: " + numeradores[i] + "\nDenominador: " +                                            denominadores[i], numeradores[i], denominadores[i]);
                
                int resultado = numeradores[i] / denominadores[i];
                System.out.println(resultado);

            } catch (DivisaoNaoExataException exception){
                System.out.println(exception.getMessage());
            } catch (ArithmeticException exception){
                System.out.println("Um numerador não pode ter '0' como denominador");
                continue;
            } catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("A quantidade de numeradores é menor do que a quantidade de denominadores, iguale as quantidades para que o programa funcione normalmente");
            }
            System.out.println("O programa continua...");
        }
    }
}
