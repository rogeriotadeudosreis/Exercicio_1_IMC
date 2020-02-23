package classes;

public class Pessoa {

    // aqui declaramos os atributos e inicializamos
    private String nome = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    
    // aqui declaramos os métodos publicos getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // aqui criamos um método para calcular o imc
    public float calcularIMC() {
        return (peso / (altura * altura));
    }

}
