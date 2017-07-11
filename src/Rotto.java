import java.util.Random;
import java.util.Scanner;

public class Rotto {
	
	public int[] data;
	public static int[] winner;
	
	
	//generate lotto
	public Rotto() {
		data = new int[6];
		//TODO: implement
		set_lotto();
	}
	
	public void set_lotto(){
		Random rnd = new Random();
		
		for(int i=0; i<6; i++){
			data[i] = rnd.nextInt(45);
		}
		sort_lotto();
	}
	
	public void sort_lotto(){
	
		int temp;
		for(int i=0; i<5; i++){
			for(int j=i; j<6; j++){
				if(data[i] >= data[j]){
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}
	
	//check winner
	public int checkLotto() {
		//check data and winner
		return 0;
	}
	
	public void setWinner(){
		
	}
	
	

	public static void main(String[] args){

		int volume, money, count, temp, six=0, five=0, four=0, three=0;
		double rate = 0.0;
		int[] jungdap = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("구입금액을 입력해 주세요.");
		money = scanner.nextInt();
		volume = money/1000;
		System.out.printf("%d개를 구매했습니다.\n", volume);
		
		
		Rotto[] arrLotto = new Rotto[volume];
		
		for(int i=0; i<volume; i++)
		{
			arrLotto[i] = new Rotto();
		}
		
		for(int i=0; i<volume; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(arrLotto[i].data[j]+" ");
			}
			System.out.println("");
		}
		
//		for(int i = 0; i<arrLotto.length; i++) {
//			num = arrLotto[i].checkLotto();
//			answer[num]++;
//					
//		}
//		
//		//배열 정렬
//		for(int total=0; total<volume;total++)
//		{
//			for(int i =0; i<6; i++){
//				for(int j = i; j<6; j++){
//					if(dang[total][i] > dang[total][j]){
//						temp = dang[total][i];
//						dang[total][i] = dang[total][j];
//						dang[total][j] = temp;
//					}
//				}
//			}
//		}
//		
//		//배정된 번호들 보여주기
//		for(int i = 0; i< volume; i++){
//			System.out.print("[");
//			for(int j =0; j< 6; j++){
//				System.out.printf("%d ", dang[i][j]);
//			}
//			System.out.println("]");
//		}
//		
//		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
//		
//		//당첨 번호 입력
//		for(int i =0; i<6; i++){
//			System.out.printf("%d번째 숫자:", i+1);
//			jungdap[i] = scanner.nextInt();
//		}
//		
//		//당첨된 로또 갯수 확인
//		for(int i=0; i<volume; i++){
//			count =0;
//			for(int j=0; j<6; j++){
//				if(dang[i][j] == jungdap[j]){
//					count++;
//				}
//			}
//			if(count == 6){
//				six++;
//			}else if(count == 5){
//				five++;
//			}else if(count == 4){
//				four++;
//			}else if(count == 3){
//				three++;
//			}
//		}
//		
//		System.out.printf("3개 일치 (5000원) - %d개\n",three);
//		System.out.printf("4개 일치 (50000원원) - %d개\n",four);
//		System.out.printf("5개 일치 (1500000원) - %d개\n",five);
//		System.out.printf("6개 일치 (2000000000원) - %d개\n",six);
//		
//		//수익률 계산
//		rate = ((double)((three*5000) + (four*50000) + (five*1500000) + (six*2000000000))/(double)money )*100;
//		
//		System.out.printf("총 수익률 %f퍼센트 입니다. \n", rate);
//		
//		scanner.close();
	}
}
