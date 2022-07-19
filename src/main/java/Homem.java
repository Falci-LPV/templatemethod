public class Homem extends Pessoa{

    public String estado() {

        float imc = this.calcularIMC();

        if(imc < 20.7) return "abaixo do peso";
        if(20.7 <= imc && imc < 26.4) return "no peso normal";
        if(26.4 <= imc && imc < 27.8) return "marginalmente acima do peso";
        if(27.8 <= imc && imc < 31.1) return "acima do peso ideal";
        if(imc >= 31.1) return "obeso";
        else return "Houve algum problema";
    }

    public String getPessoa() {
        return "Homem";
    }
}
