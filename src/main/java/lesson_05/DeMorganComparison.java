package lesson_05;

public class DeMorganComparison {
    public static void main(String[] args) {

        boolean A = true;
        boolean B = false;

        boolean tmp = A | B;
//                 true | false = true
//                    1 | 0 == 1

        boolean tmp1 = !(!A & !B);

//        !A( true > false) & !B(false > true)
//              !(!A(false) & !B(true))
//                        1 & 0 == 0 == false
//                           !0 == 1
//                            1 == true

        System.out.println(" A | B  = " + tmp);
        System.out.println("При використання теореми де Моргана  вираз A | B  є еквівалентом == виразу !(!A & !B) " + tmp1);

    }
}
