package logic;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class WorkWithFile {

    private void writeToFile(String path){
        try (OutputStream os = new FileOutputStream("C:\\ControlWork2\\src\\main\\resources\\output\\OutputFileParameters.txt")) {


            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     private String readFromFile(File inputFile){
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ControlWork2\\src\\main\\resources\\input\\Shantaram.txt"), "utf-8"))){
            int buff;
            while((buff =br.read())>-1){
                sb.append((char)buff) ;
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private void writeToFileParameters(File outputFileParameters, File inputFile){
        try (OutputStream os = new FileOutputStream(outputFileParameters)) {
            os.write(("Абсолютный путь: " + inputFile.getAbsolutePath() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Имя файла: " + inputFile.getName() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Просмотр файла: " + inputFile.canExecute() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Чтение файла: " + inputFile.canRead() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Изменение файла: " + inputFile.canWrite() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Скрытый файл: " + inputFile.isHidden() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Размер файла: " + inputFile.length()/1024 + "KB" + "\n").getBytes(StandardCharsets.UTF_8));

            os.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        WorkWithFile wwFile = new WorkWithFile();

        File inputFile = new File("C:\\ControlWork2\\src\\main\\resources\\input\\Shantaram.txt");
        File outputFileParameters = new File("C:\\ControlWork2\\src\\main\\resources\\output\\OutputFileParameters.txt");
        File outputStringParameters = new File("C:\\ControlWork2\\src\\main\\resources\\output\\OutputStringParameters.txt");

        System.out.println("write file");
        wwFile.writeToFileParameters(outputFileParameters, inputFile);

        System.out.println("read file");
        wwFile.readFromFile(inputFile);

        String text = wwFile.readFromFile(inputFile);

        /*long countSpaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.contains(" ")){
                countSpaces++;
            }
        }

        // Знаки препинания - [ . , ; : ... ! ? - " ( ) ]

        List listSymbols = Arrays.asList(".", ",", ";", ":", "...", "!", "?", "-", "\"", "(", ")");
        Pattern pattern = Pattern.compile("[ ,.!?]");

        long countSymbols = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.contains("!")){
                //System.out.println(text.charAt(i));
                countSymbols++;

            }
        }
        System.out.println(countSymbols);
        System.out.println(text.length());*/

        try {

            FileWriter fw = new FileWriter(outputStringParameters);

            fw.write("Предложений в файле: " + Integer.toString(text.split("[.!?]").length) + "\n");
            fw.write("Слов в файле: " + Integer.toString(text.split(" ").length) + "\n");
            //fw.write("Количество пробелов: " + countSpaces + "\n");

            fw.close();

        } catch (IOException iox) {
            iox.printStackTrace();
        }


        //Content content = new Content(text.split("/.!?").length, text.split(" ").length, 0, 0, 0, 0);


        //for (int i = 0; i < file.length(); i++) {

            //if (file.equals());
            //if (Character.UnicodeBlock.of(file).equals(Character.UnicodeBlock.CYRILLIC)) {
            //    return ;
            //}


        //}


        /*ArrayList cyrillicArray = new ArrayList(Arrays.asList("м, н, з"));
        for (int i = 0; i < file.length(); i++) {
            for (int j = 0; j < cyrillicArray.size(); j++) {
                if (text.contains((CharSequence) cyrillicArray.get(i))){
                    System.out.print(text.charAt(i));
                }
            }
        }*/


        
        

    }

}
