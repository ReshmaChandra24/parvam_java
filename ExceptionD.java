public class ExceptionD {
public static void main(String[] args) {

    try {

            int[] accountIds = {101, 102, 103};

            System.out.println(accountIds[5]);

        }

        catch (ArrayIndexOutOfBoundsException |
        		NullPointerException e) {

            System.out.println("Account data error.");
        }

        catch (Exception e) {

            System.out.println("System error occurred");
        }
    }
}