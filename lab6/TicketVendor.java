public class TicketVendor {
	private int seats, seatsRemaining;

	public synchronized void sellTicket() {
		if (seatsRemaining > 0) {
            System.out.format("Ticket Sold - seats remaining are %d%n",
                    seatsRemaining);

            // sleep for 5 seconds
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            seatsRemaining = seatsRemaining - 1;

		} else {
            System.out.println("Sorry, sold out");
        }
	}

    public TicketVendor(int seatsX) {
		// a ticket vendor can start with any number of seats
		this.seats = seatsX;
		this.seatsRemaining = seatsX;
		System.out.format("ticket vendor created with %d seats%n", seats);
	}
}
