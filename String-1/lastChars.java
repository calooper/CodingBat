public String lastChars(String a, String b) {

	String combStr = "";

	combStr += (a.length() < 1) ? "@" : a.charAt(0);
	combStr += (b.length() >= 1) ? b.charAt(b.length()-1) : '@';

	return combStr;
}
