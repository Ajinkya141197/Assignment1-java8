package Que3;

public class EMI {
	double pr, r, t, emi;
	

	public EMI() {
		super();
	}

	public EMI(double pr, double r, double t, double emi) {
		super();
		this.pr = pr;
		this.r = r;
		this.t = t;
		this.emi = emi;
	}

	public double getPr() {
		return pr;
	}

	public void setPr(double pr) {
		this.pr = pr;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}
	
	public void calEMI() {
		  r=r/(12*100);
		  
	      t=t*12;     
	    
	      emi= (pr*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
	      System.out.println("Monthly Emi is:" +emi);
	      System.out.println("number of Emi amount: "+ emi*12);
	      System.out.println("Time EMI: "+t);
	}
	
}
