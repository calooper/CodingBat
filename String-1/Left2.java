public String Left2(String str) {

  int i = str.length();


  String y = str.substring(0,2);
  String x = str.substring(2,i);

  return x + y;

}
