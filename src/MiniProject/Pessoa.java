package MiniProject;

import org.jetbrains.annotations.NotNull;

public class Pessoa {
    private String nome;
    private String fantasia;
    private double dinheiro = 0;
    protected String name;
    protected Festival fest;

    /*
        Pessoa que participará da festa
     */

    @NotNull
    public Pessoa(String nome, String fantasia, @NotNull Festival qual_festival, double dinheiro){
        this.nome = nome;
        this.fantasia = fantasia;
        this.name = qual_festival.getTema();
        this.fest = qual_festival;
        this.dinheiro = dinheiro;
    }
    public Pessoa(){

    }

    public void setDinheiro(double nova_quantia){
        if(nova_quantia > 0){
            this.dinheiro = nova_quantia;
        }
    }

    public double getDinheiro() {
        return this.dinheiro;
    }

    public String getFantasia(){
        return this.fantasia;
    }

    public void setFantasia(String nova_fantasia){
        this.fantasia = nova_fantasia;
    }

    public void comprarIngresso(double valor) {
        double valor_ingresso = valor ;
        this.fest.venderIngresso(this.dinheiro, this.nome);
        this.dinheiro -= valor;

    }
}
