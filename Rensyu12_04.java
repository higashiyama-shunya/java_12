package rensyu_12;

import lib.Input;

public class Rensyu12_04 {

	public static void main(String[] args) {
		//4
		double height=Input.getDouble("高さ");
		double width=Input.getDouble("横");
		double depth=Input.getDouble("奥行");	//3辺の長さを入力値として受け取る
		if(isOk(height,width,depth)) {		//isOkメソッドを呼び出す  合計が180以下だったらtrue
			double weight=Input.getDouble("重さ");	//重さも入力値として受け取る
			int ryokin=ryokin(height,width,depth,weight);		//ryokinメソッドを呼び出してint型の変数に代入
			System.out.println(ryokin+"円です");	//表示する
		}else {
			System.out.println("サイズオーバーです");
		}

	}
	public static boolean isOk(double height,double width,double depth) {
		return height+width+depth<=180;		//returnを関係演算式にして超えていたらfalseになる
	}
	public static int ryokin(double height,double width, double depth,double weight) {
		if(height+width+depth<=90) {	//3辺の長さが90以下の場合
			if(weight<=5) {
				return 500;
			}else if(weight<=10) {
				return 1000;
			}else {
				return 1500;		//それぞれの重さで戻り値が分岐する
			}
			}else {					//それ以外の場合（90以上の場合)※180以上の場合はisOkメソッドではじかれる
				if(weight<=5) {
				return 1000;
			}else if(weight<=10) {
				return 2000;
			}else {
				return 3000;		//それぞれの重さで戻り値が分岐する。
			}
		}
	
	}
}
