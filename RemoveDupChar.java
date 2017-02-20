package Yahoo;

//Given a i/p string, asdfsddfgeyhhj, remove the duplicates that appear in succession and than print the string
//o/p asdfsdfgeyhj
/*
   Time complexity:O(n)
   Space :O(n)
 * */
 
public class RemoveDupChar {

	public static void main(String[] args) {
		System.out.println(removDupChar("asdfsddfgeyhhj"));
	}
	public static String removDupChar(String s){
	    if(s==null || s.isEmpty()) return s;
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0;i<s.length()-1;i++){
	        if(s.charAt(i) != s.charAt(i+1)){
	            sb.append(s.charAt(i));
	        }
	    }
	    sb.append(s.charAt(s.length()-1));
	    return sb.toString();
	}
}
