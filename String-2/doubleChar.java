public String doubleChar(String str) {

  String result = "";

  for (int i = 0; i < str.length(); i++) {
  result = result + str.substring(i, i+1) + str.substring(i, i+1);
    // or
    // result = result + str.substring(i, i+1) + str.substring(i, i+1);
  }
  return result;
}
