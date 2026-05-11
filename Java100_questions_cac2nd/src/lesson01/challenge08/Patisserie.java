/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\nシトロン　　  \\250 ・・・ 残り" + a + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + b + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + c + "個");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

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
		//金額は切り捨て
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

		System.out.println("閉店時間となりました");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("売り上げの割合");
		System.out.println("売り上げ合計 ・ ・ ・  \\" + kingaku);

		System.out.println("\n内訳");
		System.out.println("シトロン　　  \\" + (int) (num * 250) + " ・ ・ ・ " + (int) ((num * 250) / kingaku * 100) + "%");
		System.out
				.println("ショコラ      \\" + (int) (num2 * 280) + " ・ ・ ・ " + (int) ((num2 * 280) / kingaku * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (num3 * 320) + " ・ ・ ・ " + (int) ((num3 * 329) / kingaku * 100) + "%");

	}

}
