package rensyu_12;

import lib.Input;

public class Rensyu12_02 {

	public static void main(String[] args) {
		String text=Input.getString("テストする文字列");
		if(isEmpty(text)) {
			System.out.println("null又は空");
		}else {
			System.out.println("nullでも空でもない");
		}
	}
	public static boolean isEmpty(String moji) {
		return moji==null||moji.length()==0;	//戻り値が関係演算子の式であってたらtrue,間違えていたらfalseが戻り値として渡される。
	}
}
