public class Bird {
    private int numberBags;
    boolean call;
    public void Bird(int num){
        this.numberBags = num;
    }
    public Bird(){
        call = false;
        Bird(2);
    }
    
    public static void main(String[] args){
        Bird bird = new Bird();
        System.out.print(bird.numberBags);
    }
}