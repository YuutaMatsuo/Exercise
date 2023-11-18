
public class Exercise02 {

	public static void main(String[] args) {
//		練習２
//		２つの数の足し算、引き算、掛け算、割り算を行うことができる簡易的な計算機プログラムを
//		作成せよ。ただし割り算の結果は商のみとする。
//		計算のための2つの数、およびどの計算を行うかの演算子の指定はキーボード入力で行う。
//		また、計算が終わるたびに、計算を続けるかを確認し、続ける場合は直前の計算結果に対して
//		引き続き計算処理を行うこと。
//			
//		【前提条件】
//		・キーボードから受け付ける計算のための値は、5桁以内の1以上の整数が必ず入力される
//		ものとする。
//		・キーボードから受け付ける演算子は+、-、*、/のいずれかが必ず入力されるものとする。

		String isContinue;
		int result;
		int num1;
		int num2;
		String operator;

		do {
			// コンソールから入力を受け取る
			System.out.print("1つ目の数：");
			num1 = new java.util.Scanner(System.in).nextInt();
			System.out.print("演算子（+、-、*、/）：");
			operator = new java.util.Scanner(System.in).nextLine();
			System.out.print("2つ目の数：");
			num2 = new java.util.Scanner(System.in).nextInt();
			// 計算処理
			result = calculation(operator, num1, num2);
			// 結果を出力
			System.out.println("答えは" + result + "です");

			System.out.print("計算を続けますか（y、n）：");
			isContinue = new java.util.Scanner(System.in).nextLine();
			//改行を行う

		} while (isContinue.equals("y"));
		System.out.println("\nプログラムを終了します。");

	}

	public static int calculation(String operator, int num1, int num2) {
		int result;
		switch (operator) {
		case "+":
			result = num1 + num2;
			return result;
		case "-":
			result = num1 - num2;
			return result;
		case "*":
			result = num1 * num2;
			return result;
		case "/":
			result = num1 / num2;
			return result;
		}
		return result = 99999;
	}

}
