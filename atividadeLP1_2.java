import java.util.Scanner;
public class atividadeLP1_2 {
    public static Scanner scan = new Scanner(System.in);
    public static int numero = 0; 
    public static String nomes[] = {" ", " ", " "};
    public static String retornado = " ";
    public static void main(String[] args) {
        int z = 0;
        for(z=0; z<3; z++){
            System.out.print("Insira um nome: ");
            nomes[z] = scan.nextLine();
        }
        vetor();
        matriz();
    }
    public static void vetor() {
        int i = 0;
        int j = 0;
        System.out.print("Nomes digitados: ");
        for(i=0; i<3; i++){
            System.out.print(nomes[i] + " ");
        }
        System.out.println(" ");
        for(j=0; j<4; j++) {
            retorno(retornado);
        }
    }
    public static void matriz(){
        int x = 0;
        double contas[][] = {{0, 0, 0, 0}, {0, 0, 0, 0} ,{0, 0, 0, 0}, {0, 0, 0, 0}};
        for(x=1; x<4; x++) {
            System.out.println("Insira um número");
            contas[0][x] = scan.nextInt();
        }
        System.out.println("0.0 " + contas[0][1] + " " + contas[0][2] + " " + contas[0][3]);
        System.out.println(contas[0][1] + " " + (contas[0][1] * contas[0][1]) + " " + (contas[0][1] - contas[0][2]) + " " + (contas[0][1] - contas[0][3]));
        System.out.println(contas[0][2] + " " + (contas[0][2] - contas[0][1]) + " " + (contas[0][2] * contas[0][2]) + " " + (contas[0][2] - contas[0][3]));
        System.out.println(contas[0][3] + " " + (contas[0][3] - contas[0][1]) + " " + (contas[0][3] - contas[0][2]) + " " + (contas[0][3] * contas[0][3]));
    }
    public static String retorno(String retornado){
            System.out.print("Digite um número: ");
            numero = scan.nextInt();
            if (numero == 1){
                System.out.println(nomes[0]);
            } else if (numero > 1 && numero <= 10) {
                System.out.println(nomes[1]);
            } else if (numero > 10) {
                System.out.println(nomes[2]);
            } else {
                System.out.println("Opção inválida...");
            }
            return retornado;
    }
}
