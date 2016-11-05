package Module10;

public class Task5 {

    public static void main(String[] args) {

        try {
            throw new NullPointerException();

        }catch (NullPointerException e){
            System.out.println(e);


            try {
                throw new IndexOutOfBoundsException();

            }catch (IndexOutOfBoundsException e1){
                System.out.println(e1);

                try {
                        throw new Exception();

                    } catch (Exception e2) {
                        System.out.println(e2);
                    }
                }
            }

        }
    }




