/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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
		System.out.println("");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました");

	}

}
