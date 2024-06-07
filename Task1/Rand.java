import java.util.*;
public class Rand extends subRandom{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of attempts:");
        int at=s.nextInt();
        subRandom s1=new subRandom();
        s1.func(at);
    }
}
class subRandom{
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        void func(int att){
        int r1=r.nextInt(100);
        System.out.println("Guess the generated number:");
        int r2=s.nextInt();
        int score_att=1;
        if(att==1)
        {
            System.out.println("The number of attempts completed.");
            System.out.println("Do you want to continue for another round:(If yes enter 1 otherwise enter 0)");
            int rnd=s.nextInt();
            if(rnd==1){
                    System.out.println("Enter the number of attempts:");
                    int at1=s.nextInt();
                       func(at1);
            }
            
        }

        else if(r1==r2){
            System.out.println("Your guess is right..........You entered number is matched with generated number");
            System.out.println("This round won by "+score_att+" attempts.");
            System.out.println("Do you want to continue for another round:(If yes enter 1 otherwise enter 0)");

            int rnd1=s.nextInt();
            if(rnd1==1){
                    System.out.println("Enter the attempts:");
                    int at2=s.nextInt();
                    func(at2);
            }
        }
        else
        {
            if(r1<r2){
                System.out.println("The generated number is: "+r1);
                System.out.println("The Guess is wrong.........And it is too high");
                    att=att-1;
                    func(att);
                    score_att+=1;
            }
            else{
                System.out.println("The generated number is: "+r1);
                System.out.println("The Guess is wrong.........And it is too low");
                    att=att-1;
                    func(att);
                    score_att+=1;
            }
        }
        }
}
