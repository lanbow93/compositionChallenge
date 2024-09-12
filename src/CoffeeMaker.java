public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    private void brewCoffee(){
        if(this.hasWorkToDo){
            System.out.println("Coffee is currently brewing");
            this.hasWorkToDo = false;
        }
    }
}
