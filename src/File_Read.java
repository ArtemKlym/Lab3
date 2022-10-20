import java.io.*;
import java.util.Scanner;


public class File_Read {
    public void file_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of file do you want to read"+
                "\n1)String\t2)Byte\t3)Exit");
        
        int choose = scanner.nextInt();

        switch (choose) {
            case 1 -> {
                read_string();
                Main.menu();
            }
            case 2 -> {
                read_byte();
                Main.menu();
            }
            default -> {
            }
        }

        scanner.close();
    }

    private void read_byte() {
        String file = "byte.dat";

        try(FileInputStream fl = new FileInputStream(file)) {
            byte[] arr = new byte[(int)file.length()];
            System.out.println(fl.read(arr));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void read_string() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
