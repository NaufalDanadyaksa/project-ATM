package Project;
import java.util.Scanner;
public class atm {
    public static void main(String[]args){
//    Declaration
        Scanner scanner=new Scanner(System.in);
        int pin, balance, transfer, deposit, withdraw,tf_Code;
        String tf_Name;
        char choose,confirm;
        balance=1000000;


//    PIN CHECK
        do {
            System.out.println("==========\nWELCOME TO THE ATM\n==========");
            System.out.println("ENTER YOUR PIN:");
            pin=scanner.nextInt();
        }while (pin!=123456);

//    MENU
        System.out.println("========== MENU ==========\n1.BALANCE\n2.DEPOSIT\n3.WITHDRAW\n4.TRANSSFER\n==========================");
        choose=scanner.next().charAt(0);

//    PROCESS
        switch (choose) {
            case '1':
                System.out.println("==========\nYOUR BALANCE:");
                System.out.println(balance);
                System.out.println("==========");
                break;
            case '2':
                System.out.println("==========\nENTER DEPOSIT AMOUNT:");
                deposit = scanner.nextInt();
                balance = balance + deposit;
                System.out.println("YOUR BALANCE:");
                System.out.println(balance);
                System.out.println("==========");
                break;
            case '3':
                System.out.println("==========\nENTER THE AMOUNT YOU WANT TO WITHDRAW:");
                withdraw = scanner.nextInt();
                if (withdraw <= balance && withdraw > 0) {
                    balance = balance - withdraw;
                    System.out.println("YOU HAVE SUCCESSFUL WITHDRAWAL OF MONEY: " + withdraw + "\n YOUR REMAINING BALANCE: " + balance);
                } else {
                    System.out.println("YOUR BALANCE IS NOT ENOUGH");
                }
                System.out.println("==========");
                break;
            case '4':
                System.out.println("==========\nENTER RECIPIENT'S NAME:");
                scanner.nextLine();
                tf_Name = scanner.nextLine();
                System.out.println("ENTER THE DESTINATION CODE:");
                tf_Code = scanner.nextInt();
                System.out.println("ENTER THE AMOUNT OF MONEY YOU WOULD LIKE TO TRANSFER:");
                transfer = scanner.nextInt();
                if (transfer <= balance) {
                    System.out.println("YOU SENDING MONEY AS MUCH: : " + transfer + "\nTO: " + tf_Name + " \nWITH DESTINATION CODE: " + tf_Code);
                    System.out.println("CONFIRMATION:\n1.CONFIRM\n2.CANCEL");
                    confirm = scanner.next().charAt(0);
                    if (confirm == '1') {
                        balance = balance - transfer;
                        System.out.println("YOU SUCCESSFULLY SEND MONEY: " + transfer + "\nTO: " + tf_Name + " \nWITH DESTINATION CODE: " + tf_Code + "\nYOUR REMAINING BALANCE: " + balance);
                    } else if (confirm == '2') {
                        System.out.println("YOU CANCEL THE TRANSACTION");
                        System.exit(0);
                    }
                } else {
                    System.out.println("YOUR BALANCE IS NOT ENOUGH");
                    System.exit(0);
                }
                System.out.println("==========");
                break;
            default:
                System.out.println("==========\nTHE MENU YOU CHOOSE IS NOT AVAILABLE\n==========");
                System.exit(0);
                break;
             }
        System.out.println("==========ATM SEDERHANA BY NAUFAL DANADYAKSA==========");



        }
    }

