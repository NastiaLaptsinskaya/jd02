package by.htp3.jd02.myimpl;

public class Fork {
     private int forkId;
     private static int forkIdGen = 0;
     
     //private Inspector forkInsp; ///

     Fork(){
    	 this.forkId = forkIdGen + 1;
    	 forkIdGen++;
    	 
    	//this.forkId = forkIdGen + 1;
     	//forkIdGen++ ;
     }
     
     
     
     
	public int getForkId() {
		return forkId;
	}

	public void setForkId(int forkId) {
		this.forkId = forkId;
	}
     
     
}
