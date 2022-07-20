package Que5;

import java.util.Comparator;
import java.util.List;

public class Numbers {
	List<Integer> num;

	public List<Integer> getNum() {
		return num;
	}



	public void setNum(List<Integer> num) {
		this.num = num;
	}



	public void findMaximumNumber() {

		int max=num.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The Maximum number is:"+max);
	}
}
