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

        System.out.println("Olá. Escolha qual opção deseja realizar no sistema: ");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Consultar produto");
        System.out.println("3 - Excluir produto");
        System.out.println("4 - Editar produto");
        System.out.println();

        Path path = Path.of("Produtos.txt");

        int  opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                try {
                    System.out.println("Digite o nome do produto: ");
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            case 2:
                try {
                    System.out.println("Consulta de produtos");

                    String conteudo = Files.readString(path);
                    System.out.println(conteudo);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
        }
        System.out.println();

    }
}

class Produto {
    private String nome;
    private double preco;

    private String lerArquivo() {
        Scanner sc = new Scanner(System.in);
        return "";
    }
}