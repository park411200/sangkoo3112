package park_java05;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 10;
        int b;
        b = a;
        int[] intArr1 = {10,20,30};
        int[] intArr2 = null;
        // 배열의 이름은 실제 배열의 값의 첫번째 원소값이 저장되어 있는 주소값이다!!
        
        intArr2 = intArr1;
        
        for (int i=0;i<intArr2.length;i++) { // intArr2 배열의 모든 원소를 출력하는 for문
        System.out.println(intArr2[0]);//10이 복사 완료
	}

}
	
}
