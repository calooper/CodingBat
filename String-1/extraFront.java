public String extraFront(String str) {

  String first;

  if (str.length() >=  2)
        first = str.substring(0,2);

  else
  first = str;
  return first + first + first;
}
