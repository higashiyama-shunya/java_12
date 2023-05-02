package rensyu_12;

import lib.Input;

public class Rensyu12_01 {

	public static void main(String[] args) {
		//P283 通過テスト
		//1
		int mile=Input.getInt("マイル");
		System.out.println(mileToKm(mile)+"km");

	}
	
	public static double mileToKm(int num) {	//メソッドを作成する（）の中が引数でメソッドに渡される値
		double km=num*1.609344;	//引数kmに引数にマイルを貰った計算でkmに直した値を代入する。
		return km;//戻り値でkmに戻す。
	}

}
