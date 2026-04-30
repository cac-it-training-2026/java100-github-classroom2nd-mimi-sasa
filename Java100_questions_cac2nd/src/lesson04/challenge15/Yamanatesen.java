package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanatesen {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String[] stations = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！    \n");

		// 駅名の重複を記録する
		boolean[] stationFlag = new boolean[stations.length];

		// 配列の要素を全てtrueで初期化
		Arrays.fill(stationFlag, true); //fillで配列をまとめて初期化

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// コンピュータの回答の準備
		//Random型=乱数を扱うための型。nextInt()と組み合わせる
		Random rand = new Random();

		// 正解した時にtrueとなるフラグ
		boolean hitFlag = false;

		// ゲームの実行回数（プレイヤーとコンピュータがそれぞれ回答する度にプラス１）
		//駅の総数（配列stationの長さ）になったら終了
		int gameCount = 0;

		// 勝ち負けが決まるまで繰り返し
		do {
			String inputStationName = br.readLine();

			// プレイヤーの入力した駅名がOKかどうかを判定するための繰り返し（駅の総数まで繰り返す）
			for (int i = 0; i < stations.length; i++) {

				// プレイヤーの入力した駅名が配列に含まれていれば
				//equials　括弧の中身と文字列が一致しているか比較する
				if (stations[i].equals(inputStationName)) {

					// / その番号の駅が既出でないか判定する
					if (stationFlag[i]) {

						// 正解したという目印にフラグを立てる
						hitFlag = true;

						// この駅名はもう答えましたという意味でfalseに変えておく
						stationFlag[i] = false;

						// 内側のループを抜ける
						break;

						// 入力した駅名が既出であればゲームオーバー
					} else {

						// 内側のループを抜ける
						break;
					}
				}
			}

			// ゲームの実行回数を一つ増やす
			gameCount++;

			// プレイヤーが誤答した場合または全ての駅名が出尽くした場合
			if (!hitFlag || (gameCount == stations.length)) {

				// 外側のループを抜けて終了処理へ
				break;
			}
			// フラグをクリアしておく
			hitFlag = false;

			// コンピュータが回答するための繰り返し（正解するまで繰り返す）
			while (!hitFlag) {

				// 総駅数の範囲で乱数を取得
				//Randam型のやつ
				int num = rand.nextInt(stations.length);

				// その番号の駅が既出でないか判定する
				if (stationFlag[num]) {

					// 既出でなければ駅名を出力する
					System.out.println(stations[num]);

					// この駅名はもう答えましたという意味でfalseに変えておく
					stationFlag[num] = false;

					// 正解したという目印にフラグを立てる
					hitFlag = true;
				}
			}

			// ゲームの実行回数を一つ増やす
			gameCount++;

			// フラグをクリアしておく
			hitFlag = false;

			// 駅名が出尽くした場合ループを抜ける
		} while (gameCount != stations.length);

		// 駅名が出尽くしていればプレイヤーの勝ち、そうでなければ負け
		if (gameCount == stations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
