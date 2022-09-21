public class pr4_3 {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 114 / 0;
            a[6] = 6;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } finally {
            System.out.println("Message in finally: There are multpile catch blocks.");
        }
    }
}