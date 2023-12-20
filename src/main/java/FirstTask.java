import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        infiniteLoop(scanner);
        switchScanner(scanner);
    }

    /**
     * Бесконечный цикл, который принимает на вход объект класса Scanner
     * и выводит в stdout вводимый текст.
     * Выход из цикла осуществляется при вводе слова "exit"
     *
     * @param localScanner
     */
    public static void infiniteLoop(Scanner localScanner) {

        while (true) {
            System.out.print("Введите любое слово: ");
            String word = localScanner.nextLine();
            System.out.println("Вы ввели слово - " + word);

            if (word.equals("exit")) {
                System.out.println("Вы прервали выполнение цикла.");
                break;
            }
        }
    }

    /**
     * Бесконечный цикл, который принимает на вход объект класса Scanner
     * и содержит в теле конструкцию switch case. Ввод записывается в
     * локальную переменную numberOfSeason. Результат выволнения внутри
     * switch case зависит от значения переменной numberOfSeason, которая
     * должна совпадать с порядковым номером поры года.
     * Выход из цикла осуществляется при ввода значения "5"
     *
     * @param localScanner
     */
    public static void switchScanner(Scanner localScanner) {

        while (true) {
            System.out.print("Введите порядковый номер поры года: ");
            String numberOfSeason = localScanner.nextLine();
            switch (numberOfSeason) {
                case "1":
                    System.out.println("Зима");
                    break;
                case "2":
                    System.out.println("Весна");
                    break;
                case "3":
                    System.out.println("Лето");
                    break;
                case "4":
                    System.out.println("Осень");
                    break;
                case "5":
                    System.out.println("Выход из цикла");
                    System.exit(0);
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        }
    }
}
