import java.util.Scanner;
public class IntercityBusReservationSystem{
    public static void busName(){
        System.out.println("1.ABC Travels");
        System.out.println("2.LMN Travels");
        System.out.println("3.XYZ Travels");
        return;
    }
    public static void busRoutes(){
        System.out.println("1.Hyderabad ---> Benguluru");
        System.out.println("2.Hyderabad ---> Chennai");
        System.out.println("3.Hyderabad ---> Mumbai");
        System.out.println("4.Hyderabad ---> Cochin");
        return;
    }
    public static void prices(){
        System.out.println("1.Hyderabad to Benguluru ---> 800/- ");
        System.out.println("2.Hyderabad to Chennai ---> 600/- ");
        System.out.println("3.Hyderabad to Mumbai ---> 1500/- ");
        System.out.println("4.Hyderabad to Cochin ---> 2000/- ");
        return;
    }
    public static void main(String[] args){
        Scanner ad=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=ad.nextLine();
        int choice;
        int route=0;
        int route1=0;
        int agency=0;
        int agency1=0;
        int seats=0;
        int seats1=0;
        float hydblr=800;
        float hydmad=600;
        float hydmum=1500;
        float hydcok=2000;
        do{        
        System.out.println("1.Reserve Ticket");
        System.out.println("2.Cancel Ticket");
        System.out.println("3.Exit");
        System.out.println("Enter your choice (1/2/3)");
        choice=ad.nextInt();
        if(choice<3)
            switch(choice){
        case 1:
            System.out.println("Reserve your ticket");
            busRoutes();
            System.out.println("Choose your bus route (1/2/3)");
            route=ad.nextInt();
            busName();
            System.out.println("Choose your Travel Agency (1/2/3)");
            agency=ad.nextInt();
            System.out.println("Enter number of seats to reserve");
            seats=ad.nextInt();
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Reservation Details");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Name = "+name);
                        switch(route){
                            case 1:
                                System.out.println("Bus Route = Hyderabad ---> Benguluru");
                                break;
                            case 2:
                                System.out.println("Bus Route = Hyderabad ---> Chennai");
                                break;
                            case 3:
                                System.out.println("Bus Route = Hyderabad ---> Mumbai");
                                break;
                            case 4:
                                System.out.println("Bus Route = Hyderabad ---> Cochin");
                                break;
                            default:
                                System.out.println("Invalid Selection");
                            }
                            switch(agency){
                            case 1:
                                System.out.println("Travel Agency = ABC Travels");
                                break;
                            case 2:
                                System.out.println("Travel Agency = LMN Travels");
                                break;
                            case 3:
                                System.out.println("Travel Agency = XYZ Travels");
                                break;
                            default:
                                System.out.println("Invalid Selection");
                            }
                    System.out.println("Number of seats = "+seats);
                        switch(route){
                            case 1:
                                System.out.println("Total price = "+seats*hydblr);
                                break;
                            case 2:
                                System.out.println("Total price = "+seats*hydmad);
                                break;
                            case 3:
                                System.out.println("Total price = "+seats*hydmum);
                                break;
                            case 4:
                                System.out.println("Total price = "+seats*hydcok);
                                break;
                            default:
                                System.out.println("Invalid Selection");
                            }
                    System.out.println("--------------------------------------------------------");
            break;
        case 2:
            System.out.println("Cancel your ticket");
            busRoutes();
            System.out.println("Choose your bus route (1/2/3)");
            route1=ad.nextInt();
            busName();
            System.out.println("Choose your Travel Agency (1/2/3)");
            agency1=ad.nextInt();
            System.out.println("Enter number of seats to cancel");
            seats1=ad.nextInt();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Cancellation Details");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Name = "+name);
                    
                        switch(route1){
                            case 1:
                                System.out.println("Bus Route = Hyderabad ---> Benguluru");
                                break;
                            case 2:
                                System.out.println("Bus Route = Hyderabad ---> Chennai");
                                break;
                            case 3:
                                System.out.println("Bus Route = Hyderabad ---> Mumbai");
                                break;
                            case 4:
                                System.out.println("Bus Route = Hyderabad ---> Cochin");
                                break;
                            default:
                                System.out.println("Invalid Selection");
                            }
                            switch(agency1){
                            case 1:
                                System.out.println("Travel Agency = ABC Travels");
                                break;
                            case 2:
                                System.out.println("Travel Agency = LMN Travels");
                                break;
                            case 3:
                                System.out.println("Travel Agency = XYZ Travels");
                                break;
                            default:
                                System.out.println("Invalid Selection");
                            }
                    System.out.println("Number of seats = "+seats1);
                        switch(route1){
                            case 1:
                                System.out.println("Total Refund = "+seats1*hydblr);
                                break;
                            case 2:
                                System.out.println("Total Refund = "+seats1*hydmad);
                                break;
                            case 3:
                                System.out.println("Total Refund = "+seats1*hydmum);
                                break;
                            case 4:
                                System.out.println("Total Refund = "+seats1*hydcok);
                                break;
                            default:
                                System.out.println("Invalid Selection");
                            }
                    System.out.println("Refund will be processed within 7 working days.");
                    System.out.println("--------------------------------------------------------");
            break;
        case 3:
            System.out.println("Exit Selected");
            break;
    }
        }
        while(choice<3);
        
        ad.close();
    }
}