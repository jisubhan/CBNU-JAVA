package Array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[]= {20,30,40,50,10};
		int i,j,temp;
		System.out.println("정렬전");
		for(i=0;i<5;i++) {
			System.out.println((i+1)+"번째 데이터" +test[i]);
		}
		for(i=0;i<5;i++) {
			for(j=i;j<5;j++) {
				if(test[i]>test[j]) {
					temp=test[j];
					test[j]=test[i];
					test[i]=temp;
				}
			}
		}
		System.out.println("정렬후");
		for(i=0;i<5;i++) {
			System.out.println((i+1)+"번째 데이터" +test[i]);
		}
		
		
	}
	

}
