import java.util.Scanner;

public class Sentinel_value {
    public static void main(String[] args) {

        int Sum=0;

        Scanner input=new Scanner(System.in);
//

        String letter= "";
        while (!letter.equalsIgnoreCase("N")){
            System.out.println("Enter a number,please ");
            int number= input.nextInt();
            Sum=Sum+number;
            System.out.println("press any key to continue or  press (n) to See the SUM");
            letter= input.next();
        }
        System.out.println(" the sum of the numbers you entered before is"   +Sum);



}
}