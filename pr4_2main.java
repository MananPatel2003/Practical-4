
public class pr4_2main {

    public static void main(String[] args) {
        int a = -2;
        try {
            if (a < 0) {
                throw new pr4_2("The number cannot be negative.");
            }
        } catch (pr4_2 e) {
            System.out.println(e);
        }
    }
}