/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題3 マカロンを作る
 *
 * シトロン、ショコラ、ピスターシュを30個ずつ作成します。
 * シトロン、ショコラ、ピスターシュの個数を格納する変数を
 * 宣言し、それぞれに30を代入してください。
 * [問題2]の表示を以下の実行例のように改変します。
 * （表示する個数はそれぞれの変数の値とします。）
 *
 * <実行例>
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り30個
 * ショコラ      \280 ・・・ 残り30個
 * ピスターシュ  \320 ・・・ 残り30個
 *
 */

package lesson01.challenge03;

public class Patisserie {
	public class Patisserie {
		public static void main(String[] args) {
			int a = 30;
			int b = 30;
			int c = 30;

			System.out.println("本日のおすすめ商品です。");
			System.out.println();
			System.out.println("シトロン　　  \\250 ・・・ 残り" + a + "個");
			System.out.println("ショコラ      \\280 ・・・ 残り" + b + "個");
			System.out.println("ピスターシュ  \\320 ・・・ 残り" + c + "個");

		}
}
