package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Entrada inválida, informe um número inteiro!" + e.getMessage()); //e.getMessage() mostra a mensgaem do erro que no caso de digitar uma string seria 'For input string ....'
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Entrada inválida, não é possível dividir um número por 0!");
            } finally {
                if (continueLooping){ //para so imprimir o finally quando o programa funcionar
                    continue;
                }
                    System.out.println("Chegou no finally!");
            }
        }while (continueLooping);
    }

    public static int dividir(int a, int b){return a / b;}
}
