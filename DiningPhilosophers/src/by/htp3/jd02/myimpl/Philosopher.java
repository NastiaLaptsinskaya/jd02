package by.htp3.jd02.myimpl;

public class Philosopher implements Runnable{
    int philId;
    Fork forkFirst;
    Fork forkSecond;
    
    private Inspector forkInsp; ///
    
   // private boolean blockStatus = false;
    
    private static int philIdGen = 0;
    
    Philosopher(Fork f1, Fork f2, Inspector forkI){
    	this.philId = ++philIdGen;
    	//this.philId = philIdGen + 1;
    	//phIdGen++ ; 
    	
    	this.forkFirst = f1;
    	this.forkSecond = f2;
    	this.forkInsp = forkI;
    }
   
    Philosopher(){
    	this.philId = ++philIdGen;
    	philIdGen = philIdGen + 1 ;    	
    }
    ///////////////////////////////////////////////////
	public int getPhilId() {
		return philId;
	}

	public void setPhilId(int philId) {
		this.philId = philId;
	}

	public Fork getForkFirst() {
		return forkFirst;
	}

	public void setForkFirst(Fork forkFirst) {
		this.forkFirst = forkFirst;
	}

	public Fork getForkSecond() {
		return forkSecond;
	}

	public void setForkSecond(Fork forkSecond) {
		this.forkSecond = forkSecond;
	}
	
	public void think(){
		System.out.println("Philosopher with the ID --> " + this.getPhilId() + " thinking...");
	}
	
	public void eat(){
		this.getForkFirst(); 
	    this.getForkSecond();
	    
	    this.forkInsp.setStatus(true);
		System.out.println("Philosopher with the ID --> " + this.getPhilId() + " eating...");
	}
//////////////////////////////////////////////////////////////////
	@Override
	public void run() {
		// TODO Auto-generated method stub
		  for(int i=0; i<5; i++){
			   
			   synchronized (this.forkInsp) {
			    /*this.getForkFirst(); 
			    this.getForkSecond();*/
			    this.eat();
			    try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    //this.eat();
			    this.think();
			    
			   }
			   
			   
			   
			   try {
			    Thread.sleep(100);
			   } catch (InterruptedException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			   }
			  }
			  
	}
    
}
