import textio.TextIO;

public class RollTwoPairs {
    public static void main(String[] args){
        PairOfDice dice1 = new PairOfDice();
        PairOfDice dice2 = new PairOfDice();
        int countRolls = 0;
        int total1, total2;
        System.out.println();
        do{
            dice1.setRoll();
            total1 = dice1.addDice();
            System.out.println("First pair comes up " + total1);

            dice2.setRoll();
            total2 = dice2.addDice();
            System.out.println("Second pair comes up " + total2);

            countRolls++;

            System.out.println();
        }while(total1 != total2);

        System.out.println("Winner! You got a double " + dice2.addDice());
        System.out.println();
        System.out.println("You played " + countRolls + " times.");

    }
}



class PairOfDice{
    private int die1;
    private int die2;

    public PairOfDice(){

    }

    public PairOfDice(int val1, int val2){
        die1 = val1;
        die2 = val2;
    }

    private void roll(){
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public void setRoll(){
        roll();
    }

    public int addDice(){
        int total = die1 + die2;
        return total;
    }

    public String getRoll(){
        return String.valueOf(die1) + " and " + String.valueOf(die2);
    }

}
