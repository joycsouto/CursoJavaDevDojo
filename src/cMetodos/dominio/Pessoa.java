package cMetodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade= idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
