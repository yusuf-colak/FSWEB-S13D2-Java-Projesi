public class Main {
    public static void main(String[] args) {

        System.out.println("tersiAynimi--------------------");
        System.out.println(tersiAynimi(-1221));
        System.out.println(tersiAynimi(707));
        System.out.println(tersiAynimi(11212));
        System.out.println("tamBölenler--------------------");
        System.out.println(tamBölenler(6));
        System.out.println(tamBölenler(28));
        System.out.println(tamBölenler(5));
        System.out.println(tamBölenler(-1));
        System.out.println("Kelimeye Dök--------------------");
        System.out.println(kelimeyeDok(123));
        System.out.println(kelimeyeDok(1010));
        System.out.println(kelimeyeDok(-12));
    }

    public  static boolean tersiAynimi(int num1){
        num1 = Math.abs(num1);
        char [] rakamlar =  String.valueOf(num1).toCharArray();
        String tersi="";

        for (int i=rakamlar.length-1 ; i>=0 ; i--){
            tersi +=rakamlar[i];
        }
return Integer.parseInt(tersi) == num1;

    }

    public static boolean tamBölenler (int num2) {
        if (num2<0) return false;
        int bölenler=0;
        int kacBöleniVar=0;
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0){
                kacBöleniVar += 1;
                bölenler += i;
            }
        }
        if (kacBöleniVar==1) return false;
        return num2 == bölenler;
    }


   public static String kelimeyeDok(int num3) {
       String[] sayilar = {"Sıfır ","Bir " ,"İki " ,"Üç " ,"Dört ","Beş ","Altı ","Yedi ","Sekiz ","Dokuz "};

       String gelenSayi= Integer.toString(num3);
        String kelimeler="";
        if (num3<0) return "İnvalit Value";
       for (int i=0 ; i<gelenSayi.length() ;i++){
           int basamak = Character.getNumericValue(gelenSayi.charAt(i));
           kelimeler += sayilar[basamak];
       }
       return kelimeler;
   }

}