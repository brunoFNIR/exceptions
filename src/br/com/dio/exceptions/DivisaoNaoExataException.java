package br.com.dio.exceptions;

public class DivisaoNaoExataException extends Exception{
    private Integer numerador;
    private Integer denominador;


    public DivisaoNaoExataException(String message, Integer numerador, Integer denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
