public String nonStart(String a, String b) {

  int i = a.length();
  int j = b.length();

  String aOmit = a.substring(1,i);
  String bOmit = b.substring(1,j);



    return aOmit + bOmit;

}
