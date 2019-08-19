public String without2(String str) {

  int L = str.length();

   if (L == 2) {
    return "";
  }

  if (L > 2 && str.substring(0,2).equals(str.substring(L-2))) {
  return str.substring(2);
  }

  return str;  
}
