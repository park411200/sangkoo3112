package park_java05;

public class ArrayTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores1 = new int[2][3]; // 2행 3열 2차원 배열 선언
		
		int[][] scores2 = new int[2][]; // 2행 배열 선언(열의 크기는 미지정)
		scores2[0] = new int[3]; // 첫번째 행의 크기를 3으로 설정
		scores2[1] = new int[4]; // 두번째 행의 크기를 4로 설정
		
		scores2[0][2] = 100; // 인덱스 [0][2] 의 위치에 100을 저장
	}

}
