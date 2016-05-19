package by.htp3.jd02.myimpl;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		
		Fork fork1 = new Fork();
		Fork fork2 = new Fork();
		Fork fork3 = new Fork();
		Fork fork4 = new Fork();
		Fork fork5 = new Fork();
		
		Inspector ins1 = new Inspector();
		Inspector ins2 = new Inspector();
		Inspector ins3 = new Inspector();
		Inspector ins4 = new Inspector();
		Inspector ins5 = new Inspector();
		
        Philosopher phil1 = new Philosopher(fork1, fork2, ins1);
        Philosopher phil2 = new Philosopher(fork2, fork3, ins2);
        Philosopher phil3 = new Philosopher(fork3, fork4, ins3);
        Philosopher phil4 = new Philosopher(fork4, fork5, ins4);
        Philosopher phil5 = new Philosopher(fork5, fork1, ins5);
		
        System.out.println(phil4.getPhilId());
        
        Thread th1 = new Thread(phil1);
  	    Thread th2 = new Thread(phil2);
  	    Thread th3 = new Thread(phil3);
	    Thread th4 = new Thread(phil4);
	    Thread th5 = new Thread(phil5);
  	   
  	  
  	    th1.start();
  	    th2.start();
  	    th3.start();
  	    th4.start();
  	    th5.start();
  	  
  	    th1.join();
  	    th2.join();
  	    th3.join();
	    th4.join();
	    th5.join();

        
		
	}

}
