import java.io.*;
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
        switch(chooseMethod()){
            case 1 -> rewriteByte();
            case 2 -> appendByte();
        }
    }

    private void appendByte() {
    }

    private void rewriteByte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write line");
        try(OutputStream os = new FileOutputStream("byte.dat")){
            String str = scanner.nextLine();
            byte[] bytes = str.getBytes();
            os.write(bytes);
            System.out.println("Successfully"+ " byte inserted");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    private void write_string() throws IOException {
        switch (chooseMethod()) {
            case 1 -> rewriteString();
            case 2 -> appendString();
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
