import java.util.Scanner;
public class ATM{
        public static void main(String args[]){
        UserAccount u=new UserAccount();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter initial account balance: ");
        double amount=s.nextDouble();
        int ch=1;
        do{
        System.out.println("1.Withdraw \n2.deposit\n3.CheckBalance");
        System.out.println("Enter option: ");
        int op=s.nextInt();
        switch (op) {
            case 1: 
                amount= u.Withdraw(amount);    
                break;
            case 2: 
                amount=u.deposit(amount);
                break;
            case 3:
                u.checkBalance(amount);
                break;
            default: 
                System.out.println("Enter valid option.");
                break;
        }
        System.out.println("Do You want to open options again:(If yes enter 1/ otherwise enter any one):");
        ch=s.nextInt();
    }while(ch==1);

}
}
class UserAccount {
            Scanner s=new Scanner(System.in);
            double Withdraw(double am){
            System.out.println("Enter amount to Withdrawl: ");
            double wamount=s.nextDouble();
            if (wamount<=am){
            am=am-wamount;
            return am;
            }
            else
            {
                System.out.println("Insufficient Balance.");
            }
            return 0;
        }
        double deposit(double am){
            System.out.println("Enter amount to deposit:");
            double damount=s.nextDouble();
            am+=damount;
            return am;
        }
        void checkBalance(double amount){
            System.out.println("The available balance :"+amount);
        }
}
