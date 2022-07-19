import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MulherTest {

    @Test
    void deveRetonarMulherAbaixoDoPeso() {
        Mulher mulher = new Mulher();
        mulher.setAltura(1.80f);
        mulher.setIdade(38);
        mulher.setPeso(49.0f);

        assertEquals("Mulher{idade=38, altura=1.8, peso=49.0, IMC=abaixo do peso}", mulher.getInfo());
    }
    @Test
    void deveRetonarMulherComPesoNormal() {
        Mulher mulher = new Mulher();
        mulher.setAltura(1.50f);
        mulher.setIdade(38);
        mulher.setPeso(49.0f);

        assertEquals("Mulher{idade=38, altura=1.5, peso=49.0, IMC=no peso normal}", mulher.getInfo());
    }

    @Test
    void deveRetonarMulherMarginalmenteAcimaDoPeso() {
        Mulher mulher = new Mulher();
        mulher.setAltura(1.50f);
        mulher.setIdade(38);
        mulher.setPeso(60.0f);

        assertEquals("Mulher{idade=38, altura=1.5, peso=60.0, IMC=marginalmente acima do peso}", mulher.getInfo());
    }

    @Test
    void deveRetonarMulherAcimaDoPesoIdeal() {
        Mulher mulher = new Mulher();
        mulher.setAltura(1.50f);
        mulher.setIdade(38);
        mulher.setPeso(70.0f);

        assertEquals("Mulher{idade=38, altura=1.5, peso=70.0, IMC=acima do peso ideal}", mulher.getInfo());
    }

    @Test
    void deveRetonarMulherObesa() {
        Mulher mulher = new Mulher();
        mulher.setAltura(1.50f);
        mulher.setIdade(38);
        mulher.setPeso(90.0f);

        assertEquals("Mulher{idade=38, altura=1.5, peso=90.0, IMC=obesa}", mulher.getInfo());
    }

    @Test
    void deveRetonarProblema() {
        Mulher mulher = new Mulher();

        assertEquals("Houve algum problema", mulher.estado());
    }
}