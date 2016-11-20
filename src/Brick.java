
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by mrhri on 25.10.2016.
 */
public class Brick {

    int length = 25;
    int width = 12;
    int height = 6;
    double price = 1.55;
    double area_brick = length*height;
    Scanner reader = new Scanner(System.in);

    public void area (){
        System.out.println("Введите число кирпичей :");
        Double a = reader.nextDouble();
        if(a < 50){
            System.out.println("Из этого количества дом не построишь :(");
            System.out.println("Для постройки дома нужно минимум 50 кирпичей...");
            area();
        }else {
            double need_bricks_for_one_wall = a / 4;
            double area_wall = need_bricks_for_one_wall * area_brick;
            double area_m = area_wall * 6 / 10000;
            DealPlank plank = new DealPlank();
            Tile tile = new Tile();
            int for_down_wall = (int) Math.ceil(area_wall / tile.area_tile);
            int for_up_wall = (int) Math.ceil(area_wall / plank.plank_area); //Округляем до целого большего числа потому,
            // что пол ракушняка никто не продаст.

            System.out.print("Площадь = " + area_m + "³ метров. + Для стройки крыши и пола еще понадобиться " + for_up_wall);
            System.out.println(" брусков и "+for_down_wall+" плит.");
            System.out.print("Стоимость за кирпичи = ");
            System.out.printf("%.1f",price * a);
            System.out.println(" $\nСтоимость за бруски = " + plank.price * for_up_wall + " $");
            System.out.println("Стоимость за плиты = " + tile.price * for_down_wall + " $");
        }
    }

}
