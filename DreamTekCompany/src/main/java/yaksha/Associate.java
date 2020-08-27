package main.java.yaksha;


public class Associate{
    private   int associateId;
	  private  String associateName;
	  private  String workStatus;
		
		public int getAssociateId() {
			return associateId;
		}
		public void setAssociateId(int n) {
			this.associateId = associateId;		
		}
			
		
		public String getAssociateName() {
			return associateName;
		}
		public void setAssociateName(String associateName) {
			this.associateName = associateName;
		}
		public String getWorkStatus() {
			return workStatus;
		}
		public void setWorkStatus(String workStatus) {
			this.workStatus = workStatus;
		}
		
	public String trackAssociateStatus(int d){
	    String work;
	    
		if(d<=20)
		{
			work="Core skills";
		}
		else if(d>20 && d<=40)
		{
			work="Advanced modules";
		}
		
		else if(d>40 && d<=60)
		{
			work="Project phase";
		}
		else
		{
			work="Deployed in project";
		}
		
		setWorkStatus(work);
		System.out.println("The associate "+getAssociateName()+" work status:"+getWorkStatus());
		 
		return work;
}
	
  
  
}
