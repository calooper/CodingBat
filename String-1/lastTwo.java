public String lastTwo(String str) {

  if (str.length() <= 1) {
    return str;
  }

  String secLast = str.substring(str.length()-2, str.length()-1);
  String last =    str.substring(str.length()-1);

  if (str.length() > 1 ) {
   return str.substring(0, str.length()-2) + last + secLast;
  }

  else
  return str;
}
