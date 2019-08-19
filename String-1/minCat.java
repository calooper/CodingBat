public String minCat(String a, String b) {

  String comb = "";

  comb += (a.length() > b.length() ? a.substring(a.length()-b.length()) + b :
  a + b.substring(b.length()-a.length()));

  return comb;
}
