
package application.model;
/**
 * 
 * @author yso443 cameron perez
 *
 */
public class Spacecraft {
	private String SC_Name;
	private String SC_Type;
	private int SC_Num;
	/**
	 * 
	 * @param newName
	 * @param newType
	 * @param num
	 */
	public Spacecraft(String newName, String newType, int num) {
		this.SC_Name = newName;
		this.SC_Type = newType;
		this.SC_Num = num;
	}
	/**
	 * 
	 * @return spacecraft name
	 */
	public String getSC_Name() {
		return SC_Name;
	}
	/**
	 * 
	 * @param sC_Name
	 */
	public void setSC_Name(String sC_Name) {
		SC_Name = sC_Name;
	}
	/**
	 * 
	 * @return spacecraft type
	 */
	public String getSC_Type() {
		return SC_Type;
	}
	/**
	 * 
	 * @param sC_Type
	 */
	public void setSC_Type(String sC_Type) {
		SC_Type = sC_Type;
	}
	/**
	 * 
	 * @return Spacecraft number
	 */
	public int getSC_Num() {
		return SC_Num;
	}
	/**
	 * 
	 * @param sC_Num
	 */
	public void setSC_Num(int sC_Num) {
		SC_Num = sC_Num;
	}
	/**
	 * string format
	 */
	public String toString() {
		return String.format("%s/%s/%s", this.getSC_Name(), this.getSC_Type(), this.getSC_Num());
	}

}
