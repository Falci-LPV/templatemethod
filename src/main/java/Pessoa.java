public abstract class Pessoa {
    private int idade;
    private float altura;
    private float peso;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float calcularIMC(){
        return peso / (altura * altura);
    }
    public abstract String estado();

    public String getPessoa() {
        return "Mulher";
    }

    public String getInfo() {
        return getPessoa()+"{" +
                "idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                ", IMC=" + this.estado() +
                '}';
    }
}
