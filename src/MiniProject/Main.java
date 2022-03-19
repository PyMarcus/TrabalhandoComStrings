package MiniProject;

public class Main {
    public static void main(String[] args){
        Festival marvel_heroes = new Festival(50, "Herois marvel", "Cesta de alimentos para a caridade", "Próxima quarta feira", "Praça", "Festa à fantasia", "Festa para as pessoas se encontrarem fantaasiadas");
        Pessoa fulano = new Pessoa("Fulano", "Spiderman", marvel_heroes,  100);
        Pessoa beltrano = new Pessoa("Beltrano", "Hulk", marvel_heroes, 10);
        Pessoa ciclano = new Pessoa("Ciclano", "IronMan", marvel_heroes, 50);
        fulano.comprarIngresso(marvel_heroes.getValor());
        beltrano.comprarIngresso(marvel_heroes.getValor());
        ciclano.comprarIngresso(marvel_heroes.getValor());
    }
}
