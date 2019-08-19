public String deFront(String str) {

  int len = str.length();

    if (str.substring(0,2).equals("ab")) {
      return str;
    }

    if (str.charAt(0) == 'a') {
      return "a" + str.substring(2);
    }

    if (str.charAt(1) == 'b') {
      return  "b" + str.substring(2);
    }

  else
  return str.substring(2);

}
