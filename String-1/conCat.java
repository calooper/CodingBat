public String conCat(String a, String b) {

  String comb = "";

    if (a.length() == 0 ) {
      return b;
   }

    if (b.length() == 0 )  {
      return a;
   }

  comb += (a.charAt(a.length()-1) == b.charAt(0)) ? a.substring(0,a.length()-1) + b : (a)+ (b);

  return comb;
}
