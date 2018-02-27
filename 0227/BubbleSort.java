import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data;
		data = new int[10];
		Random r = new Random();
		
        int a [] = {45,2,36,89,40};
        
		for (int i = 0; i < 10; i++) {
			data[i] = r.nextInt(100);
		}
		
		//測試用顯示目前值
		System.out.println("\n 隨機產生的數列");
		for (int i = 0; i < 10; i++) {
			System.out.print(data[i] + " ");
		}
		
		//測資
		System.out.println("\n 測資 : 45 2 36 89 10");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		BubbleSort bs = new BubbleSort();

		bs.bubbleSort(data);
		bs.bubbleSort(a);
		System.out.println("\nBubble sort complete");
		
		//測試用顯示完成BubbleSort值
		System.out.println("\n 隨機產生的數列經過氣泡排序");
		for (int i = 0; i < 10; i++) {
			System.out.print(data[i] + " ");
		}
		
		//測資
		System.out.println("\n測資 要長這樣:2 36 40 45 89");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public void bubbleSort(int[] data) {
	 
		int length = data.length - 1;
		int temp = 0;
		for (int path = 0; path < length; path++) {
			for (int i = 0; i < length - path; i++) {
				if (data[i] > data[i + 1]) {
					temp = data[i]; 
                    data[i] = data[i+1];
                    data[i+1] = temp;
				}
			}
		}
	}
}
