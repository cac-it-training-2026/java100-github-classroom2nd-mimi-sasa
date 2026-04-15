/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("シトロン   >");
		String str = reader.readLine();
		int num = Integer.parseInt(str);

		System.out.println("ショコラ  >");
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);

		System.out.println("ピスターシュ   >");
		String str3 = reader.readLine();
		int num3 = Integer.parseInt(str3);

		System.out.println("シトロン　      " + num + "個");
		System.out.println("ショコラ　    　" + num2 + "個");
		System.out.println("ピスターシュ　　" + num3 + "個");

		int goukei = num + num2 + num3;
		int kingaku = num * 250 + num2 * 280 + num3 * 320;

		System.out.println("\n合計個数　　" + goukei + "個");
		System.out.println("合計金額　　" + kingaku + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。");

		int d = 30 - num;
		int e = 30 - num2;
		int f = 30 - num3;

		System.out.println("シトロン　　  \\250 ・・・ 残り" + d + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + e + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + f + "個");

	}
}
