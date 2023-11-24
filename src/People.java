import java.util.ArrayList;
import java.util.Collections;
public class People {

	//Properties (Fields)
	private ArrayList<Integer> vals;
	private String name;
	//Methods
	public People() {//CONSTRUCTOR
		vals=new ArrayList<>();
		this.name="Anonymous";
	}
	
	public People(String n) {
		this.name=n;
		vals=new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addValue(int value) {
		vals.add(value);
	}
	
	public int getMax() {
		//If there are no values, return 0
		if (vals.size()==0) {
			return 0;
		}
		Collections.sort(vals);
		return (vals.get(vals.size()-1));	
	}

	public int getMin() {
		if (vals.size()==0) {
			return 0;
		}
		Collections.sort(vals);
		return (vals.get(0));
	}

	public double getAvg() {
		//add all the values
		//divide by the size
		if (vals.size()==0) {
			return 0;
		}
		double avg=0;
		for (Integer i:vals) {
			avg+=i;
		}
		avg/=vals.size();
		return avg;
	}
}
