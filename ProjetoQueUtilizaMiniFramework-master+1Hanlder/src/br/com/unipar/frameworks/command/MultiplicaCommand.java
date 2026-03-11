package br.com.unipar.frameworks.command;

public class MultiplicaCommand implements Command {

    @Override
    public String getName() {
        return "multiplica";
    }

    @Override
    public void execute(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int resultado = a * b;

        System.out.println("Resultado: " + resultado);
    }
}SS