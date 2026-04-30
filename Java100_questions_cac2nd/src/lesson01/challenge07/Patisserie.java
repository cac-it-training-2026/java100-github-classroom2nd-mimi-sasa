/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました.");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int a = 30;
		int b = 30;
		int c = 30;

		System.out.println("本日のおすすめ商品です。");
		System.out.println();
		System.out.println("シトロン　　  \\250 ・・・ 残り" + a + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + b + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + c + "個");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//double型を使う
		System.out.println("シトロン   >");
		String str = reader.readLine();
		double num = Double.parseDouble(str);

		System.out.println("ショコラ  >");
		String str2 = reader.readLine();
		double num2 = Double.parseDouble(str2);

		System.out.println("ピスターシュ   >");
		String str3 = reader.readLine();
		double num3 = Double.parseDouble(str3);

		System.out.println("シトロン　      " + num + "個");
		System.out.println("ショコラ　    　" + num2 + "個");
		System.out.println("ピスターシュ　　" + num3 + "個");

		double goukei = num + num2 + num3;
		//金額は切り捨て　なので整数型に変換
		int kingaku = (int) num * 250 + (int) num2 * 280 + (int) num3 * 320;

		System.out.println("\n合計個数　　" + goukei + "個");
		System.out.println("合計金額　　" + kingaku + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。");

		//在庫は切り捨て
		int d = (int) (a - num);
		int e = (int) (b - num2);
		int f = (int) (c - num3);

		System.out.println("シトロン　　  \\250 ・・・ 残り" + d + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + e + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + f + "個");

	}
}
