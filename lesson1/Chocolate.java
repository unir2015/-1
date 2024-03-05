package lesson1;

public class Chocolate extends Product {

    private double calories; //Содержание колории
    private String chocolateType; //Тип шоколата (молочный, горкий)

    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    
    public String getChocolateType() {
        return chocolateType;
    }
    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    public Chocolate(String brand, String name, double price, double calories, String chocolateType) {
        super(brand, name, price);
        this.calories = calories;
        this.chocolateType = chocolateType;
    }



    public String displayInfo(){
        return String.format("Шоколад\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалории: %.2f\n\tТип шиколата: %s]",
                            brand, name, price, calories, chocolateType);
    }

    
}
