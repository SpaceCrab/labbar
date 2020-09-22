import java.util.Scanner;
public class MaxNumber{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //create scanner for input

    System.out.println("Ange tal 1: "); //read first number
    int nbr1 = input.nextInt();

    System.out.println("Ange tal 2: "); //read second number
    int nbr2 = input.nextInt();

    System.out.println("Ange tal 3: "); //read the third number
    int nbr3 = input.nextInt();

    //kontrollerar vilken av talen som är störst
    if(nbr1==nbr2 && nbr1==nbr3){
      System.out.println("Talen är lika stora!");
    }
    else if(nbr1>nbr2 && nbr1 > nbr3){
      System.out.println("Tal 1 är störst!");
    }
    else if(nbr2>nbr1 && nbr2 > nbr3){
      System.out.println("Tal 2 är störst!");
    }
    else if(nbr3>nbr2 && nbr3 > nbr1){
      System.out.println("Tal 3 är störst!");
    }

    //kontrollerar om någon av talen är lika stora
    if (nbr1 == nbr3) {
      System.out.println("tal2 och tal3 är lik stora");
    }
    if (nbr2 == nbr3) {
      System.out.println("tal2 och tal3 är lik stora");
    }
    if (nbr2 == nbr1) {
      System.out.println("tal 2 och tal 1 är lik stora");
    }
  }
}
