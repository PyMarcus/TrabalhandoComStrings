import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class GeneratePassword{
    private static Scanner input;

    public static void gen(){
        System.out.print("Quantos caracteres? >>> ");
        int quantidade = 0;
        try{
            input = new Scanner(System.in);
           quantidade = input.nextInt();

           String password = "";
           int randomic;
           for(int i = 0; i <= quantidade; i++){
               randomic = new Random().nextInt(93) + 33;
               password += (char) randomic;
           }
            System.out.println("Senha: " + password);
        }catch (InputMismatchException e){
            System.out.println(e);
        }
        finally {
            System.out.println("concluído");
        }
    }

}