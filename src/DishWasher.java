public class DishWasher {
    boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    private void doDishes(){
        if(this.hasWorkToDo){
            System.out.println("Dishes are being washed");
            this.hasWorkToDo = false;
        }
    }

}
