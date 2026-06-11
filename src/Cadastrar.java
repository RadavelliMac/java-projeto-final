import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastrar {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite nome do seu produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite a descrição do seu produto: ");
            String desc = sc.nextLine();

            System.out.print("Digite o preço do seu produto: ");
            String preco = sc.nextLine();

            System.out.print("Digite o estoque do seu produto: ");
            String estoque = sc.nextLine();

            List<String> produtos = new ArrayList<>();
            produtos.add("{Nome: "+nome);
            produtos.add("Descrição: "+desc);
            produtos.add("Preço: R$"+preco);
            produtos.add("Quantos no estoque: "+estoque+ "}");
            produtos.add(" ");


            try {
                Path path = Paths.get("Produtos.txt");
                Files.write(
                        path,
                        (produtos),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND
                );
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
                e.printStackTrace();
            }
            try {
                Path path = Paths.get("Produtos.txt");
                var linhas = Files.readAllLines(path);
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }