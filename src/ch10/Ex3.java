package ch10; // 這個檔案屬於 ch10 套件

import java.util.Scanner; // 匯入 Scanner 類別，用來讀取鍵盤輸入

// 宣告公開類別 Ex3
public class Ex3 {

	// 定義 Ex3 類別的 transform 方法：將攝氏溫度轉成華氏溫度
	// - public static：公開、不用建立物件就能呼叫
	// - double（回傳型別）：回傳一個小數
	// - double c（參數）：接收攝氏溫度
	public static double transform(double c) {
		// 攝氏轉華氏公式：F = C × 9 / 5 + 32
		// 注意：這裡改的是「參數 c」，它只是 main 裡 c 的一份複本（傳值），
		// 所以不會影響 main 裡的變數 c
		c = c * 9 / 5 + 32;
		return c; // 回傳換算後的華氏溫度
	}

	// main 方法：程式進入點
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); // 建立 Scanner 物件，從鍵盤（System.in）讀資料
		System.out.print("請輸入攝氏溫度:");      // 提示使用者輸入（print 不換行）
		double c = keyin.nextDouble();           // 讀入一個小數，存到變數 c

		// 印出結果：前面的 c 仍是原本的攝氏溫度（因為傳值，沒被改到），
		// transform(c) 則會被替換成算好的華氏溫度
		System.out.print("攝氏溫度" + c + "℃=華氏溫度" + transform(c) + "℉");

		keyin.close(); // 用完 Scanner 要關閉，釋放資源
	}
}
