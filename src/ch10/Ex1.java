package ch10; // 這個檔案屬於 ch10 套件（對應 src/ch10 資料夾）

// 宣告公開類別 Ex1，類別名稱必須和檔名 Ex1.java 相同
public class Ex1 {

	// 定義一個 static 方法 sum：
	// - static：不用建立物件，main 可以直接呼叫
	// - void  ：這個方法「沒有回傳值」，結果直接在方法裡印出來
	// - 三個參數：start（首項）、end（末項）、difference（公差）
	static void sum(int start, int end, int difference) {
		int total = 0; // 用來累加總和的變數，一開始設為 0

		// 計算首項為 start，末項為 end，且公差為 difference 的等差數列和
		// i 從 start 開始，每次加 difference，直到超過 end 為止
		for (int i = start; i <= end; i += difference)
			total += i; // 把目前這一項 i 加進 total（等同 total = total + i）

		// 印出算式與結果，例如：1+2+...+10=55
		// (start + difference) 是第二項，要加括號，否則會被當成字串相接
		System.out.println(start + "+" + (start + difference) + "+...+" + end + "=" + total);
	} // sum 方法結束；因為是 void，不需要 return

	// main 方法：程式的進入點，執行時從這裡開始
	public static void main(String[] args) {
		sum(1, 10, 1);  // 呼叫 sum：1+2+3+...+10，公差 1
		sum(1, 99, 2);  // 呼叫 sum：1+3+5+...+99，公差 2（奇數和）
		sum(4, 97, 3);  // 呼叫 sum：4+7+10+...+97，公差 3
	}
}
