public class SumDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum =0;

        while(num!=0){
            int digits = num%10;
            sum =sum + digits;
            num = num/10;
        }
        System.out.println("Sum of digits: " + sum);
    }
    
}
