/**
 * 第3章 探検隊のお仕事
 *
 * 問題7  ワニが現れた
 *
 * 進行方向にワニが3匹現れました。
 * このワニはそれぞれグーワニ、チョキワニ、パーワニの何れかです。
 *
 * グーワニは手をパーかグーにして見せるとおとなしくなり、
 * チョキワニは手をグーかチョキにして見せるとおとなしくなり、
 * パーワニは手をチョキかパーにして見せるとおとなしくなるのですが、
 * この3種は外見がまったく一緒で見分けがつきません。
 * （つまり、3匹がそれぞれ1種ずつである場合も
 *   3匹ともグーワニである可能性もあります。）
 *
 * この道を通り抜けるためには、 3匹にそれぞれ勝つか引き分けるか
 * しなければなりません。負けるとその時点でチャレンジ終了となります。
 *
 * コメントの位置にwhile文とif文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  ワニ3匹発見！
 *  グーワニかチョキワニかパーワニのどれかです。
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞2
 *
 *  隊長：
 *  相手はチョキワニでした。
 *  1匹目通り抜け成功！
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞3
 *
 *  隊長：
 *  相手はグーワニでした。
 *  2匹目通り抜け成功！
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞1
 *
 *  隊長：
 *  相手はグーワニでした。
 *  3匹目通り抜け成功！
 *
 *  隊長：
 *  川を渡り切りました。
 *
 * <通り抜けに失敗した場合の実行例>
 *  隊長：
 *  相手はグーワニでした。
 *  通り抜けに失敗しました...
 *
 * <範囲外の手が入力された場合の実行例>
 *
 *  隊長：
 *  そんな手はありませんよ。もう一度入れてください。
 *
 */

package lesson03.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("ワニ3匹発見！\n");
		System.out.println("グーワニかチョキワニかパーワニのどれかです。\n");

		int alligator = 0;
		int hand = 0;
		int i = 0; //成功回数のカウント

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//ここにwhile文、if文を利用した処理を記述
		while (i < 3) {
			System.out.println("どの手を出して通り抜けますか？");
			System.out.println("（グー… 1 : チョキ… 2 : パー… 3）＞");

			String str = br.readLine();
			hand = Integer.parseInt(str);

			alligator = (int) (Math.random() * 10 % 3) + 1; //なんでこれになるのかあまりわからない

			if (hand == 1) { //グーを選んだ時、ワニがパー = 3なら×
				if (alligator == 1 || alligator == 2) {
					i++;
					System.out.println("隊長：");
					String wani = (alligator == 1) ? "相手はグーワニでした。" : "相手はチョキワニでした。";
					System.out.println(wani);
					System.out.println(i + "匹目通り抜け成功！！");
				} else {
					System.out.println("隊長：");
					System.out.println("相手はパーワニでした。");
					break; //負けたら繰り返し終了。（終了しないと続いてしまう。）
				}
			} else if (hand == 2) { //チョキを選んだ時、ワニがグー = １なら×
				if (alligator == 2 || alligator == 3) {
					i++;
					System.out.println("隊長：");
					String wani = (alligator == 2) ? "相手はチョキワニでした。" : "相手はパーワニでした。";
					System.out.println(wani);
					System.out.println(i + "匹目通り抜け成功！！");
				} else {
					System.out.println("隊長：");
					System.out.println("相手はグーワニでした。");
					break;
				}
			} else if (hand == 3) { //パーを選んだ時、ワニがチョキ = ２なら×
				if (alligator == 3 || alligator == 1) {
					i++;
					System.out.println("隊長：");
					String wani = (alligator == 3) ? "相手はパーワニでした。" : "相手はグーワニでした。";
					System.out.println(wani);
					System.out.println(i + "匹目通り抜け成功！！");
				} else {
					System.out.println("隊長：");
					System.out.println("相手はチョキワニでした。");
					break;
				}
			} else { //その他が入力された場合。
				System.out.println("隊長：");
				System.out.println("そんな手はありませんよ。もう一度入力してください。");
			}

		}

		if (i == 3) //３回成功したら

		{
			System.out.println("隊長：");
			System.out.println("川を渡り切りました。");
		} else {
			System.out.println("通り抜けに失敗しました...");
		}

	}
}
