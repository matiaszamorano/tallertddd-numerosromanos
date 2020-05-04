package com.tallertdd.numerosromanos.service;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.fail;
import org.junit.Test;

/**
 * Pasos: 1 - Escribir la prueba y que falle 2 - Escribir el mínimo código
 * productivo para que pasen los test 3 - Refactorizar el código
 *
 * Reglas: 1 - No se puede escribir código productivo, a menos que sea para
 * hacer pasar un test fallido. 2 - No se puede escribir más que lo necesario
 * para que falle un test unitario. 3 - No se puede escribir más código
 * productivo del estrictamente necesario para hacer pasar un test.
 */
public class TraductorNumerosRomanosServiceTest {

    @Test
    public void convertirARomano_conUno_devuelveI() {
        //preparar el escenario
        int enteroATraducir = 1;

        //ejecutar
        String resultado = TraductorNumerosRomanosService.convertirARomano(enteroATraducir);

        //validar
        assertThat(resultado).isEqualTo("I");
    }

    @Test
    public void convertirARomano_conDos_devuelveII() {
        //preparar el escenario
        int enteroATraducir = 2;

        //ejecutar
        String resultado = TraductorNumerosRomanosService.convertirARomano(enteroATraducir);

        //validar
        assertThat(resultado).isEqualTo("II");
    }

    public void convertirARomano_conNumeroNegativo_lanzaException() {
        try {
            TraductorNumerosRomanosService.convertirARomano(-1);
        } catch (Exception e) {
            System.out.println("Che, no vale negativo");
        }
    }
}
