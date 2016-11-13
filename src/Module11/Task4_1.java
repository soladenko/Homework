package Module11;



import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4_1 {

    public static void main(String[] args)  {
        String str = "Word1";
        System.out.println(checkWord(str));
    }

    static int checkWord(String word) {

        File file = new File("/Users/SO/IdeaProjects/JavaGoIt_sergei/src/Module11/Module11HW.txt");
        BufferedReader reader;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (Exception e){
            System.out.println("Can not find the file");
            return  0;
        }
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line + System.lineSeparator());
            }
            reader.close();
        } catch (Exception e){
            System.out.println("Can not open the file");
            return 0;
        }
        String str = stringBuilder.toString();
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);
        int countCharacter = 0;
        while(matcher.find()) {
            countCharacter++;
        }
        return countCharacter;
    }
    }

