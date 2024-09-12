public class Refrigerator {
    private boolean hasWorkToDo;
    public Refrigerator(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    private void orderFood(){
        if(this.hasWorkToDo){
            System.out.println("Ordering food for the fridge.");
            this.hasWorkToDo = false;
        }
    }


}
