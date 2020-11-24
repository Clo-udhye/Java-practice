import java.util.ArrayList;

public class ArrayListEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add("1");
		data1.add("2");
		data1.add("3");
		ArrayList<String> data2 = new ArrayList<String>();
		data2.add("11");
		data2.add("22");
		data2.add("33");
		ArrayList<String> data3 = new ArrayList<String>();
		data3.add("111");
		data3.add("222");
		data3.add("333");
		
		datas.add(data1);
		datas.add(data2);
		datas.add(data3);
		
		//System.out.println(datas.size());
		//System.out.println(datas.toString());
		
		// 일반for문을 이용해서 데이터 전부 접근하기
		/*
		for(int i=0; i<datas.size(); i++) {
			for(int j=0; j<datas.get(i).size(); j++) {
				System.out.println(datas.get(i).get(j));
			}
		}
		*/
		for(int i=0; i<datas.size(); i++) {
			ArrayList<String> data = datas.get(i);
			for(int j=0; j<data.size(); j++) {
				System.out.println(data.get(j));
			}
		}
		
		// 향상된 for문으로 .. 
		for(ArrayList<String> data: datas) {
			for(String str : data) {
				System.out.println(str);
			}
		}
		
	
	}

}
