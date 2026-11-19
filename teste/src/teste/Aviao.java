package teste;

import java.util.Scanner;

public class Aviao {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Olá, " + nome + "! Bem-vindo ao Java.");
        }
    }

}
