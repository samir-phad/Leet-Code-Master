public class No1844 {


    public static void main(String[] args) {
		String s = "a1c1e1";
		String r = "";
		int n = 0;
		int temp =0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				r += s.charAt(i);
				n = s.charAt(i);
			}else {
				temp = s.charAt(i) -'0';
				r += (char) (temp + n);
			}
		}
		System.out.println(r);
 
	}

}