import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
//		練習５ 
//		各生徒の5教科（国語・算数・理科・社会・英語）の点数をキーボードから入力させ、
//		その点数から各教科の平均点、および生徒ごとの合計点を計算し、表示するプログラムを作成
//		せよ。平均点は小数点以下を切り捨てて表示すること。
//		生徒が何人であるかはプログラム起動時にキーボードから入力してもらうものとする。
//
//		【前提条件】
//		・キーボードから受け付ける値は必ず正の整数が入力されるものとする。
		
		System.out.print("クラスの人数を入力してください>>");
		int people = new Scanner(System.in).nextInt();
		
		int[][] score = new int[people][5];
		int[] sum = new int[people];
		int[] average = new int[5];
		int[] subjectSum = new int[5];
		String[] subject = {"国語","算数","理科","社会","英語"};
		
		for (int i = 0; i < people; i++) {
			System.out.println((i + 1) + "人目の各科目の点数を入力してください。");
			for (int j = 0; j < 5; j++) {
				System.out.print(subject[j] + ">>");
				score[i][j] = new Scanner(System.in).nextInt();
				sum[i] += score[i][j];
				subjectSum[j] += score[i][j];
			}
		}
		
		for (int i = 0; i < 5; i++) {
			average[i] = subjectSum[i] / people;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(subject[i] + "の平均点：" + average[i] );
		}
		
		for (int i = 0; i < people; i++) {
			System.out.println((i + 1) + "人目の合計点：" + sum[i]);
		}
	}
}
