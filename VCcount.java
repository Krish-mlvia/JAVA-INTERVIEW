public class VCcount {
    public static void main(String[] args) {
        String str = "hello world";
        int vowels = 0, consonents = 0;

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch)!= -1)
                    vowels++;
                else
                    consonents++;
            }
        }
        System.out.println("vowels " + vowels);
        System.out.println("consonents " + consonents);
    }
}
