package MiniProject;

import java.util.ArrayList;
import java.util.Random;

public class Festival extends Festa{
    protected String tema;
    public double valor;
    private static int total_pessoas = 0;
    private static ArrayList<String> pessoa = new ArrayList();
    public static int lugar = Festa.ingresso; // atributo da classe

    public Festival(double valor, String tema,String o_que_levar, String dia, String local, String nome, String definicao){
        super(o_que_levar,  dia, local, nome, definicao);
        this.tema = tema;
        this.valor = valor;

    }


    public double getValor() {
        return valor;
    }

    public void definirPessoa() {


    }

    public void venderIngresso(double renda, String pessoa){
        this.pessoa.add(pessoa);
        if(renda >= this.valor){
            total_pessoas += 1;

            System.out.println("Há " + this.lugar + " lugares");
            lugar -= 1;
            System.out.println("Convidado, " + pessoa + ", aceito!\nAproveite...");
            venderIngresso();
            System.out.println("Agora, há " + this.lugar + " lugares");
        }else{
            System.out.println(pessoa + ", o ingresso custa R$ " + this.valor);
            System.out.println("Não vendido!");
            System.out.println("Lugares disponíveis: " + this.lugar);
        }

        System.out.println("\n");
        if(total_pessoas == 3){
            melhorFantasia();
        }

    }

    public String getTema() {
        return tema;
    }
    public void melhorFantasia(){
        Random choice = new Random();
        int num = choice.nextInt(0, this.pessoa.size());
        String escolhido = pessoa.get(num);
        System.out.println("A melhor fantasia é " + escolhido);
    }
}
