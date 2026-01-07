class DataOperations
{
    public static void main(String[] args)
    {
        int length = 15;
        int width = 4;
        int sum = length + width;
        int difference = length - width;
        int product = length * width;
        int quotient = length / width;
        int remainder = length % width;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        length++;
        width--;
        System.out.println("Incremented Length = " + length);
        System.out.println("Decremented Width = " + width);
    }
}
