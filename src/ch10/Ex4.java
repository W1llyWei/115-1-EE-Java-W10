package ch10; // 這個檔案屬於 ch10 套件

import java.util.Arrays;  // 匯入 Arrays 類別，提供 sort（排序）等陣列工具
import java.util.Scanner; // 匯入 Scanner 類別，用來讀取鍵盤輸入

// 宣告公開類別 Ex4
public class Ex4 {

	// 定義 Ex4 類別的 sortArray 方法：將陣列排序
	// - void：沒有回傳值
	// - int[] xdigit：參數是一個整數陣列
	// 重點：陣列傳進方法時傳的是「參考（位址）」，
	// xdigit 和 main 裡的 digit 指向「同一個」陣列，
	// 所以在這裡排序，main 裡的 digit 也會跟著變成排序好的樣子
	public static void sortArray(int[] xdigit) {
		Arrays.sort(xdigit); // 由小到大排序陣列
	}

	// main 方法：程式進入點
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); // 建立 Scanner 物件讀取鍵盤輸入
		int[] digit = new int[5];               // 宣告一個可以放 5 個整數的陣列（索引 0~4）
		System.out.println("請輸入5個整數:");     // 提示使用者輸入

		// 用迴圈讀入 5 個整數，依序存進 digit[0] ~ digit[4]
		for (int i = 0; i < 5; i++)
			digit[i] = keyin.nextInt();

		// 印出使用者輸入的 5 個數字，用逗號隔開
		for (int i = 0; i < 5; i++)
			if (i <= 3)                           // 前 4 個（索引 0~3）後面加逗號
				System.out.print(digit[i] + ",");
			else                                  // 最後一個（索引 4）不加逗號
				System.out.print(digit[i]);

		sortArray(digit); // 呼叫方法排序；因為傳參考，digit 本身被排序了

		// 排序後由小到大，最後一個元素 digit[4] 就是最大值
		System.out.println("的最大值為" + digit[4]);

		keyin.close(); // 關閉 Scanner
	}
}
