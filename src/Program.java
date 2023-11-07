import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> lista = new ArrayList<>();

        //insere 10 objetos produto na lista
        for (int i = 0; i <= 10; i++) {
            Produto produto = new Produto(i, "Descrição do Produto " + i);
            lista.add(produto);
        }

        //informa o indice de 2 registros e altera
        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe o índice do registro a ser alterado (" + (i) + "/2): ");
            int indice = sc.nextInt();

            if (indice >= 0 && indice < lista.size()) {
                System.out.print("Nova descrição para o produto: ");
                String novaDescricao = sc.next();
                lista.get(indice).setDescricao(novaDescricao);
                System.out.println("Produto no índice " + indice + " foi atualizado.");
            } else {
                System.out.println("Índice inválido. O registro não foi alterado.");
            }
        }

        //exclui 2 registros pelo indice
        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe o índice do registro a ser excluído (" + (i) + "/2): ");
            int indice = sc.nextInt();

            if (indice >= 0 && indice < lista.size()) {
                lista.remove(indice);
                System.out.println("Produto no índice " + indice + " foi excluído.");
            } else {
                System.out.println("Índice inválido. Nenhum registro foi excluído.");
            }
        }

        //lista todos os registros
        System.out.println("Registros restantes:");
        for (Produto produto : lista) {
            System.out.println("ID: " + produto.getId() + ", Descrição: " + produto.getDescricao());
        }
    }
}
