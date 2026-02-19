public class ArmstrongNumber {
    public static void main(String[] args) {
        int num =153;
        int original = num;
        int sum =0;

        while(num!=0){
            int digit = num%10;
            sum+= digit*digit*digit;
            num/=10;
        }
        if(original == sum)
            System.out.println("armstrong number");

        else
            System.out.println("not an armstrong number");
    }
    
}
