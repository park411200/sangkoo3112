package park_java05;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "korea";
        
        // System.out.println(str[0]); error!
        
        System.out.println(str.charAt(0));// 문자열 중 한글자씩 추출
        
        for (int i=0;i<str.length();i++) {
        	System.out.println(str.charAt(i));
        }
        
	}

}
