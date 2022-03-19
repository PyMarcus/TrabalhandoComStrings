package MiniProject;


class Festa extends Evento {
    protected String o_que_levar;

    public Festa(String o_que_levar, String dia, String local, String nome, String definicao){
        super(dia, local, nome, definicao);
        this.o_que_levar = o_que_levar;
    }

    @Override
    protected void tocarMusica() {
        System.out.println("Tocando eletrônica!");
    }

}
