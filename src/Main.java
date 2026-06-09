import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite nome do seu produto: ");
        String nome = sc.nextLine();

        try {
            Path path = Paths.get("Produtos.txt");
            Files.write(
                    path,
                    List.of(nome),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        }catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}