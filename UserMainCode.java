import java.util.Scanner;

public class UserMainCode {
    public static String DigitsOrChar(String input1, int input2) {
        char[] arr = input1.toCharArray();

        int sum = 0,count=0;
        String sb ="";


        if (input2 == 1) {

            for (int i = 0; i < arr.length; i++) {
                if (Character.isAlphabetic(arr[i])) {
                    sb += arr[i];
                    count++;
                }
            }
            if(count>0) {
                System.out.println(sb);
            }
            else if(input1.isEmpty()) {
                System.out.println("NULL");
            }
            else {
                System.out.println("ZERO");
                }
        }
        if (input2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (Character.isDigit(arr[i])) {
                    sum += (Character.getNumericValue(arr[i]));
                    count++;
                }
            }
            if (count > 0) {
                sb = Integer.toString(sum);
                System.out.println(sb);
            } else {
                System.out.println("ZERO");
            }
        }
        return null;
    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input1:");
        String input1=sc.nextLine();
        System.out.println("Input2:");
        int input2=sc.nextInt();
        DigitsOrChar(input1,input2);

    }
}
