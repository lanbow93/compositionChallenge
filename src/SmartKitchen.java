public class SmartKitchen {
    CoffeeMaker mrCoffee = new CoffeeMaker(false);
    Refrigerator mrFreeze = new Refrigerator(false);
    DishWasher mrClean = new DishWasher(true);

    public SmartKitchen(CoffeeMaker mrCoffee, Refrigerator mrFreeze, DishWasher mrClean){
        this.mrCoffee = mrCoffee;
        this.mrFreeze = mrFreeze;
        this.mrClean = mrClean;
    }
}
