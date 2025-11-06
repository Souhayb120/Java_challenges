
// challenge 01
import java.util.Arrays;
import java.util.Scanner;
/*public class Main {
    public static void main (String[] args){
        Scanner test = new Scanner (System.in);

        System.out.println("entre votre nom : ");
        String nom= test.nextLine();
        System.out.println("bonjour " +nom);
        test.close();
    }
}

// challenge 02

public class Main {
    public static void main (String[] args){
        Scanner test = new Scanner (System.in);
        System.out.println("entre un number  : ");
        int number = test.nextInt();
        for (int i = number ; i >= 0; i--) {
            System.out.println(i);
        }
    }
}



// challenge 03 :


 // 0 to 10

public class Main {
    public static void main (String[] args){
        Scanner test = new Scanner (System.in);
        int randomNum = (int)(Math.random() * 10);

        System.out.println("enter your guess");
        int  userGuess = 0;
        while(userGuess != randomNum)
        {
            userGuess = test.nextInt();
            if(userGuess < randomNum)
            {
                System.out.println("too small then the guess number ");
            }else if(userGuess > randomNum){
                System.out.println("too big then the guess number ");
            }else{
                System.out.println("congrats");
            }
        }
    }
}



//challenge 04 :



public class Main {

         public static int sold = 0;

    static int consulterSold() {
        return  sold;
    }
    static int depot() {

        System.out.println("how much money would you like to depot? ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        return sold += money;
    }
    static int Retrais() {

        System.out.println("how much money would you like to withdraw? ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        return sold -= money;
    }
    public static int menu() {
        Scanner test = new Scanner (System.in);
        System.out.println("1 .consulter le sold ");
        System.out.println("2 .depot ");
        System.out.println("3 .Retrais ");
        System.out.println("4 .Quitter ");
        int userGuess = test.nextInt();
        return userGuess;
    }
    public static int menu = menu();
    public static void main (String[] args){


while (menu != 0){
    int menu = menu();
        switch (menu)
        {
            case 1:
                System.out.println(consulterSold());
                break;
                case 2:
                    depot();
                    break;
                    case 3:
                        Retrais();
                        break;
                        case 4:
                            System.exit(0);
                            break;
                            default:
                                System.out.println("Invalid menu");
                                break;
        }

            }
    }
}



// challenge 06


public class Main
{

   static int[] myNum = {10, 20, 30, 40};
    public static void main (String[] args)
    {
        int lastIndex = myNum.length - 1;
        int[] newNum = new int[myNum.length];
        for(int i = myNum.length - 1 ; i >= 0   ;i--){
            newNum[lastIndex -  i] = myNum[i];
        }
        System.out.println(Arrays.toString(newNum));
    }
}



// challenge 05

public class Main {
    static int[] myNum = {10, 20, 30, 40};
    public static void main(String[] args) {
        int max = myNum[0];
        int secondMax =  myNum[0];
        for(int i = 0; i < myNum.length; i++){
            if(myNum[i] > max){
                secondMax = max;
                max = myNum[i];
            }


            }
        System.out.println(secondMax);
        }
    }

       // challenge 07
    public class Main {
    public static void main(String[] args) {
        
    int[] arr = {5, 3, 3, 5, 3,2};
    HashMap<Integer, Integer> count = new HashMap<>();
    for (int num : arr) {
    if(count.containsKey(num)){
        count.put(num,count.get(num) + 1);
    }else{
        count.put(num,1);
    };
}
   System.out.println(count);
    }
    }

    
    // challenge 07
    public class Main {
    public static void main(String[] args) {
   int[] arr = {1, 2, 3,4,7,8,5};
int target = 7;
for (int start = 0; start < arr.length; start++) {
    int sum = 0; 
    for (int end = start; end < arr.length; end++) {
        sum += arr[end]; 
        if(sum == target){
      for(int i = start ; i <= end ;i++){
          System.out.println(arr[i]);
      }
        }
    }
}
    }
    }
*/



