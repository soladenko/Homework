package Module10;


public class Task2 extends Exception {
    String name;

    Task2(String name) {
        this.name=name;

    }

    public static void main(String[] args) {

        String string="Name";
        Task2 task2=new Task2(string);

            try {



            } catch (Exception e) {

            System.err.println(e.getMessage());

        }finally {
                System.out.println("In last block");
        }
    }


}
