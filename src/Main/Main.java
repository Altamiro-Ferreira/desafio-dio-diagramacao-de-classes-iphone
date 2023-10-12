package Main;

import java.util.Scanner;
import iPhone.iPhone;

public class Main {
    public static void main(String[] args) {
iPhone iphone = new iPhone();
        Scanner scanner = new Scanner(System.in);

        int escolha;
        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Reprodutor de Música");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Sair");

            System.out.print("Digite o número da opção desejada: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    // Reproduzir Música
                    System.out.println("REPRODUTOR DE MÚSICA INICIALIZADO!");
                    iphone.selecionarMusica();
                    iphone.tocarMusica();
                    iphone.pausarMusica();
                    break;
                case 2:
                    // Aparelho Telefônico
                    System.out.println("APARELHO TELEFÔNICO INICIALIZADO!");
                    iphone.atender();
                    iphone.ligar();
                    iphone.desligar();
                    iphone.iniciarCorreioVoz();
                    break;
                case 3:
                    // Navegador de Internet
                    System.out.println("NAVEGADOR DE INTERNET INICIALIZADO!");
                    iphone.exibirPagina();
                    iphone.atualizarPagina();
                    iphone.adicionarNovaAba();
                    iphone.fecharPagina();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        // Feche o Scanner quando não for mais necessário
        scanner.close();
    }
}
