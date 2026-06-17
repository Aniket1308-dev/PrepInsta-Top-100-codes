public class J10M1 {
    
    public static void main(String[]args)
{
    int num = 12345, sum=0;

    while (num!=0) {
        sum = sum + num % 10;
        num = num/10;

    }
  System.out.println("the sum is" + sum);

}
}
