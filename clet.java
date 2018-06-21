package org.cloudbus.cloudsim;

public class clet extends Cloudlet {
private double budget;
private double deadline;

	public clet(final int cloudletId,
			final long cloudletLength,
			final int pesNumber,
			
			final long cloudletFileSize,
			final long cloudletOutputSize,
			final UtilizationModel utilizationModelCpu,
			final UtilizationModel utilizationModelRam,
			final UtilizationModel utilizationModelBw, 
			final double budget,
			final double deadline) {
		super(
				cloudletId,
				cloudletLength,
				pesNumber,
				cloudletFileSize,
				cloudletOutputSize,
				utilizationModelCpu,
				utilizationModelRam,
				utilizationModelBw,
				false);// TODO Auto-generated constructor stub
		this.budget = budget;
		this.deadline = deadline;
	}
	
	public  void setBudget(final int budget) {
		this.budget = budget;		
	}
	
	public  double getBudget() {
		return budget;
	}
		
		public  void setDeadline(final int deadline) {
			//this.deadline = deadline;		
		}
		
		public  double getDeadline() {
			return deadline;		
			
			
	}
}


/*
 public  void setDeadline(final int deadline) {
	this.deadline = deadline;

public  int getDeadline() {
	return deadline;		
}

}
}
*/