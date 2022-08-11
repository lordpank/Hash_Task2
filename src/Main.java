import java.util.Scanner;

public class Main {
    static String inputString =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                    "Ut enim ad minim veniam, quis nostrud exercitation " +
                    "ullamco laboris nisi ut aliquip ex ea commodo consequat." +
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
                    "Excepteur sint occaecat cupidatat non proident," +
                    "sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WordsChecker wordChecker = new WordsChecker(inputString);

        while (true) {
            System.out.println("Введите слово для проверки или end для выхода:");
            String word = scanner.nextLine();
            if ("end".equals(word)) {
                System.out.println("Программа завершена");
                break;
            }
            if (wordChecker.hasWord(word)) {
                System.out.println("В тексте присутствует слово " + word);
            } else {
                System.out.println("В тексте отсутствует слово " + word);
            }
        }
    }
}