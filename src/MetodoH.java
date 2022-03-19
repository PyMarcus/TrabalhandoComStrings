class MetodoH{
    // strings, em java, são representadas por aspas duplas, caracteres, por aspas simples
    // pode-se criar uma string como:
    static String my_name = new String("Marcussss");
    public static void main(String[] args){
        System.out.println(my_name);
        /*
        length: propriedade da string que retorna o tamanho
        charAt(): metodo que pega um caractere pela posicao
        getChars(): método que pega um conjunto de caracteres ctrl c cltrv e armazena em uma array pela posicao

        */

        String texto = new String("Texto");
        char[] auxiliar = {'i', 'o',' ',' ',' ',' ',' ',' '};
        System.out.println(texto.length());
        System.out.println(texto.charAt(2));
        texto.getChars(0, 5, auxiliar, 2);
        for(char itens: auxiliar) System.out.print(itens + ", ");


        MetodoH.compara("Marcuss");
    }

    public static void compara(String a_comparar){
        boolean sao_iguais = my_name.equalsIgnoreCase(a_comparar);
        System.out.println(sao_iguais);

        boolean sao_iguais2 = my_name.equals(a_comparar);
        System.out.println(sao_iguais);

        int sao_iguais3 = my_name.compareTo(a_comparar); // ordem lexigrafica, retorna 0 ou 1 0 = iguais, valores maiores q 0 indica q a primeira string é maior que a segunda
        System.out.println(sao_iguais3);

        MetodoH.capture();

        MetodoH.concatena();


        MetodoH.regex();
    }

    public static void capture(){
        //sobrecarga (overload) de metodos e construtores consiste na alteração de parametros ou ate de tipos de metodos com o msm nome
        //sobreescrita (override) de métodos consiste

        String text = new String("Teste driver");
        String driver = text.substring(6);
        System.out.println(driver);
        String este = text.substring(1, 5);
        System.out.println(este);
    }

    public static void concatena(){
        String text1 = new String("Instituto");
        String text2 = new String("Federal");
        String text3 = text1.concat(" " + text2);
        System.out.println(text3);

        System.out.println(text1.endsWith("to"));
        System.out.println(text1.startsWith("Instit"));
    }

    public static void normalize(){
        //normalizacao visa adequar a algum metodo (metodos replace,split, trim, etc
    }

    public static void regex(){
        //expressões regulares definem padrões que podem ser melhor aplicados em strings
        String text = new String("TEXTO");
        System.out.println(text.matches("")); //verifica se a string produz o padrão passado e retorna true
        System.out.println(text.replaceAll("", "")); // se a regex for correspondente, retorna
        System.out.println(text.split(" ")); // retorna um array com o padrão definido pela regex


        String REGEX = "[abc] = qualquer caractere\n[abc][xy]caractere do primeiro bloco, seguido do segundo\n^[abc]=qualquer caractere, exceto esses\n[a-r]=intervalo de a a r\na pipe b a ou b, ^re = regex no inicio, re$ regex no final";
        System.out.println(REGEX);

        System.out.println("\n\n\n");
        String placa = new String("GRZ-5893");

        String[] parteNaoNumerica = placa.split("-[0-9]+");
        String[] traco = placa.split("[a-zA-Z]?[0-9]?");
        for(String item : parteNaoNumerica) System.out.println(item);
        for(String item : traco) System.out.println(item);

        //meta caracteres:
        // \d = qualquer numero, \D nao numero, \s espaço em branco \S nao espaço em branco \ w caracteres alfanumericos
        String[] metachar = placa.split("^(\\D\\D\\D-)");
        for(String item : metachar) System.out.println(item);    }

}
