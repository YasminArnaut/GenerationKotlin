import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraKtTest {

    @Test
    fun somaTest(){
        assertEquals(3.0, Calc.soma(1.0, 2.0))
    }

    @Test
    fun multTest(){
        assertEquals(3.0, Calc.multiplicacao(3.0, 1.0))
    }

    @Test
    fun divTest(){
        assertEquals(3.0, Calc.divisao(3.0, 1.0))
    }

    @Test
    fun subTest(){
        assertEquals(2, Calc.subtracao(3, 1))
    }



}

