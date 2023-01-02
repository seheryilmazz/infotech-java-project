package homework8.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questions {
    public static void main(String[] args) {
        /*
        1)Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        2)indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
        3)set() methodu kullanarak, E’yi D yapiniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
        4)remove() methodu kullanarak, F’yi siliniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        5)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
        6)contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
        olmadigini dogrulayiniz.
        7)size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
        8)clear() methodu kullanarak, list’deki tum elemanlari siliniz.
        9)isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz.
         */

        //1)Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("C");
        letters.add("E");
        letters.add("F");
        System.out.println(letters);  // [A, C, E, F]

        /*2)indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.*/

        letters.add("B");
        System.out.println(letters);  // [A, C, E, F, B]
        letters.add(1,"L");
        System.out.println(letters);  // [A, L, C, E, F, B]

        // 3)set() methodu kullanarak, E’yi D yapiniz.
        // ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.

        letters.set(3,"D");
        System.out.println(letters);  // [A, L, C, D, F, B]

        //4)remove() methodu kullanarak, F’yi siliniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.

        letters.remove(4);
        System.out.println(letters);  // [A, L, C, D, B]

        //5)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.

        Collections.sort(letters);
        System.out.println(letters);  // [A, B, C, D, L]

        //6)contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadigini dogrulayiniz.

        System.out.println(letters.contains("L"));  // true
        System.out.println(letters.contains("M"));  // false

        //7)size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.

        System.out.println(letters.size()); //  5

        //8)clear() methodu kullanarak, list’deki tum elemanlari siliniz.

        letters.clear();
        System.out.println(letters);  // []

        //9)isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz.

        System.out.println(letters.isEmpty());  // true

    }
}
