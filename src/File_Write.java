import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Write {

    public void file_menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of file do you want to read"+
                "\n1)String\t2)Byte\t3)Exit");

        int choose = scanner.nextInt();

        switch (choose) {
            case 1 -> {
                try {
                    write_string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Main.menu();
            }
            case 2 -> {
                write_byte();
                Main.menu();
            }
            default -> {
            }
        }

        scanner.close();
    }

    private void write_byte() {
    }

    private void write_string() throws IOException {
        switch (chooseMethod()) {
            case 1 -> rewriteString();
            case 2 -> appendString();
            default -> {
            }
        }
    }

    private void appendString() {
        Scanner scannerStr = new Scanner(System.in);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", true))) {
            writer.append(' ');
            String line = scannerStr.nextLine();
            writer.append(line);
        }
         catch(IOException e){
            e.printStackTrace();
        }

    }

    private void rewriteString()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))){
            String line = sc.next();
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private int chooseMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1)Rewrite\t2)Append");

        return scan.nextInt();
    }
}
