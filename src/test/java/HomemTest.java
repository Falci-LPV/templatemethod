import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomemTest {
    @Test
    void deveRetonarHomemAbaixoDoPeso() {
        Homem homem = new Homem();
        homem.setAltura(1.80f);
        homem.setIdade(38);
        homem.setPeso(49.0f);

        assertEquals("Homem{idade=38, altura=1.8, peso=49.0, IMC=abaixo do peso}", homem.getInfo());
    }
    @Test
    void deveRetonarHomemComPesoNormal() {
        Homem homem = new Homem();
        homem.setAltura(1.50f);
        homem.setIdade(20);
        homem.setPeso(49.0f);

        assertEquals("Homem{idade=20, altura=1.5, peso=49.0, IMC=no peso normal}", homem.getInfo());
    }

    @Test
    void deveRetonarHomemMarginalmenteAcimaDoPeso() {
        Homem homem = new Homem();
        homem.setAltura(1.50f);
        homem.setIdade(25);
        homem.setPeso(60.0f);

        assertEquals("Homem{idade=25, altura=1.5, peso=60.0, IMC=marginalmente acima do peso}", homem.getInfo());
    }

    @Test
    void deveRetonarHomemAcimaDoPesoIdeal() {
        Homem homem = new Homem();
        homem.setAltura(1.50f);
        homem.setIdade(38);
        homem.setPeso(65.0f);

        assertEquals("Homem{idade=38, altura=1.5, peso=65.0, IMC=acima do peso ideal}", homem.getInfo());
    }

    @Test
    void deveRetonarHomemObesa() {
        Homem homem = new Homem();
        homem.setAltura(1.50f);
        homem.setIdade(38);
        homem.setPeso(90.0f);

        assertEquals("Homem{idade=38, altura=1.5, peso=90.0, IMC=obeso}", homem.getInfo());
    }

    @Test
    void deveRetonarProblema() {
        Homem homem = new Homem();

        assertEquals("Houve algum problema", homem.estado());
    }

}