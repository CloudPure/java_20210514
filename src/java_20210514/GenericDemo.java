package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		// 특정 클래스(ArrayList)에 원하는 자료형(<String>)을 명시하여
		ArrayList<String> list = new ArrayList(); // 2. 그래서 데이터 안에 수정해줘야함
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		for(int i = 0; i < list.size(); i++) {
			String value = (String)list.get(i);
			System.out.println(value);// 1. 3번째 찍으려고 했는데 int 타입이라 안 뽑아짐! 아예 실행을 못 시키니까
		}
		
		for(String value : list) {
			System.out.println(value);
		}
	}

}
