public String withoutX2(String str) {

  int len = str.length();

  if (len > 2) {


      if (str.substring(0,2).equals("xx")) {
        return str.substring(2);
      }

      if (str.substring(0,1).equals("x")) {
        return str.substring(1);

      }

      if (str.substring(1,2).equals("x")) {
        return str.substring(0,1) + str.substring(2,3);
      }

      else
      return str;

}

   if (len == 2 && str.substring(0,2).equals("xx")) {
    return "";

    }

  else if (len == 2) {
    return str;

  }

    else
    return "";
}
