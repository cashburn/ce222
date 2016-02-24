public class TicketVendorTester {

	static TicketVendor tvInstance = new TicketVendor(1);

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {

                // sleep for 0seconds
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

				System.out.println("thread 1 running ...");
				tvInstance.sellTicket();
				System.out.println("thread 1 finished");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {

				// sleep for 2 seconds
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("thread 2 running ...");
				tvInstance.sellTicket();
				System.out.println("thread 2 finished");
			}
		});
		thread1.start();
		thread2.start();
	}
}
