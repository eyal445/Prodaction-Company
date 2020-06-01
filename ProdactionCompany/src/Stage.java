
public class Stage {
private String name;
private int stageCost;
private int numberOfSits;
private int sitCost;
public Stage(String name, int stageCost, int numberOfSits, int sitCost) {
	this.name = name;
	this.stageCost = stageCost;
	this.numberOfSits = numberOfSits;
	this.sitCost = sitCost;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStageCost() {
	return stageCost;
}
public void setStageCost(int stageCost) {
	this.stageCost = stageCost;
}
public int getNumberOfSits() {
	return numberOfSits;
}
public void setNumberOfSits(int numberOfSits) {
	this.numberOfSits = numberOfSits;
}
public int getSitCost() {
	return sitCost;
}
public void setSitCost(int sitCost) {
	this.sitCost = sitCost;
}
@Override
public String toString() {
	return "Stage [name=" + name + ", stageCost=" + stageCost + ", numberOfSits=" + numberOfSits + ", sitCost="
			+ sitCost + "]";
}
}
