import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrs = {"aaa", "bbb", "ccc"};
		
		System.out.println(Arrays.toString(arrs));
		
		Arrays.fill(arrs, "xxx");	//공간의 초기화, 전부 "xxx"로 채움
		System.out.println(Arrays.toString(arrs));
		
		Arrays.fill(arrs, 0, 2, "yyy"); // 부분 초기화 0 ~ /2
		System.out.println(Arrays.toString(arrs));
	
	
		String[] arrs1 = {"aaa", "bbb", "ccc"};
		String[] arrs2 = {"aaa", "bbb", "ccc"};
		
		// 비교하기
		System.out.println(arrs1 == arrs2);		//false -> 참조값의 비교이기 때문
		System.out.println(Arrays.equals(arrs1, arrs2));	// true -> 값의 비교
		
		// 정렬
		Integer[] nums = {5, 2, 3, 1, 4};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
	}

}
