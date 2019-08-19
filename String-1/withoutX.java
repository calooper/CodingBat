public String withoutX(String str) {

  int len = str.length();

  if (len >= 2)

  {
       if ((str.substring(0,1).equals("x")) && (str.substring(len-1).equals("x"))) {
        return str.substring(1, len-1);
     }

      if (str.substring(len-1).equals("x")) {
        return str.substring(0,len-1);
     }

      if (str.substring(0,1).equals("x")) {
         return str.substring(1);
     }
  }

  if (len < 2) {
    return "";
  }

  else
  return str;

}
