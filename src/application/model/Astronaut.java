
package application.model;
/**
 * 
 * @author cameron perez yso443
 *
 */
public class Astronaut{
	private String AST_Name;
	private String AST_Pos;
	/**
	 * 
	 * @param new_Ast
	 * @param new_Pos
	 */
	public Astronaut(String new_Ast, String new_Pos) {
		this.AST_Name = new_Ast;
		this.AST_Pos = new_Pos;
	}
	/**
	 * 
	 * @return astronaut name
	 */
	public String getAST_Name() {
		return AST_Name;
	}
	/**
	 * 
	 * @param aST_Name
	 */
	public void setAST_Name(String aST_Name) {
		AST_Name = aST_Name;
	}
	/**
	 * 
	 * @return astronaut position
	 */
	public String getAST_Pos() {
		return AST_Pos;
	}
	/**
	 * 
	 * @param aST_Pos
	 */
	public void setAST_Pos(String aST_Pos) {
		AST_Pos = aST_Pos;
	}
	/**
	 * string format
	 */
	public String toString() {
		return String.format("%s: %s", this.getAST_Pos(), this.getAST_Name());
	}
	
	
}
