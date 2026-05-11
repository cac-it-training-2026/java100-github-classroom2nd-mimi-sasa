/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		//最後の文字が数字であれば変換を行うため、最後の文字のインデックスを記録する
		//要素３個なら[0][1][2]のうちの[2]なので、-1する
		int lastIndex = item.length() - 1;

		//文字列から指定した位置の１文字を取り出すStringのメソッドcharAt（）
		//最後の文字を取り出す
		char lastch = item.charAt(lastIndex);
		//取り出した１文字を引数としてchangeLastCharメソッドを呼ぶ。戻り値をchangeStrへ
		String changeStr = changeLastChar(lastch);

		if (changeStr != null) {
			//StringBuffer　中身を書き換えられる文字列を扱うためのクラス
			StringBuffer sb = new StringBuffer(item);

			//置き換え　　sb.replace(開始位置, 終了位置, 置き換える文字列);　＋１の場所は含まれない(lastIndexの位置を置き換える)
			//置き換え後はそのままsbに入る
			sb.replace(lastIndex, lastIndex + 1, changeStr);
			this.item = new String(sb);
		} else {
			//null=数字じゃなかった時なので何もせずそのままitemへ
			this.item = item;
		}
	}

	private String changeLastChar(char ch) {

		//数字がない場合もあるので、最初はnullにする
		String changeStr = null;
		switch (ch) {
		case '0':
			changeStr = "zero";
			break;
		case '1':
			changeStr = "one";
			break;
		case '2':
			changeStr = "two";
			break;
		case '3':
			changeStr = "three";
			break;
		case '4':
			changeStr = "four";
			break;
		case '5':
			changeStr = "five";
			break;
		case '6':
			changeStr = "six";
			break;
		case '7':
			changeStr = "seven";
			break;
		case '8':
			changeStr = "eight";
			break;
		case '9':
			changeStr = "nine";
			break;
		default:
			break;
		}
		return changeStr;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		item = omegalian.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
