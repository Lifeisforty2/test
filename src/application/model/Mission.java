
package application.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author cameron perez yso443
 *
 */
public class Mission {
	String mission;
	private String Mission_Name;
	private String Mission_Operator;
	private String Mission_Year;
	private String Mission_Type;
	private ArrayList<Spacecraft> Space_Crafts;
	private ArrayList<Astronaut> Crew_Members;
	/**
	 * 	
	 * @param string
	 */
	public Mission(String string) {
		// TODO Auto-generated constructor stub
		this.mission = string;
		Space_Crafts = new ArrayList<Spacecraft> ();
		Crew_Members = new ArrayList<Astronaut> ();
	}
	/**
	 * 
	 * @param load mission data from filename
	 */
	public void loadMission(String filename) {
		
		Scanner scan = null;
		
		try {
			scan = new Scanner(new File(filename));
			Astronaut Ast = null;
			Spacecraft SC = null;
			
			if( scan != null ) {	
				while(scan.hasNextLine()) {
					String record = scan.nextLine();
					String[] data = record.split(",");
				
					
					// handle mission data
					if(data[0].equals("Mission")) {
						this.Mission_Name = data[1];
						this.Mission_Operator = data[2];
						this.Mission_Year = data[3];
						this.Mission_Type = data[4];
					}		
					// handle crew data
					else if(data[0].equals("Crew")) {
						String Ast_Pos = data[1];
						String Ast_Name = data[2];
						Ast = new Astronaut(Ast_Name, Ast_Pos);
					}
					// handle Spacecraft data
					else if( data[0].equals("Spacecraft")){
						String SC_Name = data[1];
						String SC_Type = data[2];
						String SC_Num = data[3];
						SC = new Spacecraft(SC_Name, SC_Type, Integer.parseInt(SC_Num));
					}
					if ( SC != null ) {
						this.addSC(SC);
					}
					else if( Ast != null ) {
						this.addAst(Ast);
					}
				 }
			}
			scan.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param ast
	 */
	private void addAst(Astronaut ast) {
		// TODO Auto-generated method stub
		Crew_Members.add(ast);
	}
	/**
	 * 
	 * @return mission object name
	 */
	public String getMission() {
		return mission;
	}
	/**
	 * 
	 * @param mission
	 */
	public void setMission(String mission) {
		this.mission = mission;
	}
	/**
	 * 
	 * @return mission name
	 */
	public String getMission_Name() {
		return Mission_Name;
	}
	/**
	 * 
	 * @param mission_Name
	 */
	public void setMission_Name(String mission_Name) {
		Mission_Name = mission_Name;
	}
	/**
	 * 
	 * @param mission_Operator
	 */
	public void setMission_Operator(String mission_Operator) {
		Mission_Operator = mission_Operator;
	}
	/**
	 * 
	 * @param sC
	 */
	private void addSC(Spacecraft sC) {
		// TODO Auto-generated method stub
		Space_Crafts.add(sC);
	}
	/**
	 * 
	 * @return mission operator
	 */
	public String getMission_operator() {
		return Mission_Operator;
	}
	/**
	 * 
	 * @param mission_operator
	 */
	public void setMission_operator(String mission_operator) {
		Mission_Operator = mission_operator;
	}
	/**
	 * 
	 * @return mission year
	 */
	public String getMission_Year() {
		return Mission_Year;
	}
	/**
	 * 
	 * @param mission_Year
	 */
	public void setMission_Year(String mission_Year) {
		Mission_Year = mission_Year;
	}
	/**
	 * 
	 * @return mission type
	 */
	public String getMission_Type() {
		return Mission_Type;
	}
	/**
	 * 
	 * @param mission_Type
	 */
	public void setMission_Type(String mission_Type) {
		Mission_Type = mission_Type;
	}
	/**
	 * 
	 * @return spacecraft
	 */
	public ArrayList<Spacecraft> getSpace_Crafts() {
		return Space_Crafts;
	}
	/**
	 * 
	 * @param space_Crafts
	 */
	public void setSpace_Crafts(ArrayList<Spacecraft> space_Crafts) {
		this.Space_Crafts = space_Crafts;
	}
	/**
	 * 
	 * @return crew member
	 */
	public ArrayList<Astronaut> getCrew_Members() {
		return Crew_Members;
	}
	/**
	 * 
	 * @param crew_Members
	 */
	public void setCrew_Members(ArrayList<Astronaut> crew_Members) {
		this.Crew_Members = crew_Members;
	}
	/**
	 * string format
	 */
	public String toString() {
		String a = "Mission: ";
		if(this.mission.equals("apollo11")) {
			a += "Apollo 11" + "\n";
		}
		else if(this.mission.equals("apollo13")) {
			a += "Apollo 13" + "\n";
		}
		else {
			a += "Apollo 15" + "\n";
		}
		a += this.Mission_Type + "\n" + " Operated By: " + this.Mission_Operator + "\n\tYear: " + this.Mission_Year;
		a += "\n";
		for( int i = 0; i < Crew_Members.size(); i++ ) {
			a += String.format("%s\n", Crew_Members.get(i).toString());
		}
		return a;
	}
	
}
