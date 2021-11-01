import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializableMain {
    private final static String FILEPATH = "C:/Users/Fisker/Desktop/HWtest.json";
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        File file = new File(SerializableMain.FILEPATH);

        System.out.println("Сколько человек вы хотите сериализовать?");
        int count = SCANNER.nextInt();

        List<People> peopleList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите оценку: ");
            int mark = SCANNER.nextInt();
            System.out.println("Введите имя учителя: ");
            String teacherName = SCANNER.next();

            PeopleMark peopleMark = new PeopleMark(mark, teacherName);

            System.out.println("Введите имя: ");
            String name = SCANNER.next();
            System.out.println("Введите возраст: ");
            int age = SCANNER.nextInt();

            People people = new People(age, name, peopleMark);
            peopleList.add(people);
        }

        for (int i = 0; i < peopleList.size(); i++) {
            serializePeopleToFile(peopleList.get(i), file);
        }

        List<People> peoples = deserializePeoples(file);
        for (int i = 0; i < peoples.size(); i++) {
            System.out.println(peoples.get(i));
        }
    }

    private static void serializePeopleToFile(People people, File file) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(people);

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(json);
        fileWriter.write("\n");
        fileWriter.close();
    }

    private static List<People> deserializePeoples(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();

        Gson gson = new Gson();
        List<People> peopleList = new ArrayList<>();

        while (line != null) {
            People people = gson.fromJson(line, People.class);
            peopleList.add(people);
            line = bufferedReader.readLine();
        }

        return peopleList;
    }
}