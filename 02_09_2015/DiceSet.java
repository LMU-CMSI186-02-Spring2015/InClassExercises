public class DiceSet {
    private Die[] dice;
    
    public DiceSet() {
        this.dice = new Die[2];
        for (int i = 0; i < this.dice.length; i++) {
            this.dice[i] = new Die(6);
        }
    }
    
    public DiceSet(int numOfDice, int numOfSides) {
        if (numOfDice <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.dice = new Die[numOfDice];
            for (int i = 0; i < this.dice.length; i++) {
                this.dice[i] = new Die(numOfSides);
            }
        }
    }
    
    public Die[] getDice() {
        return this.dice;
    }
    
    public int getNumOfDice() {
        return this.dice.length;
    }
    
    public void roll() {
        for (int i = 0; i < this.dice.length; i++) {
            this.dice[i].roll();
        }
    }
    
    public int getSum() {
        int sum = 0; 
        for (Die die: this.dice) {
            sum += die.getSideUp();
        }
        return sum;
    }
    
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < this.dice.length; i++) {
            result = result + dice[i].getSideUp() + " ";
        }
        return result + "]";
    }
    
    public static void main(String[] args) {
        DiceSet diceSet1 = new DiceSet();
        DiceSet diceSet2 = new DiceSet(6, 4);
        
        System.out.println(diceSet1.toString());
        System.out.println(diceSet1.getSum());
        System.out.println(diceSet2.toString());
        System.out.println(diceSet2.getSum());
        
        for (int i = 0; i < 5; i++) {
            diceSet1.roll();
            diceSet2.roll();
            
            System.out.println(diceSet1.toString());
            System.out.println(diceSet1.getSum());
            System.out.println(diceSet2.toString());
            System.out.println(diceSet2.getSum());
            }
        
    }
}
