import java.util.Scanner;

/**
 * Created by mrhri on 25.10.2016.
 */
public class Tile {

    int length = 600;
    int width = 150;
    int height = 20;
    double price = 156.5;
    double area_tile = length*width;
    Scanner reader = new Scanner(System.in);

    public void area (){
        System.out.println("Введите число плит :");
        Double a = reader.nextDouble();
        if(a < 24){
            System.out.println("Из этого количества дом не построишь :(");
            System.out.println("Для постройки дома нужно минимум 24 плиты...");
            area();
        }else {
            double need_tile_for_one_wall = a / 5;
            double area_wall = need_tile_for_one_wall * area_tile;
            double area_m = area_wall * 6 / 10000;

            DealPlank plank = new DealPlank();

            int for_up_wall = (int) Math.ceil(area_wall / plank.plank_area);

            System.out.print("Площадь = " + area_m + "³ метров. + Для стройки крыши еще понадобиться " + for_up_wall);
            System.out.println(" брусков.");
            System.out.print("Стоимость за плиты = ");
            System.out.printf("%.1f",price * a);
            System.out.println(" $\nСтоимость за бруски = "+plank.price * for_up_wall+" $");
        }
    }
}
