package MiniProject;

class Evento {
    protected String dia;
    protected String local;
    protected String nome;
    protected String definicao;
    protected static int ingresso = 10;

    protected Evento(String dia, String local, String nome, String definicao){
        this.dia = dia;
        this.local = local;
        this.nome = nome;
        this.definicao = definicao;
    }

    protected void tocarMusica(){
        System.out.println("Tocando música, clássica");
    }
    protected void servirAlimento(){
        System.out.println("Servindo alimento");
    }

    protected void venderIngresso(){
        if(ingresso > 0){
            System.out.println("Ingresso vendido!");
            ingresso -= 1;
        }else{
            System.out.println("Ingressos esgotados!");
        }
    }
}
