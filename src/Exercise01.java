
public class Exercise01 {

	public static void main(String[] args) {
//		練習１ 
//		ユーザーとコンピュータで1対1のじゃんけんを行うことができるプログラムを作成せよ。
//		ユーザーの出す手はキーボードから入力させ、コンピュータの出す手はグー、チョキ、パーの
//		３つから毎回ランダムに１つを選択する。また、あいこの場合はもう一度じゃんけんをやり直す
//		こと。
//
//		【前提条件】
//		・キーボードからの入力値は、1~3の整数以外は入力されないものとする。

		// 変数を宣言

		String[] rpsArray = { "グー", "チョキ", "パー" };
		int player;
		int cpu;
		String result;

		do {
			System.out.println("じゃんけんゲームをはじめます。");
			System.out.print("出したい手を選んでください（1:グー 2:チョキ 3:パー）\n>>");
			
			//player: コンソールからの入力を受け取る cpu: ランダムに１～３の値を生成する
			player = new java.util.Scanner(System.in).nextInt();
			cpu = new java.util.Random().nextInt(1,3);
			//じゃんけんの処理
			result = rockPaperScissors(player,cpu);
			//結果を出力
			System.out.println("あなた：" + rpsArray[cpu-1] + " わたし：" + rpsArray[player-1]);
			System.out.println(result);
			
		} while (player == cpu);
	}
	
	//じゃんけんの勝ち負け処理 (１：グー２：チョキ３：パー とした時のplayer - cpuの値を計算し勝ち負けを判定する）
	public static String rockPaperScissors(int player,int cpu) {
		String result;
		int calc = player - cpu;
		switch(calc) {
		case -1:
		case 2:
			return result = "あなたの勝ちです！";
		case 1:
		case -2:
			return result = "ざんねん！あなたの負けです。";
		case 0:
			return result = "あいこですね。もう一回！";
		}
		return result = "入力に誤りがあります";
	}

}
