public class Card {
    private int rank;
    private String suit;
    public Card(int r, String s) {
        if(r==0 || s==null)
            throw new IllegalArgumentException();
        rank = r; 
        suit = s;
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Card)) return false;
        Card c = (Card) obj;
        return rank == c.rank && suit.equals(c.suit);
    }
    @Override 
    public int hashCode(){
        return rank;
    }

    @Override
    public String toString(){
        return "[ "+ this.rank + " | " + this.suit + " ]";
    }

    public static void main(String []args) {
        Card c = new Card(10, "011");
        Card b = new Card(10, "012");
        System.out.println("Card b: " + b + " HashCode : " + b.hashCode());
        System.out.println("Card c: " + c + " HashCode : " + c.hashCode());
    }
}