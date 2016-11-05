package Module10;


public class Task1 extends Exception {

    public static void main(String[] args) {

        try {
            throw new Exception();

        }catch (Exception e){
            System.err.println("Exeption");

        }finally {
            System.out.println("finally");
        }
    }
}
