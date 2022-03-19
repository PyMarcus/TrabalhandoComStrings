class Heranca{
    /*
    Não existe herança múltipla em Java
    uma forma de simular heranca múltipla, é com interfaces
     */
    public static void main(String[] args){
        Cavalo cavalo = new Cavalo("Pé de pano", .4, "Preto", 2);
        cavalo.andar();
    }

}

class Animal{
    // atributos:
    private String nome;
    private double altura;

    //construtor
    protected Animal(){

    }
    // @overload => Sobrecarga de construtor
    protected Animal(String name, double height){
        this.nome = name;
        this.altura = height;
    }

    // métodos:

    protected void andar(){
        System.out.println("Andando...");
    }
}
//herança


//cavalo é um animal
class Cavalo extends Animal{
    private String cor;
    private int idade;

    // construtor de cavalo com parâmetros
    public Cavalo(String nome, double altura, String cor, int idade){
        /*
        CONSTRUTOR DE INICIALIZAÇÃO
         */
        super(nome, altura);  //chama o construtor da superclasse
        this.cor = cor;
        this.idade = idade;
    }

    @Override
    protected void andar() {
        System.out.print("ANDANDO");
    }
}