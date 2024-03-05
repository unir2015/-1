package lesson1;

import java.util.ArrayList;

public class HomeWork {
        public static void main(String[] args) {

        Product  product1 = new Product("Brand #1", "Name #1", 350);
        // System.out.println(product1.displayInfo());

        product1.setPrice(-1400);
        product1.setName("~");
        // System.out.println(product1.displayInfo());



        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        // System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        // System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        // System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        // System.out.println(bottleOfMilk2.displayInfo());

        Product chocolate1 = new Chocolate("Альпен гольд", "шоколад #1", 550, 400.0, "Горкий");
        // System.out.println(chocolate1.displayInfo());

        Product chocolate2 = new Chocolate("Милковей ", "шоколад #2", 675, 600.0, "Молочный");
        // System.out.println(chocolate2.displayInfo());

        Product chocolate3 = new Chocolate("Белочка", "шоколад #3", 830,700.0, "С фундуком");
        // System.out.println(chocolate3.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(new BottleOfMilk("Brand #4", "Name #5", 310, 0.33, 1));
        list.add(chocolate1);
        list.add(chocolate2);
        list.add(chocolate3);

        VendingMachine vendingMachine = new VendingMachine(list);
        BottleOfWater bottleOfWaterRes =  vendingMachine.getBottleOfWater("Name #2", 1.5);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }


        
        Chocolate chocolate =  vendingMachine.getChocolate("шоколад #2", 600);
        if (chocolate != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolate.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в наличии");
        }



    }

}
    

