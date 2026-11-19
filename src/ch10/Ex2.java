package ch10; // 這個檔案屬於 ch10 套件

// 宣告公開類別 Ex2
public class Ex2 {

	// 定義 static 方法 sum，和 Ex1 不同的是：
	// - 回傳型別是 int：方法算完後會「交回」一個整數給呼叫者
	// - 方法本身不印東西，要怎麼顯示交給 main 決定
	static int sum(int start, int end, int difference) {
		int total = 0; // 累加用的變數，初始值 0

		// 計算首項為 start，末項為 end，且公差為 difference 的等差數列和
		for (int i = start; i <= end; i += difference)
			total += i; // 每一項加進 total

		return total; // 把計算結果回傳給呼叫的地方，方法到此結束
	}

	// main 方法：程式進入點
	public static void main(String[] args) {
		// sum(1, 10, 1) 會被替換成它的回傳值 55，再和前面的字串相接後印出
		System.out.println("1+2+...+10=" + sum(1, 10, 1));
		// sum(1, 99, 2) 回傳 2500
		System.out.println("1+3+...+99=" + sum(1, 99, 2));
		// sum(4, 97, 3) 回傳 1616
		System.out.println("4+7+...+97=" + sum(4, 97, 3));
	}
}
