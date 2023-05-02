package rensyu_12;

public class Rensyu12_03 {

	public static void main(String[] args) {
		//3
		int[] dt= {5,7,9,14,7,4,2};//まずint型配列を作成
		graph(dt);		//上で作った配列を引数にしてgraphメソッドを呼び出す
	}
	public static void graph(int[] cnt) {
		for(int n:cnt) {	//配列で貰ったint型を拡張for文で繰り返し取り出す
			drow(n);		//配列から持ってきたint型の値を引数にしてdrowメソッドを呼び出す
		}
	}
	public static void drow(int dots) {
		for(int i=0;i<dots;i++) {	//繰り返し条件にiが引数の値未満ではなくなったら終了する
			System.out.print("#");	//引数の値分#をprintする
		}
		System.out.println();	//改行用
	}
}
