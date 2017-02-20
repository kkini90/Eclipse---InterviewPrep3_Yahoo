package Yahoo;

//Given a string, like ffgffftffhfffyytr5yyyyd, find the character that has higher consecutive occurance
//ans: y
//i/p2: ffgffftffhfffyyttttr5yyyyd

public class ConsecutiveCharCount {

	public static void main(String[] args) {
		System.out.println(findChar("ffgffftffhfffyytr5yyyyd"));
	}
	public static Character findChar(String s){
	    if(s==null || s.isEmpty()) return ' ';
	    
	    char last = s.charAt(0);
	    int count =1,maxCount=0;
	    char resChar=' ';
	    
	    for(int i=1;i<s.length();i++){
	        if(last == s.charAt(i)){
	            count++;
	        }else{
	            if(count > maxCount){
	                maxCount = count;
	                resChar = last;
	            }
	            count = 1;
	            last = s.charAt(i);
	        }
	    }
	    
	    return resChar;
	}
}

/*
Garbage collector: mark and sweep?
Heap and stack memory
Java class loader
*/