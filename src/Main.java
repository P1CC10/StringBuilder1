public class Main {
    public static void main(String[]arg){
        String string1 = " ciao";
        String string2 = "mondo";
        String risultatoConfronto  = confrontaStringhe(string1,string2);
        System.out.println(risultatoConfronto);
    }
        public static String confrontaStringhe( String string1, String string2){
            int confronto = string1.compareTo(string2);
            StringBuilder risultato = new StringBuilder("le due stringhe sono");
            if(confronto==0){
                risultato.append("uguali");
                }else {
                risultato.append("diverse");
                }
            return risultato.toString();
        }

}
