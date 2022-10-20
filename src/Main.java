import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHello! What do you want to do with file?\n1)-Read\t2)Write\t3)Exit");
        int choose = scanner.nextInt();

        switch (choose) {
            case 1 -> {
                File_Read fread = new File_Read();
                fread.file_menu();
            }
            case 2 -> {
                File_Write fwrite = new File_Write();
                fwrite.file_menu();
            }
            default -> {
            }
        }

        scanner.close();
    }
}
