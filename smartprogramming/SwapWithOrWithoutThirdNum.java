public class SwapWithOrWithoutThirdNum {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;
        System.out.println(" With Third Variable ");
        System.out.println(" a : " + a + " b : " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println(" a : " + a + " b : " + b);

        System.out.println(" Without Third Variable ");
        System.out.println(" a : " + a + " b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a : " + a + " b : " + b);

    }
}
