public class Die {

    //Private variables; inaccessible without get methods
    private int numOfSides;
    private int sideUp;
    
    //Makes a 6 sided die
    public Die() {
        this.numOfSides = 6;
        this.sideUp = 1;
    }
    
    //Makes a die with the given number of sides
    public Die(int numOfSides) {
        if (numOfSides <= 0) {
            throw new IllegalArgumentException();
        }
        this.numOfSides = numOfSides;
        this.sideUp = 1;
    }
    
    // Get methods ("getters") required to access private variables;
    public int getSides() {
        return this.numOfSides;
    }
    
    public int getSideUp() {
        return this.sideUp;
    }
    
    public void roll() {
        // Math.random returns a double between 0 and 0.999...
        // Multiply and add with random to create a given range
        this.sideUp = (int) (Math.random() * this.numOfSides + 1);
    }
    
    public String toString() {
        return "[Sides: "+ this.numOfSides + ", rolled side: " + this.sideUp + "]";
    }
    
    // Returns true of the this die and the given die have the same number of sides 
    // and the same side up
    public boolean equals(Die secondDie) {
        return (this.numOfSides == secondDie.getSides()) && (this.sideUp == secondDie.getSideUp());
    }
    
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die(6);
        Die die3 = new Die(20);
        
        System.out.println(die1.toString());
        System.out.println(die2.toString());
        System.out.println(die3.toString());
        
        System.out.println("Die 1 == Die 2:" + die1.equals(die2));
        System.out.println("Die 1 == Die 3:" + die1.equals(die3));
        
        for (int i = 0; i < 5; i++) {
            die1.roll();
            die2.roll();
            die3.roll();
            
            System.out.println(die1.toString());
            System.out.println(die2.toString());
            System.out.println(die3.toString());
        }
    }
    
}
