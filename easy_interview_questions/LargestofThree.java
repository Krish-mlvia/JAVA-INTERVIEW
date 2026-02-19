public class LargestofThree {
    public static void main(String[] args) {
        int a =10, b=20, c=5;

        int largest = a;

        if(b> largest)
            largest = b;
        if (c> largest) 
            largest =c;
        
        System.out.print("largest number is =" +largest);    
    }
}
