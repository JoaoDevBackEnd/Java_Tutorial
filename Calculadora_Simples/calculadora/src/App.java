import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
           Scanner read= new Scanner(System.in);
       
        //VARIAVEL PARA O LOOP ENQUANTO FOR TRUE CONTINUA A REPETIR
        boolean verfi=true;
    while(verfi)
        {
            int a,b;
            System.out.println("Digite a operação que você deseja? \n");

            System.out.println("1- Soma \n");
            System.out.println("2- Subtração \n");
            System.out.println("3- Divisão \n");
            System.out.println("4- Multiplicação \n");
            System.out.println("0- SAIR DO PROGRAMA \n");
            int operation=read.nextInt();
           

            //A variavel Operation verifica qual operação matématica o usuário quer 
            switch(operation)
            {
                // CASO ELE DIGITE 0 PARA SAIR DO PROGRAMA A VARIAVEL verfi SE TORNA false, ENTÃO O PROGRAMA É ENCERARDO
                case 0:
                    System.out.println("Obrigado por utilizar minha calculadora");
                    verfi=false;
                    break;
                // CASO operation SEJA 1 IRÁ FAZER UMA OPERAÇÃO DE ADIÇÃO COM AS ENTRADAS DO USUÁRIO
                case 1:
                    System.out.println("Digite primeiro Número");
                        a=read.nextInt();
                    System.out.println("Digite segundo Número");
                        b=read.nextInt();

                        int soma_add= a+b;
                        System.out.println("Resultado: "+soma_add);
                break;
                // CASO operation SEJA 2 IRÁ FAZER UMA OPERAÇÃO DE SUBTRAÇÃO COM AS ENTRADAS DO USÁRIO
                case 2:
                   
                    System.out.println("Digite primeiro Número");
                        a=read.nextInt();
                    System.out.println("Digite segundo Número");
                        b=read.nextInt();

                        int soma_sub= a - b;
                        System.out.println("Resultado: "+soma_sub);
                break;
                  // CASO operation SEJA 3 IRÁ FAZER UMA OPERAÇÃO DE DIVISÃO COM AS ENTRADAS DO USÁRIO
                case 3:
                  
                    System.out.println("Digite primeiro Número");
                        a=read.nextInt();
                    System.out.println("Digite segundo Número");
                        b=read.nextInt();

                        int soma_div= a / b;
                        System.out.println("Resultado: "+soma_div);
                break;
                  // CASO operation SEJA 4 IRÁ FAZER UMA OPERAÇÃO DE MULTIPLICAÇÃO COM AS ENTRADAS DO USÁRIO
                case 4:
                    
                    System.out.println("Digite primeiro Número");
                        a=read.nextInt();
                    System.out.println("Digite segundo Número");
                        b=read.nextInt();

                        int soma_mult= a * b;
                        System.out.println("Resultado: "+soma_mult);
                break;
                  // CASO operation SEJA DIFERENTE DO PROPOSTO O PROGRAMA RENICIARA PARA REPETIR A PERGUNTA PRO USUÁRIO 
                default:
                System.out.println("Escolha uma opção válida");
                break;

            }

        }
    
    
    }
}
