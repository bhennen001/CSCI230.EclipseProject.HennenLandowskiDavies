/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author bhennen001
 *
 */
public class SimplePrint {
	private String pName;
	private int pAge;

	/**
	 * 
	 */
	public SimplePrint(String name, int age) {
		this.pName=name;
		this.pAge=age;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Cole, Ben, Logen");
		for(int i=0; i<args.length;i++) {
			System.out.println("args[ " + i + " ] = " + args[i]);
		}

	}

}
