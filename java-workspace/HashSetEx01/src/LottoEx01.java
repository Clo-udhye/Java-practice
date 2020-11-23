import java.util.HashSet;
import java.util.Random;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> lotto = new HashSet<Integer>();
		Random random = new Random();
		HashSet[] lottos = new HashSet[5];

		for(int i=0; i<lottos.length; i++) {
			
			while(lotto.size() != 6) {
				lotto.add(random.nextInt(45)+1);
			}

			lottos[i] = new HashSet(lotto);
			lotto.clear();

		}
		
		for(HashSet hs:lottos) {
			System.out.println(hs);
		}
		

		/*
		HashSet<Integer> lottos = new HashSet<Integer>();

		while( true ) {
			lottos.add((int)(Math.random()*45) + 1);
			if(lottos.size() == 6) {
				break;
			}
		}

		for(Integer i : lottos) {
			System.out.println(i);
		}
		 */
	}

}
