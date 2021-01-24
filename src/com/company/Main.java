package com.company;

public class Main {

    public static void main(String[] args) {
        String[] tlocation = new String[]{"mumbai", "delhi", "pune", "russia"};
        Flight fly1 = new Flight("121", "a", 123, 12);
        Passenger pass = new Passenger(21, "chirayu", "7777799999", "chirayu@gmail.com", "232", "mumbai", "maharashtra");
        RegularTicket rTicket = new RegularTicket("1268789", "mumbai", "delhi", fly1, "15", "18", pass, "121", 12000, false, "yes");
        TouristTicket tTicket = new TouristTicket("1268788", "mumbai", "delhi", fly1, "21", "03", pass, "125", 18000, false, "delhi darbar", tlocation);

        printTicketDetails(rTicket);
        printTicketDetails(tTicket);
    }

    // METHOD PRINTTICKETDETAILS
         public static void printTicketDetails(Ticket ticket){
            System.out.println(ticket.getPnr());

        }

}
