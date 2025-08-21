import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner;

    static{
        scanner = new Scanner(System.in);
    }

    public int inputInteger(){
        System.out.print("Введите номер ячейки(1-9):");
        return scanner.nextInt();
    }

}
