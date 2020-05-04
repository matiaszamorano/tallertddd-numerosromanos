package com.tallertdd.numerosromanos.service;

public class TraductorNumerosRomanosService {

    public static String convertirARomano(int enteroATraducir) {
        String resultado = "";
        for (int i = 0; i < enteroATraducir; i++) {
            resultado += "I";
        }
        return resultado;
    }
}
