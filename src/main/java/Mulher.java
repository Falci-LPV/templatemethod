public class Mulher extends Pessoa{

    public String estado() {
        float imc = this.calcularIMC();

        if(imc < 19.1) return "abaixo do peso";
        if(19.1 <= imc && imc < 25.8) return "no peso normal";
        if(25.8 <= imc && imc < 27.3) return "marginalmente acima do peso";
        if(27.3 <= imc && imc < 32.3) return "acima do peso ideal";
        if(imc >= 32.3) return "obesa";
        else return "Houve algum problema";
    }

}
