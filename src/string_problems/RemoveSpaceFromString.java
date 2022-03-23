package string_problems;

class RemoveAllOccurance{
	public String remove(String str, Character ch) {
		StringBuffer strBuff = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			Character tempCh = str.charAt(i);
			if(!ch.equals(tempCh)) {
				strBuff.append(tempCh);
			}
		}
		str = strBuff.toString();
		return str;
	}
}

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		RemoveAllOccurance rmv = new RemoveAllOccurance();
		String givenStr = new String("Hello World, Happy Programming");
		String returnString = rmv.remove(givenStr, 'H');
		System.out.println("Given String : "+ givenStr + "\nReturned String : "+returnString);
	}
}
