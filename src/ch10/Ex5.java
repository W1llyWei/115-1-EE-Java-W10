package ch10; // 這個檔案屬於 ch10 套件

import java.util.Scanner; // 匯入 Scanner 類別，用來讀取鍵盤輸入

// 宣告公開類別 Ex5
public class Ex5 {

	// 定義 Ex5 類別的 transpose 方法：求一矩陣的轉置矩陣
	// 轉置：把 [i][j] 和 [j][i] 互換（列變行、行變列）
	// - int[][] xmatrix：參數是二維整數陣列，同樣是「傳參考」，
	//   在這裡交換元素，main 裡的 matrix 也會被改到
	public static void transpose(int[][] xmatrix) {
		int temp; // 作為二維整數陣列 xmatrix 的元素交換之用（暫存）

		// xmatrix.length 是列數（這裡是 3）
		for (int i = 0; i < xmatrix.length; i++)
			// j 只跑到 i 之前（j < i），也就是只處理「對角線下方」的元素
			// 如果整個矩陣都跑，每對元素會被交換兩次，又變回原樣
			for (int j = 0; j < i; j++) {
				temp = xmatrix[i][j];          // 1. 先把 [i][j] 存到 temp
				xmatrix[i][j] = xmatrix[j][i]; // 2. 把 [j][i] 放到 [i][j]
				xmatrix[j][i] = temp;          // 3. 再把 temp（原本的 [i][j]）放到 [j][i]
			}
	}

	// main 方法：程式進入點
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); // 建立 Scanner 物件讀取鍵盤輸入
		int[][] matrix = new int[3][3];          // 宣告 3 列 3 行的二維整數陣列
		System.out.println("輸入一3x3的整數矩陣A:"); // 提示使用者輸入

		// 雙層迴圈：外層 i 控制列、內層 j 控制行，依序讀入 9 個數字
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				System.out.printf("A[%d][%d]=", i, j); // printf 格式化輸出，%d 會被 i、j 取代
				matrix[i][j] = keyin.nextInt();         // 讀入一個整數存到第 i 列第 j 行
			}

		// 印出轉置前的矩陣
		System.out.println("3x3整數矩陣A:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(matrix[i][j] + " "); // 同一列的元素印在同一行，用空白隔開
			System.out.println();                     // 一列印完就換行
		}

		transpose(matrix); // 呼叫方法轉置；因為傳參考，matrix 本身被轉置了

		// 印出轉置後的矩陣（印法和上面相同）
		System.out.println("轉置後的3x3整數矩陣A:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}

		keyin.close(); // 關閉 Scanner
	}
}
