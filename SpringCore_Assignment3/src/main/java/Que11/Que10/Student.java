package Que10;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Student {
	  private Map<String,Integer> MapObj = new HashMap<String, Integer>();

	

	public Map<String, Integer> getMapObj() {
		return MapObj;
	}



	public void setMapObj(Map<String, Integer> mapObj) {
		this.MapObj = mapObj;
	}



	@Override
	public String toString() {
		return "Student [mapObj=" + MapObj + "]";
	}
	  
public void show() {
	System.out.println(MapObj);
}



public void studentCheck() {
	
	Object names=MapObj.entrySet().stream()
          .max((obj1,obj2)-> obj1.getValue()>obj2.getValue()? 1:-1).get();
     	System.out.println("Maximum Marks Obtain To Student : "+names);
     	System.out.println("Marks In Ascending Order:");
     	MapObj.entrySet().stream().map(e->e.getValue()).sorted().forEachOrdered(System.out::println);
     	System.out.println("Marks In Descending Order:");
  	MapObj.entrySet().stream().map(e->e.getValue()).sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);
  	
}

}
