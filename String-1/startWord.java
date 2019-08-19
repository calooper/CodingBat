public String startWord(String str, String word){

	int sL = str.length();
	int wL = word.length();

	String temp;

	if(sL >= wL)
	{
		temp = str.substring(1, wL);

		if(word.substring(1).equals(temp))
			return (str.charAt(0)+temp);
		else
			return "";
	}

	else
		return "";
}
