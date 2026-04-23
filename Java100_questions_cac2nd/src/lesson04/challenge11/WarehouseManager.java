/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] MQArrayC = new int[5];
		int[] MQArrayD = new int[5];
		int[] MQArrayE = new int[5];

		//ここに配列に値を代入する処理を記述する。(要素はランダム)

		int[][] MQArrayAll = new int[3][5];
		MQArrayAll[0] = MQArrayC;
		MQArrayAll[1] = MQArrayD;
		MQArrayAll[2] = MQArrayE;

		for (int i = 0; i < MQArrayAll.length; i++) {
			for (int j = 0; j < MQArrayAll[0].length; j++) {
				int rand = (int) (Math.random() * 10) % 4; //01234のどれか
				if (rand == 0) {
					MQArrayAll[i][j] = 0;
				} else {
					MQArrayAll[i][j] = (int) (Math.random() * 10) + 1; //１～１０のどれかを入れる
				}
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		System.out.print("C...");
		for (int i = 0; i < MQArrayC.length; i++) {
			System.out.print(MQArrayC[i]);
			if (i != (MQArrayC.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		System.out.print("\n\nD...");
		for (int i = 0; i < MQArrayD.length; i++) {
			System.out.print(MQArrayD[i]);
			if (i != (MQArrayD.length - 1)) {
				System.out.print(",");
			}
		}
		//ここに配列Eの要素をすべて出力する処理を記述する。
		System.out.print("\n\nE...");
		for (int i = 0; i < MQArrayE.length; i++) {
			System.out.print(MQArrayE[i]);
			if (i != (MQArrayE.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する

		int Array[] = new int[15];

		//一つの配列に入れる
		for (int i = 0; i < 5; i++) {
			Array[i] = MQArrayC[i];
			Array[i + 5] = MQArrayD[i];
			Array[i + 10] = MQArrayE[i];
		}
		//大きい順に並び変える。
		for (int i = 0; i < Array.length - 1; i++) {
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[i] < Array[j]) {
					int temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
				}
			}
		}
		//戻す（３つに分ける）
		for (int i = 0; i < 5; i++) {
			MQArrayC[i] = Array[i];
			MQArrayD[i] = Array[i + 5];
			MQArrayE[i] = Array[i + 10];
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < MQArrayC.length; i++) {
			System.out.print(MQArrayC[i]);
			if (i != (MQArrayC.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < MQArrayD.length; i++) {
			System.out.print(MQArrayD[i]);
			if (i != (MQArrayD.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < MQArrayE.length; i++) {
			System.out.print(MQArrayE[i]);
			if (i != (MQArrayE.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
