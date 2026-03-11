import br.com.unipar.frameworks.command.HelloCommand;
import br.com.unipar.frameworks.command.SomaCommand;
import br.unipar.frameworks.miniframework.Dispacher;
import br.unipar.frameworks.miniframework.Request;
import br.unipar.frameworks.miniframework.Response;
import br.com.unipar.frameworks.command.MultiplicaCommand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dispacher dispacher = new Dispacher();

        dispacher.registerCommand("hello", new HelloCommand());
        dispacher.registerCommand("soma", new SomaCommand());
        dispatcher.registerCommand("multiplica", new MultiplicaCommand());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo. Digite um comando " +
                "(ex: 'hello' ou 'soma') ou 'sair' para sair:");

        while (true) {
            System.out.println("> ");
            String input = scanner.nextLine();

            if ("sair".equals(input)) {
                System.out.println("Encerrando aplicação. Até logo!");
                break;
            }

            Request request = Request.fromInput(input);
            Response response = dispacher.dispatch(request);

            System.out.println(response);
        }

        scanner.close();

    }
}