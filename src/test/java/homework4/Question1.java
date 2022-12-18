package homework4;

public class Question1 {
    public static void main(String[] args) {
        /*
        Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”  string ifadesini
         “Java ogrenmek cok guzel.” sekline getirin.
         */

        String str = " Java ogrenmek123 Cok guzel@ ";
        str= str.replaceAll("\\d", "").replace('@','.').trim();
        str=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        System.out.println(str);




    }
}
