import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        System.out.println(checkPrime(number));

    }
    public static String checkPrime(int number){
        String str="";
        if (number<=1){
            str = number+ " is not prime";
        }else if(number==2){
            str = number+" is prime";
        }else if (number>2){
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number%i==0){
                    return str = number + " is not prime";
                }
            }
            return str =number+ " is prime";
        }
        return str;
    }
}
