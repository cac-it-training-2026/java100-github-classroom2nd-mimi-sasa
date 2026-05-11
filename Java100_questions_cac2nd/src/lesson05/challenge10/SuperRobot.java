package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここに問題7で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：makeEggDishes(引数int flourNum, int sugarNum, int eggNum, int butterNum、
//戻り値String、作成できるメニューを戻り値として返す。また、作成できるメニューが無い場合はnull値を返す)

class Robot {
	String makeEggDishes(int pieNum, int hourensouNum, int eggNum, int bekonNum) {
		int pie = pieNum - 2; //マイナスになったら足りないので作れない
		int hourensou = hourensouNum - 50;
		int egg = eggNum - 2;
		int bekon = bekonNum - 100;

		String menu = null;
		if ((pie >= 0) && (hourensou >= 0) && (egg >= 0) && (bekon >= 0)) {
			menu = "キッシュ";
		} else if ((egg >= 0) && (hourensou >= -75)) {
			menu = "オムレツ";
		} else {
			menu = null;
		}
		return menu;
	}

}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("もうちょっと豪華料理の調理機能が欲しいですね。\n");
		System.out.println("G博士：");
		System.out.println("では材料の分量に応じて作るメニューを変える機能を入れてみようかの。\n");
		System.out.println("Rさん：");
		System.out.println("そんなことが出来るんですか！\n");
		System.out.println("G博士：");
		System.out.println("出来るとも。パイシート２枚、ほうれん草50g、卵2個、ベーコン100gがそろえばキッシュを作る。\n");
		System.out.println("G博士：");
		System.out.println("キッシュが出来ない場合で、卵2個、ほうれん草50gがそろえばオムレツを作る。\n");
		System.out.println("それ以外の場合は何も作らないようにするんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("それは凄そうですね。完成をお待ちしています。\n");
		System.out.println("G博士：");
		System.out.println("......出来たぞ！早速動かしてみよう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("パイシートの枚数を入力してください（枚）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\nほうれん草の量を入力してください（グラム）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nベーコンの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeEggDishesを実行する。
		//標準出力でメニューを表示する。
		Robot robot = new Robot();
		String menu = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum);
		if (menu != null) {
			System.out.println(menu + "が出来ました。");
		} else {
			System.err.println("何も作れません。");
		}
	}

}
