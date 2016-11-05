package Module10;


public class Task4 {
    public static void main(String[] args) {

        f();
    }

    private static void f() {
        try {
            g();
        } catch (NumberFormatException e) {
            System.out.println("Error1");
        } catch (Exception e) {
        }
    }

   private static void g() throws Exception{
       throw new Exception("This is wrong");
   }
}
