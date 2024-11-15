package park_java05;

public class Java5024_20241025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] intArray = {70, 65, 80, 100, 98};
        
        int a = 10;
        
        int b;
        b = 100;
        
        int[] arr1;
        //arr1 = {10,20,30};
        
        int[] arr2 = null; //null로 초기화
        int[] arr3 = new int[5]; // 메모리만 4*5 20byte 확보
        
        System.out.println(arr3[0]); // 메모리 공간 확보시 0으로 초기화
        // System.out.println(arr2[0]); // NullPointException
        
        for (int i=0;i<arr3.length;i++) {// index 0~4까지 반복 -> 배열의 길이 length
        	System.out.println(arr3[i]); // 메모리 공간 확보시 0으로 초기화
        }
        
        arr3[0] = 50; // 배열생성 후 특정 인덱스 값으로 정수값 저장
        // arr2[2] = 100; NullPointerException
        
        double[] doubleArray = {1.5, 2.1, 3.6, 4.2};
        
        String[] names = {"kor","jap", "Chn", "k"}; // 문자열들의 배열
        
        char[] chars = {'A','B','C'}; // 문자들의 배열
        
        String[] str1 = new String[5];
        System.out.println(str1[2]); // ->null
        str1[2] = "korea";
        }
        
	}


