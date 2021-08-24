import java.util.*;
/**
 * This is a program that helps the site developers update the site.
 * Helps a user see the list of movies and book a movie.
 * Book a ticket.
 * Exit the program
 * @author (Shivam Taneja)
 * @version (20.06.17.9.08.17)
 */
public class CompAppProject
{//class starts
    int screen_1 = 1;
    int screen_2_1 = 2;
    static String arr_mov[] = new String[6];
    int timing_mov2[]= new int [6];
    int timing_mov3[] = new int [6];
    int timing_mov4[] = new int [6];
    int timing_mov5[] = new int [6];
    int timing_mov6[] = new int [6];
    int timing_mov1[] = new int [6];

    @SuppressWarnings("empty-statement")
    void display()
    {//main method begins 
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to 'Holiday Homework Cinemas'!");
        System.out.println("1.System Update" + '\n' + "2.Movies and their Timings" + '\n' + "3.Book a Ticket" + '\n' + "4.Exit");
        System.out.println("Note: 'System Update' only works if you are a site developer");
        screen_1 = Sc.nextInt();
        Sc.nextLine();

        int gold_tickets = 7;
        int silver_tickets = 20;
        int bronze_tickets = 12;

        arr_mov[0]= "Tubelight";
        arr_mov[1]= "Justice League";
        arr_mov[2]= "Wonder Woman";
        arr_mov[3]= "Holiday Homework: Why? :'(";

        timing_mov1[0] = 1100;
        timing_mov1[1] = 1400;
        timing_mov1[2] = 1700;
        timing_mov1[3] = 2000;
        timing_mov1[4] = 2300;
        CompAppProject show;//object to recall display method.
        show = new CompAppProject();
        for(int i = 0; i < 5; i ++)
        {
            timing_mov2[i] = timing_mov1[i];
            timing_mov3[i] = timing_mov1[i];
            timing_mov4[i] = timing_mov1[i];
            timing_mov5[i] = timing_mov1[i];
            timing_mov6[i] = timing_mov1[i];
        }

        switch(screen_1)
        {//screen 1 dislpay 1   
            case 1 :
            {
                System.out.println("Please enter the username below.");
                String userid = Sc.next();
                Sc.nextLine();
                System.out.println("Please enter the password below.");
                String password = Sc.next();
                Sc.nextLine();
                if(userid  .equals("ShivamT") && password .equals("Project"))
                {
                    System.out.println("1.Add A New Movie" + '\n' + "2.Update Movie/Show Timings" + '\n' + "3.Delete a Movie" + '\n' + "4.Return to Previous Menu" + '\n' + "5.Exit");           
                    int n = Sc.nextInt();
                    Sc.nextLine();

                    screen_2_1=n;

                    switch(screen_2_1)
                    {//screen 2 display 1
                        case 1:
                        {                    
                            System.out.println("Please enter the name of the movie.");
                            arr_mov[4] = Sc.nextLine();  

                            System.out.println(arr_mov[0] + '\n' + arr_mov[1] + '\n' + arr_mov[2] + '\n' + arr_mov[3] + '\n' + arr_mov[4] + '\n' +  "all at 1100, 1400, 1700, 2000, 2300hrs");

                            show.display();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Now Showing-" );
                            for(int l = 0; l < 6; l++)
                            {
                                if(arr_mov[l] == null)
                                {
                                    ;
                                }
                                else
                                {
                                    System.out.println(arr_mov[l] + ", ");
                                }
                            }

                            for(int i = 0; i< 6; i++)
                            {
                                if(arr_mov[i] == null)
                                {
                                    ;
                                }
                                else
                                {
                                    System.out.println( "Please enter " + (i+1) + " for " + arr_mov[i]);
                                }
                            }
                            int ans = Sc.nextInt();
                            Sc.nextLine();
                            switch(ans)
                            {
                                case 1:
                                {
                                    System.out.println("Please enter the new timings for " + arr_mov[0] + '\n' + "Please note that there are no shows after 2300.");
                                    timing_mov1[5] = Sc.nextInt();
                                    Sc.nextLine();
                                    for(int i = 0; i < 5;i++)
                                    {
                                        if(timing_mov1[i] > timing_mov1[5])
                                        {

                                            timing_mov1[i] = timing_mov1[5];
                                            break;
                                        }
                                        else
                                        {
                                            ;
                                        }
                                    }
                                    System.out.println("The new timings for "  + arr_mov[0] + "are " + timing_mov1[0] + '\t' + timing_mov1[1] + '\t' + timing_mov1[2] + '\t' + timing_mov1[3] + '\t' + timing_mov1[4]);
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("Please enter the new timings for " + arr_mov[1]);
                                    timing_mov2[5] = Sc.nextInt();
                                    Sc.nextLine();
                                    for(int i = 0; i < 5;i++)
                                    {
                                        if(timing_mov2[i] > timing_mov2[5])
                                        {

                                            timing_mov2[i] = timing_mov2[5];
                                            break;          
                                        }
                                        else
                                        {
                                            ;
                                        }
                                    }
                                    System.out.println("The new timings for "  + arr_mov[1] + "are " + timing_mov2[0] + '\t' + timing_mov2[1] + '\t' + timing_mov2[2] + '\t' + timing_mov2[3] + '\t' + timing_mov2[4]);
                                    break;
                                }
                                case 3:
                                {
                                    System.out.println("Please enter the new timings for " + arr_mov[2]);
                                    timing_mov3[5] = Sc.nextInt();
                                    Sc.nextLine();
                                    for(int i = 0; i < 5;i++)
                                    {
                                        if(timing_mov3[i] > timing_mov3[5])
                                        {

                                            timing_mov3[i] = timing_mov3[5];
                                            break;
                                        }
                                        else
                                        {
                                            ;
                                        }
                                    }
                                    System.out.println("The new timings for "  + arr_mov[2] + "are " + timing_mov3[0] + '\t' + timing_mov3[1] + '\t' + timing_mov3[2] + '\t' + timing_mov3[3] + '\t' + timing_mov3[4]);
                                    break;
                                }
                                case 4:
                                {
                                    System.out.println("Please enter the new timings for " + arr_mov[3]);
                                    timing_mov4[5] = Sc.nextInt();
                                    Sc.nextLine();
                                    for(int i = 0; i < 5;i++)
                                    {
                                        if(timing_mov4[i] > timing_mov4[5])
                                        {

                                            timing_mov4[i] = timing_mov4[5];
                                            break;
                                        }
                                        else
                                        {
                                            ;
                                        }
                                    }
                                    System.out.println("The new timings for "  + arr_mov[3] + "are " + timing_mov4[0] + '\t' + timing_mov4[1] + '\t' + timing_mov4[2] + '\t' + timing_mov4[3] + '\t' + timing_mov4[4]);
                                    break;
                                }
                                case 5:
                                {
                                    System.out.println("Please enter the new timings for " + arr_mov[4]);
                                    timing_mov5[5] = Sc.nextInt();
                                    Sc.nextLine();
                                    for(int i = 0; i < 5;i++)
                                    {
                                        if(timing_mov5[i] > timing_mov5[5])
                                        {

                                            timing_mov5[i] = timing_mov5[5];
                                            break;
                                        }
                                        else
                                        {
                                            ;
                                        }
                                    }
                                    System.out.println("The new timings for "  + arr_mov[4] + "are " + timing_mov5[0] + '\t' + timing_mov5[1] + '\t' + timing_mov5[2] + '\t' + timing_mov5[3] + '\t' + timing_mov5[4]);
                                    break;
                                }
                                case 6:
                                {
                                    System.out.println("Please enter the new timings for " + arr_mov[5]);
                                    timing_mov6[5] = Sc.nextInt();
                                    Sc.nextLine();
                                    for(int i = 0; i < 5;i++)
                                    {
                                        if(timing_mov6[i] > timing_mov6[5])
                                        {
                                            timing_mov6[i] = timing_mov6[5];
                                            break;
                                        }
                                        else
                                        {
                                            ;
                                        }
                                    }
                                    System.out.println("The new timings for "  + arr_mov[5] + " are " + '\t' + timing_mov6[0] + '\t' + timing_mov6[1] + '\t' + timing_mov6[2] + '\t' + timing_mov6[3] + timing_mov6[4]);

                                    break;
                                }

                            }
                            show.display();
                            break;
                        }
                        case 3:
                        {

                            System.out.println("Now Showing -");
                            for(int l = 0; l < 6; l++)
                            {
                                if(arr_mov[l] == null)
                                {
                                    ;
                                }
                                else
                                {
                                    System.out.println(arr_mov[l] + ", ");
                                }
                            }
                            System.out.println("Please enter");
                            for(int i = 0; i< 6; i++)
                            {
                                if(arr_mov[i] == null)
                                {
                                    ;
                                }
                                else
                                {
                                    System.out.println((i+1) + " to delete " + arr_mov[i] + " from the booking section.");
                                }
                            }
                            int inp = Sc.nextInt();
                            Sc.nextLine();
                            switch(inp)
                            {
                                case 1:
                                {
                                    arr_mov[0] = null;
                                    System.out.println("Now Showing -");
                                    for(int l = 0; l < 6; l++)
                                    {
                                        if(arr_mov[l] == null)
                                        {
                                            ;
                                        }
                                        else
                                        {
                                            System.out.println(arr_mov[l] + ", ");
                                        }
                                    }
                                    break;
                                }
                                case 2:
                                {
                                    arr_mov[1]=null;
                                    System.out.println("Now Showing -");
                                    for(int l = 0; l < 6; l++)
                                    {
                                        if(arr_mov[l] == null)
                                        {
                                            ;
                                        }
                                        else
                                        {
                                            System.out.println(arr_mov[l] + ", ");
                                        }
                                    }
                                    break;
                                }
                                case 3:
                                {
                                    arr_mov[2] = null;
                                    System.out.println("Now Showing -");
                                    for(int l = 0; l < 6; l++)
                                    {
                                        if(arr_mov[l] == null)
                                        {
                                            ;
                                        }
                                        else
                                        {
                                            System.out.println(arr_mov[l] + ", ");
                                        }
                                    }
                                    break;
                                }
                                case 4:
                                {
                                    arr_mov[3] = null;
                                    System.out.println("Now Showing -");
                                    for(int l = 0; l < 6; l++)
                                    {
                                        if(arr_mov[l] == null)
                                        {
                                            ;
                                        }
                                        else
                                        {
                                            System.out.println(arr_mov[l] + ", ");
                                        }
                                    }
                                    break;
                                }
                                case 5:
                                {
                                    arr_mov[4] = null;
                                    System.out.println("Now Showing -");
                                    for(int l = 0; l < 6; l++)
                                    {
                                        if(arr_mov[l]  == null)
                                        {
                                            ;
                                        }
                                        else
                                        {
                                            System.out.println(arr_mov[l] + ", ");
                                        }
                                    }
                                    break;
                                }
                                case 6:
                                {
                                    arr_mov[5] = null;
                                    System.out.println("Now Showing -");
                                    for(int l = 0; l < 6; l++)
                                    {
                                        if(arr_mov[l] == null )
                                        {
                                            ;
                                        }
                                        else
                                        {
                                            System.out.println(arr_mov[l] + ", ");
                                        }
                                    }
                                    break;
                                }
                            }
                            show.display();
                            break;
                        }
                        case 4:
                        {
                            show.display();
                            break;
                        }
                        case 5:
                        {
                            System.out.print('\u000C');
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong username or password, please try again.");
                    show.display();
                }

                break;
            }

            case 2:
            {
                System.out.println("You have chosen 'Movies & their Timings'.");
                System.out.println("Now Showing");
                if(arr_mov[0] ==null )
                {
                    ;
                }
                else
                {
                    System.out.println(arr_mov[0] + " at " +  '\t' + timing_mov1[0] + '\t' + timing_mov1[1] + '\t' + timing_mov1[2] + '\t' + timing_mov1[3] + '\t' + timing_mov1[4]);
                }   
                if(arr_mov[1] ==null )
                {
                    ;
                }
                else
                {
                    System.out.println(arr_mov[1] + " at " +'\t' + timing_mov2[0] + '\t' + timing_mov2[1] +  '\t' + timing_mov2[2] + '\t' + timing_mov2[3] + '\t' +  timing_mov2[4]);
                }
                if(arr_mov[2] ==null )
                {
                    ;
                }
                else
                {
                    System.out.println(arr_mov[2] + " at " + '\t' + timing_mov3[0] + '\t' +  timing_mov3[1] +  '\t' + timing_mov3[2] + '\t' +  timing_mov3[3] +  '\t' + timing_mov3[4]);
                }
                if(arr_mov[3] ==null )
                {
                    ;
                }
                else
                {
                    System.out.println(arr_mov[3] + " at " + '\t' + timing_mov4[0] + '\t' +  timing_mov4[1] +  '\t' + timing_mov4[2] +  '\t' + timing_mov4[3] +  '\t' + timing_mov4[4]);
                } 
                if(arr_mov[4]==null )
                {
                    ;
                }
                else
                {
                    System.out.println(arr_mov[4] + " at " + '\t' +  timing_mov5[0] +  '\t' + timing_mov5[1] +  '\t' + timing_mov5[2] + '\t' +  timing_mov5[3] + '\t' +  timing_mov5[4]);
                }

                if(arr_mov[5] ==null )
                {
                    ;
                }
                else
                {
                    System.out.println(arr_mov[5] + " at " + '\t' +  timing_mov6[0] +  '\t' + timing_mov6[1] +  '\t' +  timing_mov6[2] + '\t' +  timing_mov6[3] + '\t' +  timing_mov6[4]);

                }
                show.display();
                break;

            }

            case 3:
            {
                System.out.println("You have chosen 'Book a Ticket.'");
                Pay paym = new Pay();
                Seats seat = new Seats();
                seat.seatsdisplay();
                System.out.println("Now Showing -");
                for(int l = 0; l < 6; l++)
                {
                    if(arr_mov[l] ==null)
                    {
                        ;
                    }
                    else
                    {
                        System.out.println(arr_mov[l] + ", ");
                    }
                }
                System.out.println("Please enter");
                for(int i = 0; i< 6; i++)
                {
                    if(arr_mov[i] ==null)
                    {
                        ;
                    }
                    else
                    {
                        System.out.println((i+1) + " to book " + arr_mov[i]);
                    }

                }

                int choice = Sc.nextInt();
                Sc.nextLine();
                switch(choice)
                {
                    case 1:
                    {
                        System.out.println("Please press 1 to book Gold Class tickets" + '\n' + "Press 2 to book Silver Class tickets" + '\n' + "Press 3 to book Bronze Class tickets.");
                        int choose = Sc.nextInt();

                        Sc.nextLine();
                        switch(choose)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_gold = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_gold <= gold_tickets)
                                {    
                                    int temp = gold_tickets - inp_gold;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_gold);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[0]);
                                        System.out.println("COST OF TICKETS       : " + (inp_gold * 1400));
                                        break;
                                    }

                                    else
                                    {

                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }

                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }

                                 
                            }
                            case 2:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_silver = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_silver <= silver_tickets)
                                {    
                                    int temp = silver_tickets - inp_silver;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_silver);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[0]);
                                        System.out.println("COST OF TICKETS       : " + (inp_silver * 900));
                                                

                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }

                                
                            }
                            case 3 :
                            {

                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_bronze = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_bronze <= bronze_tickets)
                                {    
                                    int temp = bronze_tickets - inp_bronze;
                                    bronze_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_bronze);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[0]);
                                        System.out.println("COST OF TICKETS       : " + (inp_bronze * 400));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;

                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }

                                
                            }
                        }
                        
                       

                    }
                    case 2:
                    {
                        System.out.println("Please press 1 to book Gold Class tickets" + '\n' + "Press 2 to book Silver Class tickets" + '\n' + "Press 3 to book Bronze Class tickets.");
                        int choose = Sc.nextInt();
                        Sc.nextLine();
                        switch(choose)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_gold = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_gold <= gold_tickets)
                                {    
                                    int temp = gold_tickets - inp_gold;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_gold);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[1]);
                                        System.out.println("COST OF TICKETS       : " + (inp_gold * 1400));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }

                                
                            }
                            case 2:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_silver = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_silver <= silver_tickets)
                                {    
                                    int temp = silver_tickets - inp_silver;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_silver);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[1]);
                                        System.out.println("COST OF TICKETS       : " + (inp_silver * 900));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    
                                    break;
                                }
                                
                            }
                            case 3 :
                            {

                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_bronze = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_bronze <= bronze_tickets)
                                {    
                                    int temp = bronze_tickets - inp_bronze;
                                    bronze_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_bronze);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[1]);
                                        System.out.println("COST OF TICKETS       : " + (inp_bronze * 400));
                                        break;
                                    }

                                    else
                                    {

                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }
                                
                            }
                        }
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Please press 1 to book Gold Class tickets" + '\n' + "Press 2 to book Silver Class tickets" + '\n' + "Press 3 to book Bronze Class tickets.");
                        int choose = Sc.nextInt();
                        Sc.nextLine();
                        switch(choose)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_gold = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_gold <= gold_tickets)
                                {    
                                    int temp = gold_tickets - inp_gold;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_gold);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[2]);
                                        System.out.println("COST OF TICKETS       : " + (inp_gold * 1400));
                                        break;
                                    }

                                    else
                                    {

                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }
                                
                            }
                            case 2:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_silver = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_silver <= silver_tickets)
                                {    
                                    int temp = silver_tickets - inp_silver;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_silver);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[2]);
                                        System.out.println("COST OF TICKETS       : " + (inp_silver * 900));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }
                                
                            }
                            case 3 :
                            {

                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_bronze = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_bronze <= bronze_tickets)
                                {    
                                    int temp = bronze_tickets - inp_bronze;
                                    bronze_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_bronze);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[2]);
                                        System.out.println("COST OF TICKETS       : " + (inp_bronze * 400));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }

                                
                            }
                        }
                        
                        break;
                    }
                    case 4:

                    {
                        System.out.println("Please press 1 to book Gold Class tickets" + '\n' + "Press 2 to book Silver Class tickets" + '\n' + "Press 3 to book Bronze Class tickets.");
                        int choose = Sc.nextInt();
                        Sc.nextLine();
                        switch(choose)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_gold = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_gold <= gold_tickets)
                                {    
                                    int temp = gold_tickets - inp_gold;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_gold);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[3]);
                                        System.out.println("COST OF TICKETS       : " + (inp_gold * 1400));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }
                                
                            }
                            case 2:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_silver = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_silver <= silver_tickets)
                                {    
                                    int temp = silver_tickets - inp_silver;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_silver);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[3]);
                                        System.out.println("COST OF TICKETS       : " + (inp_silver * 900));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }
                                
                            }
                            case 3 :
                            {

                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_bronze = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_bronze <= bronze_tickets)
                                {    
                                    int temp = bronze_tickets - inp_bronze;
                                    bronze_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_bronze);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[3]);
                                        System.out.println("COST OF TICKETS       : " + (inp_bronze * 400));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;
                                }
                                
                            }
                        }
                        
                        break;
                    }
                    case 5:

                    {
                        System.out.println("Please press 1 to book Gold Class tickets" + '\n' + "Press 2 to book Silver Class tickets" + '\n' + "Press 3 to book Bronze Class tickets.");
                        int choose = Sc.nextInt();
                        Sc.nextLine();
                        switch(choose)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_gold = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_gold <= gold_tickets)
                                {    
                                    int temp = gold_tickets - inp_gold;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_gold);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[4]);
                                        System.out.println("COST OF TICKETS       : " + (inp_gold * 1400));
                                        break;
                                    }

                                    else
                                    {

                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;

                                }
                                
                            }
                            case 2:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_silver = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_silver <= silver_tickets)
                                {    
                                    int temp = silver_tickets - inp_silver;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_silver);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[4]);
                                        System.out.println("COST OF TICKETS       : " + (inp_silver * 900));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;

                                }
                                
                            }
                            case 3 :
                            {

                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_bronze = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_bronze <= bronze_tickets)
                                {    
                                    int temp = bronze_tickets - inp_bronze;
                                    bronze_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_bronze);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[4]);
                                        System.out.println("COST OF TICKETS       : " + (inp_bronze * 400));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;

                                }
                                
                            }
                        }
                        
                        break;
                    }
                    case 6:

                    {
                        System.out.println("Please press 1 to book Gold Class tickets" + '\n' + "Press 2 to book Silver Class tickets" + '\n' + "Press 3 to book Bronze Class tickets.");
                        int choose = Sc.nextInt();
                        Sc.nextLine();
                        switch(choose)
                        {
                            case 1:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_gold = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_gold <= gold_tickets)
                                {    
                                    int temp = gold_tickets - inp_gold;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_gold);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[5]);
                                        System.out.println("COST OF TICKETS       : " + (inp_gold * 1400));
                                        break;
                                    }

                                    else
                                    {
                                        
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;

                                }
                                
                            }
                            case 2:
                            {
                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_silver = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_silver <= silver_tickets)
                                {    
                                    int temp = silver_tickets - inp_silver;
                                    gold_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();
                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_silver);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[5]);
                                        System.out.println("COST OF TICKETS       : " + (inp_silver * 900));
                                        break;
                                    }

                                    else
                                    {
                                        
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;

                                }
                                
                            }
                            case 3 :
                            {

                                System.out.println("Please enter the amount of tickets you want to book.");
                                int inp_bronze = Sc.nextInt();
                                Sc.nextLine();
                                if(inp_bronze <= bronze_tickets)
                                {    
                                    int temp = bronze_tickets - inp_bronze;
                                    bronze_tickets = temp;
                                    System.out.println("Please enter your name.");      
                                    String name = Sc.nextLine();
                                    System.out.println("Please enter today's date(day)");
                                    int date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    System.out.println("Please enter the day of the movie");
                                    int m_date_d = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the month.");
                                    int m_date_m = Sc.nextInt();
                                    Sc.nextLine();
                                    System.out.println("Please enter the year.");
                                    int m_date_y = Sc.nextInt();
                                    Sc.nextLine();

                                    if(m_date_d >= date_d && m_date_m >= date_m && m_date_y >= date_y)
                                    {

                                        System.out.println("---------------------------------------");
                                        System.out.println("NAME                  : " + name);
                                        System.out.println("DATE                  : " + m_date_d + "/" + m_date_m + "/" + m_date_y);
                                        System.out.println("NO. OF TICKETS        : " + inp_bronze);
                                        System.out.println("AUDI                  : " + choice );
                                        System.out.println("MOVIE                 : " + arr_mov[5]);
                                        System.out.println("COST OF TICKETS       : " + (inp_bronze * 400));
                                        break;
                                    }

                                    else
                                    {
                                        System.out.println("Sorry Customer, but the date for which you want to book is movie is invalid, Please try again");
                                        show.display();
                                        
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, but the number entered is invalid.");
                                    show.display();
                                    break;

                                }
                            }
                          
                            
                        }
                        

                    }
                
                }
                paym.payment();  
                          break;  
                
            }
            case 4:
            {
                System.out.print('\u000C');
                System.out.println("Thank you for chooing us as your Primary Cinemas, we hope you have a blast at your movie. :D");
            }

        }//display ends
    }//main method ends
}//class ends
