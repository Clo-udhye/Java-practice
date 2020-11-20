import java.util.Scanner;

public class Chapter5_ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("===========================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("===========================================");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			
			switch (selectNo) {
			case 1 :
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				break;
			case 2:
				scores = new int[studentNum];
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores["+i+"]: "+ scores[i] );
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for(int score : scores) {
					if(score>max) {
						max = score;
					}
					sum += score;
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + sum*1.0/studentNum);
				
				break;	
			case 5:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
