import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mrhri on 25.10.2016.
 */
public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Добро пожаловать на стройку!");
        Menu();

    }


    public static void Menu() throws IOException {

        System.out.println("Выберите номер материла из которого хотите построить дом");
        System.out.println("1. Кирпичи;\n2. Ракушка;\n3. Битонная плита;\n4. Брус(доска);");

        String var  = reader.readLine();
        switch (var){
            case "1":
                Brick brick = new Brick();
                brick.area();
                quest();
                break;
            case "2":
                Rakushka rak = new Rakushka();
                rak.area();
                quest();
                break;
            case "3":
                Tile tile = new Tile();
                tile.area();
                quest();
                break;
            case "4":
                DealPlank plank = new DealPlank();
                plank.area();
                quest();
                break;
            default:
                System.out.println("пока");
        }

    }
    public static void quest() throws IOException {
        System.out.println("Желаете построить еще один дом?\n1. Да\n2. Нет");
        String answer = reader.readLine();
        switch(answer){
            case "1":
                Menu();
                break;
            case "2":
                System.exit(0);
                break;
            default:
                System.out.println("Введите правильный номер ответа!");
                quest();
                break;
        }
    }

}
