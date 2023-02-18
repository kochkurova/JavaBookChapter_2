public class Hypot {
    public static void main (String args []) {

        /*
        метод sqrt(), определенный в стандартном классе Math, возвращает
        значение double, являющееся квадратным корнем значения аргумента
        этого метода, также представленного типом double. Ниже приведен
        фрагмент кода, в котором метод sqrt() используется для расчета длины гипотенузы
        при условии, что заданы длины катетов.
         */

        double x, y, z;
        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Длинна гипотенузы = " +z);


    }
}
