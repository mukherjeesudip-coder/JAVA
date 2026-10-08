package Project;

import java.util.*;
class MovieTicketReservation
{
    static void main() 
    {
        boolean quit= false;
        Scanner sc= new Scanner(System.in);
        String movies[]= {"Movie 1", "Movie 2", "Movie 3"};
        String showtimes[][]= {
                {"10:00 AM", "1:00 PM", "4:00 PM"},
                {"11:00 AM", "2:00 PM", "5:00 PM"},
                {"12:00 PM", "3:00 PM", "6:00 PM"}
            };
        int Pr[][]= {
                {350, 350, 350},
                {300, 300, 300},
                {400, 400, 400}
            };
        int sum= 0;
        int a=350,b=350,c=350,d=300,e=300,f=300,g=400,h=400,s=400;
        int screen1[][]= new int[8][20]; 
        int screen2[][]= new int[8][20]; 
        int screen3[][]= new int[8][20]; 
        int screen1_[][]= new int[8][20]; 
        int screen2_[][]= new int[8][20]; 
        int screen3_[][]= new int[8][20]; 
        int screen_1[][]= new int[8][20]; 
        int screen_2[][]= new int[8][20]; 
        int screen_3[][]= new int[8][20]; 
        int selectedMovie= 0; 
        do{
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("            * Welcome to Movie Ticket Booking *");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Select the movie you want to see: ");
            for(int i=0;i<movies.length;i++)
                System.out.println((i+1)+"."+movies[i]);
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1: System.out.println("\n--------------------------------------------------------------------------------");
                    System.out.println("                  * Available Show Time *  ");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Available Showtimes"+"\tPrice\t" + "for "+ movies[choice-1] + ":");
                    for(int i = 0; i < showtimes[choice-1].length; i++) 
                    {
                        System.out.println((i + 1) + " " + showtimes[choice-1][i]+ "\t\t" + Pr[choice-1][i]);
                    }
                    int showchoice=sc.nextInt();
                    switch(showchoice)
                    {
                        case 1: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen1[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int count=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen1[i][j]==0)
                                        count++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+count);
                            System.out.println("Enter the number of seats to reserve: ");
                            int numofseats=sc.nextInt();
                            int cpy= numofseats; 
                            while(numofseats>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt(); 
                                if(screen1[row-65][col-1]==0)
                                {
                                    screen1[row-65][col-1]=1;
                                    numofseats--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        cpy--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (a*cpy); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen1[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            break; 
                        case 2: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen2[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int count_=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen2[i][j]==0)
                                        count_++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+count_);
                            System.out.println("Enter the number of seats to reserve: ");
                            int numofseats_=sc.nextInt();
                            int cpy_= numofseats_; 
                            while(numofseats_>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt();
                                if(screen2[row-65][col-1]==0)
                                {
                                    screen2[row-65][col-1]=1;
                                    numofseats_--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        cpy_--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (b*cpy_); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen2[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            break; 
                        case 3: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen3[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int _count=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen3[i][j]==0)
                                        _count++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+_count);
                            System.out.println("Enter the number of seats to reserve: ");
                            int _numofseats=sc.nextInt();
                            int _cpy= _numofseats; 
                            while(_numofseats>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt();
                                if(screen3[row-65][col-1]==0)
                                {
                                    screen3[row-65][col-1]=1;
                                    _numofseats--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        _cpy--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (c*_cpy); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen3[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                    }
                    break;//case 1
                case 2: System.out.println("\n--------------------------------------------------------------------------------");
                    System.out.println("                  * Available Show Time *  ");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Available Showtimes"+"\tPrice\t" + "for "+ movies[choice-1] + ":");
                    for(int i = 0; i < showtimes[choice-1].length; i++) 
                    {
                        System.out.println((i + 1) + " " + showtimes[choice-1][i]+ "\t\t" + Pr[choice-1][i]);
                    }
                    int showchoice1=sc.nextInt();
                    switch(showchoice1)
                    {
                        case 1: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen1_[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int count1=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen1_[i][j]==0)
                                        count1++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+count1);
                            System.out.println("Enter the number of seats to reserve: ");
                            int numofseats1=sc.nextInt();
                            int cpy1= numofseats1; 
                            while(numofseats1>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt();
                                if(screen1_[row-65][col-1]==0)
                                {
                                    screen1_[row-65][col-1]=1;
                                    numofseats1--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        cpy1--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (d*cpy1); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen1_[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            break; 
                        case 2: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen2_[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int count1_=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen2_[i][j]==0)
                                        count1_++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+count1_);
                            System.out.println("Enter the number of seats to reserve: ");
                            int numofseats1_=sc.nextInt();
                            int cpy1_= numofseats1_; 
                            while(numofseats1_>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt();
                                if(screen2_[row-65][col-1]==0)
                                {
                                    screen2_[row-65][col-1]=1;
                                    numofseats1_--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        cpy1_--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (e*cpy1_); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen2_[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            break; 
                        case 3: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen3_[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int _count1=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen3_[i][j]==0)
                                        _count1++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+_count1);
                            System.out.println("Enter the number of seats to reserve: ");
                            int _numofseats1=sc.nextInt();
                            int _cpy1= _numofseats1; 
                            while(_numofseats1>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt();
                                if(screen3_[row-65][col-1]==0)
                                {
                                    screen3_[row-65][col-1]=1;
                                    _numofseats1--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        _cpy1--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (f*_cpy1); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen3_[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                    }
                    break;//case 2
                case 3: System.out.println("\n--------------------------------------------------------------------------------");
                    System.out.println("                  * Available Show Time *  ");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Available Showtimes"+"\tPrice\t" + "for "+ movies[choice-1] + ":");
                    for(int i = 0; i < showtimes[choice-1].length; i++) 
                    {
                        System.out.println((i + 1) + " " + showtimes[choice-1][i]+ "\t\t" + Pr[choice-1][i]);
                    }
                    int showchoice2=sc.nextInt();
                    switch(showchoice2)
                    {
                        case 1: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen_1[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int count2=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen_1[i][j]==0)
                                        count2++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+count2);
                            System.out.println("Enter the number of seats to reserve: ");
                            int numofseats2=sc.nextInt();
                            int cpy2= numofseats2; 
                            while(numofseats2>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt();
                                if(screen_1[row-65][col-1]==0)
                                {
                                    screen_1[row-65][col-1]=1;
                                    numofseats2--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        cpy2--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (g*cpy2); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen_1[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            break; 
                        case 2: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen_2[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int count2_=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen_2[i][j]==0)
                                        count2_++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+count2_);
                            System.out.println("Enter the number of seats to reserve: ");
                            int numofseats2_=sc.nextInt();
                            int cpy2_= numofseats2_; 
                            while(numofseats2_>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt();
                                if(screen_2[row-65][col-1]==0)
                                {
                                    screen_2[row-65][col-1]=1;
                                    numofseats2_--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        cpy2_--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (h*cpy2_); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen_2[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            break; 
                        case 3: System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println("                  * Available Seats *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("☺= Available \n☻= Booked");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen_3[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                            int _count2=0;
                            for(int i=0;i<8;i++)
                            {
                                for(int j=0;j<20;j++)
                                {
                                    if(screen_3[i][j]==0)
                                        _count2++;
                                }
                            }
                            System.out.println("\nAvailable Seats: "+_count2);
                            System.out.println("Enter the number of seats to reserve: ");
                            int _numofseats2=sc.nextInt();
                            int _cpy2= _numofseats2; 
                            while(_numofseats2>0)
                            {
                                System.out.println("Enter the row number:");
                                char row=sc.next().charAt(0);
                                System.out.println("Enter the seat number:");
                                int col=sc.nextInt();
                                if(screen_3[row-65][col-1]==0)
                                {
                                    screen_3[row-65][col-1]=1;
                                    _numofseats2--;
                                }
                                else
                                {
                                    System.out.println("Seat occupied!");
                                    System.out.println("Press 1 to continue and 0 to exit"); 
                                    int z= sc.nextInt(); 
                                    if(z != 1)
                                    {
                                        _cpy2--; 
                                        break; 
                                    }
                                }
                            }
                            sum= sum + (s*_cpy2); 
                            System.out.println("\n                  * Reservation Complete *  ");
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Seats in the hall: ");
                            for(int i=0;i<8;i++)
                            {                
                                System.out.print("\n"+(char)(65+i)+":  ");
                                for(int k=0;k<20;k++)
                                {
                                    if(screen_3[i][k]==0)
                                        System.out.print((k+1)+".☺  ");
                                    else
                                        System.out.print((k+1)+".☻  ");
                                }
                            }
                            System.out.println("\n--------------------------------------------------------The Screen-------------------------------------------------------------");
                    }
                    break;//case 3
            }
            System.out.println(); 
            System.out.println("Press 3 to continue");
            System.out.println("Press 4 to exit"); 
            int choice2= sc.nextInt(); 
            switch(choice2)
            {
                case 3: 
                    quit= false; 
                    break; 
                case 4:  
                    quit=true;
                    break;
            }
        }while(!quit);
        System.out.println("Total Bill:\t"+sum); 
        System.out.println("Seats booked\t"+s); 
    }
}