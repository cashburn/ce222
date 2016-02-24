public class TicketVendor {
    private int seats, seatsRemaining;
    
    public void sellTicket() {
        if (seatsRemaining > 0) {
            System.out.printf("Ticket Sold - %d seats remaining\n", seatsRemaining);
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seatsRemaining--;
            
        }
        
        else {
            System.out.println("Sorry, sold out");
        }
    }
    
    public TicketVendor (int seatsX) {
        this.seats = seatsX;
        this.seatsRemaining = seatsX;
        System.out.printf("TicketVendor created with %d seats\n", seats);
    }
}