import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    int firstNum = in.nextInt();
    for (int i = 0; i < firstNum; i++){
      int num = in.nextInt();
      numbers.add(num);
    }
    
    int highestOccur = 0;
    int highestOccurNum = 0;
    
    for(Integer i : numbers){
        int occur = 0;
        for(int j = 0; j < numbers.size(); j++){
          if(i == numbers.get(j)){
            occur++;
          }
          if (occur > highestOccur){
            highestOccur = occur;
            highestOccurNum = i;
          }
        }
    }
    System.out.println(highestOccurNum);
  }
}
