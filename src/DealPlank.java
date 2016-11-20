import java.util.Scanner;

/**
 * Created by mrhri on 26.10.2016.
 */
public class DealPlank {
    int length = 600;
    int height = 10;
    double price = 5.5;
    double plank_area = length*height;
    Scanner reader = new Scanner(System.in);

    public void area (){

        System.out.println("Введите число брусков :");
        Double a = reader.nextDouble();
        if(a < 50){
            System.out.println("Из этого количества дом не построишь :(");
            System.out.println("Для постройки дома нужно минимум 50 брусков...");
            area();
        }else {
            double need_rakushka_for_one_wall = a / 5;
            double area_wall = need_rakushka_for_one_wall * plank_area;
            double area_m = area_wall * 6 / 10000;

            DealPlank plank = new DealPlank();
            Tile tile = new Tile();

            int for_down_wall = (int) Math.ceil(area_wall/tile.area_tile);

            System.out.print("Площадь = " + area_m + "³ метров. + Для стройки пола еще понадобиться " + for_down_wall);
            System.out.println(" плит.");
            System.out.print("Стоимость за бруски = ");
            System.out.printf("%.1f",price * a);
            System.out.println(" $\nСтоимость за плиты = " + tile.price * for_down_wall + " $");
        }
    }
}
