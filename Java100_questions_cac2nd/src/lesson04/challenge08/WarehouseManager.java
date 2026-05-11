/**
 * 第4章 倉庫番のお仕事
 *
 * 問題8 荷物の入れ替え（二つの配列の要素を入れ替える）
 *
 * AB興産から新たな荷物のセットを預かりました。
 * 5袋からなる荷物のセットで、それぞれ6～10の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定し、
 * それぞれの袋の値は重複しません。
 *
 * AB興産からの依頼は、以前から預かっている1～5の荷物と
 * 今回預かる6～10の荷物を再編し、奇数のみの配列と
 * 偶数のみの配列に分けるというものです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産から新たに預かった荷物と以前から預かっている荷物の
 *  中身を確認してください。
 *
 *  Yさん：
 *  はい、
 *  以前から預かっている荷物の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  今回預かった荷物の状態は、
 *  7,9,10,6,8
 *  です。
 *
 *  E主任：
 *  その二つの荷物を奇数群、偶数群で入れ替えてください。
 *
 *  Yさん：
 *  はい、入れ替えました。
 *  奇数群の荷物の状態は、
 *  3,5,1,9,7
 *  です。
 *
 *  偶数群の荷物の状態は、
 *  10,2,8,6,4
 *  です。
 *
 */

package lesson04.challenge08;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray1 = new int[5];
		int[] ABKosanArray2 = new int[5];

		//ここに重複チェックおよび値の代入処理を記述する①(1～5)
		int intputNum = 0; //１～５ランダム
		boolean loopFlag = false; //重複の有無

		for (int i = 0; i < ABKosanArray1.length; i++) { //出た値を順番に配列に入れる。iが配列の順番

			do { //重複チェック
				loopFlag = false;
				intputNum = (int) (Math.random() * 10) % 5 + 1; //ランダムの値を入れる

				for (int j = 0; j < ABKosanArray1.length; j++) { //すでに入っている数なのか調査している。
					if (ABKosanArray1[j] == intputNum) { //順番にさがして、一致していたら(すでに入っている値なら)true
						loopFlag = true;
						break; //forの繰り返しを終了。trueにしたのでやり直し。
					}
				}

			} while (loopFlag);//true=すでにその値がどこかに入っている間は繰り返す（やり直し）

			ABKosanArray1[i] = intputNum; //配列に入れる。次の値へ。
		}

		//ここに重複チェックおよび値の代入処理を記述する②(6～10)
		for (int i = 0; i < ABKosanArray2.length; i++) { //出た値を順番に配列に入れる。iが配列の順番

			do { //重複チェック
				loopFlag = false;
				intputNum = (int) (Math.random() * 10) % 5 + 6; //ランダムの値を入れる +5

				for (int j = 0; j < ABKosanArray2.length; j++) { //すでに入っている数なのか調査している。
					if (ABKosanArray2[j] == intputNum) { //順番にさがして、一致していたら(すでに入っている値なら)true
						loopFlag = true;
						break; //forの繰り返しを終了。trueにしたのでやり直し。
					}
				}

			} while (loopFlag);//true=すでにその値がどこかに入っている間は繰り返す（やり直し）

			ABKosanArray2[i] = intputNum; //配列に入れる。次の値へ。
		}

		System.out.println("E主任：");
		System.out.println("AB興産から新たに預かった荷物と以前から預かっている荷物の");
		System.out.println("中身を確認してください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("以前から預かっている荷物の状態は、");
		for (int i = 0; i < ABKosanArray1.length; i++) {
			System.out.print(ABKosanArray1[i]);
			if (i != (ABKosanArray1.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("今回預かった荷物の状態は、");
		for (int i = 0; i < ABKosanArray2.length; i++) {
			System.out.print(ABKosanArray2[i]);
			if (i != (ABKosanArray2.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("E主任：");
		System.out.println("その二つの荷物を奇数群、偶数群で入れ替えてください。\n");

		//ここに奇数群(ABKosanArray1)と偶数群(ABKosanArray2)に振り分ける処理を記述する。

		for (int i = 0; i < ABKosanArray1.length; i++) {//１から順番に偶数を探す
			if (ABKosanArray1[i] % 2 == 0) { //偶数を見つけたら
				for (int j = 0; j < ABKosanArray2.length; j++) {
					if (ABKosanArray2[j] % 2 != 0) { //追加の配列から奇数を探す
						int stock = ABKosanArray1[i]; //1回避難させる（１の配列）
						ABKosanArray1[i] = ABKosanArray2[j]; //２の配列のやつを移す
						ABKosanArray2[j] = stock;
					}
				}
			}
		}

		System.out.println("Yさん：");
		System.out.println("はい、入れ替えました。");
		System.out.println("奇数群の荷物の状態は、");
		for (int i = 0; i < ABKosanArray1.length; i++) {
			System.out.print(ABKosanArray1[i]);
			if (i != (ABKosanArray1.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("偶数群の荷物の状態は、");
		System.out.println("");
		for (int i = 0; i < ABKosanArray2.length; i++) {
			System.out.print(ABKosanArray2[i]);
			if (i != (ABKosanArray2.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
