public String atFirst(String str) {

  if (str.length() >= 2) {
    return str.substring(0,2);
  }

  if (str.length() < 3 && str.length() > 1) {
    return str.substring(0, str.length()) + "@";
  }
  if (str.length() == 1) {
    return str.substring(0) + "@";
  }
  else
  return "@@";
}
