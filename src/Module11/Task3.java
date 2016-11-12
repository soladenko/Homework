package Module11;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("Word1", "Change Word1");
        map.put("Word5", "Change word5");
        fileContentReplacer(map);
    }
    static File fileContentReplacer(Map<String, String> map) throws Exception {
        File file = new File("/Users/SO/IdeaProjects/JavaGoIt_sergei/src/Module11/Module11HW.txt");
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + System.lineSeparator());
        }
        stringBuilder.append("\n");
        reader.close();
        System.out.println(stringBuilder);
        // System.out.println();
        String string = stringBuilder.toString();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            string = string.replaceAll(entry.getKey(), entry.getValue());
        }

        Writer writer = new FileWriter(file,true);
        writer.write(string);
        writer.close();
     //   Writer writer = new FileWriter(file);
     //   writer.write(string);
     //   writer.close();


        return file;
    }
}
