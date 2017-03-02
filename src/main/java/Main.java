import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatNumber = scanner.nextInt();
        int coup1 = 0,coup2 = 0;
        for(int i = 0; i < greatNumber; i++){
            int money = scanner.nextInt();
            if(money == 0){
                coup1 = coup1 + 1 ;
            }
            else{
                coup2 = coup2 + 1;
            }
        }
        if(coup1 < coup2){
            System.out.println(coup1);
        }
        else{
            System.out.println(coup2);
        }

    }
}
