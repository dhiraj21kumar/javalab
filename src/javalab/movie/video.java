//Part B Design and implement a simple inventory central system for a small video rental store using constructors and Object List.

package javalab.movie;

public class video {
	String mName;
    boolean status;
    double rating;
    
	 public video(String mName, boolean status, double rating) 
	 {
		super();
		this.mName = mName;
		this.status = status;
		this.rating = rating;	
	 }
	public String getmName()
	{
		return mName;
	}
	public void setmName(String mName) 
	{
		this.mName = mName;
	}
	public boolean isStatus()
	{
		return status;
	}
	public void setStatus(boolean status) 
	{
		this.status = status;
	}
	public double getRating() 
	{
		return rating;
	}
	public double setRating(double rating) 
	{
		return this.rating = rating;
	} 

}
