
public class Class {
	
	String name;
	int level;
	
	Class(String hName, int hLevel){
		name = hName;
		level = hLevel;
		
	}
	
	void stats() {
		System.out.print("Hero " + name + " is at level " + level);
	}
}
