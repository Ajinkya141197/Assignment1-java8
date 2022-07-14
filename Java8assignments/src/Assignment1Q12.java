interface A {
	void max(int a[]);
}

public class Assignment1Q12 {
	public static void main(String[] args) {
		A numbers = (num) -> {
			int n = num.length;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (num[i] > num[j]) {
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
			}
			System.out.println("Maximum is  : " + num[n - 1]);
			for (int k = 1; k <= 5; k++) {
				System.out.println("1st 5 Largest are : " + k + " : " + num[n - k]);
			}
		};

		int array[] = { 12, 67, 8, 78, 45 };
		numbers.max(array);
	}

}