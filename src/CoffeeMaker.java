public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    private void brewCoffee(){
        if(this.hasWorkToDo){
            System.out.println("Coffee is currently brewing");
            this.hasWorkToDo = false;
        } else {
            System.out.println("Coffee machine needs water to brew.");
        }
    }
}
