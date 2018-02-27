
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data;
		data = new int[10];
		Random r = new Random();

		int a[][] = { { 45, 2, 36, 89, 40 }, { 1, 1, 1, 1, 1, 1 }, { 1, 2, 3, 4, 5 }, { 321, 325, 5, 34, 52, 33, 45 },
				{ 5, 4, 3, 2, 1 }, { 33, 2, 23, 5, 3, 2, 5, 32, 5 } };

		for (int i = 0; i < 10; i++) {
			data[i] = r.nextInt(100);
		}

		// 測試用顯示目前值
		System.out.println("\n 隨機產生的數列");
		for (int i = 0; i < 10; i++) {
			System.out.print(data[i] + " ");
		}

		// 測資
		System.out.println("\n 測資");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		BubbleSort bs = new BubbleSort();

		bs.bubbleSort(data);

		for (int i = 0; i < a.length; i++) {
			bs.bubbleSort(a[i]);
		}
		System.out.println("\nBubble sort complete");

		// 測試用顯示完成BubbleSort值
		System.out.println("\n 隨機產生的數列經過氣泡排序");
		for (int i = 0; i < 10; i++) {
			System.out.print(data[i] + " ");
		}

		// 測資
		System.out.println("\n測資 要長這樣:2 36 40 45 89");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public void bubbleSort(int[] data) {
		// 變數名稱錯誤
		int length = data.length;

		// 這裡應該表示回合(使用Refactor->Rename的功能)
		for (int round = 0; round < length - 1; round++) {
			for (int i = 0; i < length - round - 1; i++) {
				if (data[i] > data[i + 1]) {
					swap(data, i, i + 1);
				}
			}
		}
	}

	// 把swap抽出來
	public static void swap(int[] data, int a, int b) {
		int temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}

}
