package logic;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class WorkWithFile {

    private void writeToFile(File file, String text){
        try (OutputStream os = new FileOutputStream(file)) {
            os.write(text.getBytes());
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile(File file){
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
    }

    private void writeToFileParameters(File outputFileParameters, File inputFile){
        try (OutputStream os = new FileOutputStream(outputFileParameters)) {
            os.write(("Абсолютный путь: " + inputFile.getAbsolutePath() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Имя файла: " + inputFile.getName() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Просмотр файла: " + inputFile.canExecute() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Чтение файла: " + inputFile.canRead() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Изменение файла: " + inputFile.canWrite() + "\n").getBytes(StandardCharsets.UTF_8));
            os.write(("Скрытый файл: " + inputFile.isHidden() + "\n").getBytes(StandardCharsets.UTF_8));


            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws UnsupportedEncodingException, IOException {

        WorkWithFile wwFile = new WorkWithFile();

        File inputFile = new File("C:\\ControlWork2\\src\\main\\resources\\input\\Shantaram.txt");
        File outputFileParameters = new File("C:\\ControlWork2\\src\\main\\resources\\output\\OutputFileParameters.txt");


        System.out.println("write file");
        wwFile.writeToFileParameters(outputFileParameters, inputFile);

        System.out.println("read file");
        wwFile.readFromFile(inputFile);

        //for (int i = 0; i < file.length(); i++) {

            //if (file.equals());
            //if (Character.UnicodeBlock.of(file).equals(Character.UnicodeBlock.CYRILLIC)) {
            //    return ;
            //}
    // Добавляю комментарий для создания комментария
        // Добавляю комментарий для создания комментария еще раз

        //}

        /*String text = "Hello, меня зовут Дима";
        ArrayList cyrillicArray = new ArrayList(Arrays.asList("м, н, з"));
        for (int i = 0; i < file.length(); i++) {
            for (int j = 0; j < cyrillicArray.size(); j++) {
                if (text.contains((CharSequence) cyrillicArray.get(i))){
                    System.out.print(text.charAt(i));
                }
            }
        }*/


        
        

    }

}
