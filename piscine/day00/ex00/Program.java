public class Program {
    public static void main(String[] args) {

        int result;


        int num = 479598;
        int sum = 0;
        result = 0;

        while (num > 0)
        {
            result = result + num % 10;
            num = num / 10;
        }
        System.out.println(result);
    }
}
