import java.util.Scanner;

public class PredecessorAndSuccessor {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
            int Number = scanner.nextInt();
            int NumberPred = Number - 1;
            int NumberSuc = Number + 1;
            String Space = " ";
            PAndS(Number,NumberSuc,NumberPred,Space);
    }
    public static void PAndS(int Number , int NumberSuc , int NumberPred , String Space){

            System.out.println("O Antecessor é:" + Space + NumberPred + Space + "e o Sucessor é:" + NumberSuc);


    }
}
