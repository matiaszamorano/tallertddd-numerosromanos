package com.tallertdd.numerosromanos.service;

import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.Test;

public class TraductorNumerosRomanosServiceTest {
    
    @Test
    public void traducirARomano_conUno_devuelveI() {
        //preparo escenario
        int enteroATraducir = 1;

        //ejecuto
        String resultado = TraductorNumerosRomanosService.traducirARomano(enteroATraducir);

        //valido
        assertThat(resultado).isEqualTo("I");
    }
}
