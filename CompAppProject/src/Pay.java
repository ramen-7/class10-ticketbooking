import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivam Taneja
 */
public class Pay 
{
    public void payment()
    {

        Scanner Sc = new Scanner(System.in);
        System.out.println("How would you like to pay for your tickets?");
        System.out.println("Press 1 for Debit Card, Press 2 for Credit Card, Press 3 for Voucher, Press 4 to cancel.");
        int choose = Sc.nextInt();
        switch(choose)
        {
            case 1:
            {
                System.out.println("Please enter your card no.(---- ---- ---- ----)");
                String card_no = Sc.nextLine();
                card_no = Sc.nextLine();
                System.out.println("Please enter the Expiry Date(month/year)");
                String exp_date = Sc.nextLine();
                System.out.println("Please enter Security Code.");
                int sec_code = Sc.nextInt();
                System.out.println("Processing Info...");     
                System.out.println("Transaction Successfull.");
                System.out.println("Enjoy your movie :)");
		System.out.println("Enter any number to close");
		int xxxxxx = Sc.nextInt();
                break;
            }
            case 2:
            {
                System.out.println("Please enter the card holder's name.");
                String name = Sc.nextLine();
                name = Sc.nextLine();

                System.out.println("Please enter the card no.(---- ---- ---- ----)");
                String card_no = Sc.nextLine();

                System.out.println("Please enter expiry date.");
                String exp_date = Sc.nextLine();

                System.out.println("Please enter CSC.");
                int sec_code = Sc.nextInt();
                System.out.println("Processing Info...");
                System.out.println("Transaction Successfull.");
                System.out.println("Enjoy your movie ");
		System.out.println("Enter any number to close");
		int xxxxxx = Sc.nextInt();
                break;
            }
            case 3:
            {
                System.out.println("Please enter Voucher Code.(_ _ _ _  _ _ _ _)");
                String vouch = Sc.nextLine();
                vouch = Sc.nextLine();
                System.out.println("Processing Info...");
                System.out.println("Transaction Successfull.");
                System.out.println("Enjoy your movie ");
		System.out.println("Enter any number to close");
		int xxxxxx = Sc.nextInt();
                break;
            }
            case 4:
            System.out.print('\u000C');

            break;
        }

    }
}

