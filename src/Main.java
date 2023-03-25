import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Ingridients ing = new Ingridients();//объект

        Alchemy alchemy = new Alchemy();
       //"Живая смерть" "Felix Felici"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название зелья");
        String potions = scanner.nextLine();
        String rec = alchemy.preparation(potions);//получаем результат из метода preparation, передаем текстовой переменной rec
        System.out.println(rec);


    }
}
