import java.util.Scanner;

public class File_Write {
    public void file_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of file do you want to read"+
                "\n1)String\t2)Byte\t3)Exit");

        int choose = scanner.nextInt();

        switch(choose){
            case 1: write_string();
                Main.menu();
                break;

            case 2: write_byte();
                Main.menu();
                break;

            default: break;
        }

        scanner.close();
    }

    private void write_byte() {
    }

    private void write_string() {
        
    }
}
