import java.util.Scanner;

 class FirstLastDigit {
    public static void main(String args[]) 
   {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        int firstDigit = num;
        while (firstDigit >= 10) 
        {
            firstDigit= firstDigit/10;
        }

        
        int lastDigit = num%10;

        
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
