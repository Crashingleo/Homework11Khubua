import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void doIt(int year) {

        boolean god = true;
        if ((year % 100) == 0) {
            god = false;
        }
        if ((year % 400) == 0) {
            god = true;
        }
        if ((year % 4) == 0 && god == true) {
            System.out.println(year + " Год високосный");
        } else {
            System.out.println(year + "  Год не високосный");
        }
    }

    //==================================================================================
    public static void printDeviceYear(int clientOS, int clientDeviceYear) {
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("неправильная операционная система");
            return;

        } else {
            int currentYear = LocalDate.now().getYear();
            if (clientOS > 1) {
                System.out.println("Eror");
            } else {
                switch (clientOS) {
                    case 0:
                        if (clientDeviceYear < currentYear) {
                            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                        } else {
                            System.out.println("Установите версию приложения для iOS по ссылке");
                        }
                        break;
                    default:
                        if (clientDeviceYear < currentYear) {
                            System.out.println("Установите облегченную версию приложения для Android по ссылке");
                        } else {
                            System.out.println("Установите версию приложения для Android по ссылке");
                        }
                        break;
                }
            }
        }
    }
    //==================================================================================
    public static int deliveryDay(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            return 1;

        } else if (deliveryDistance < 60 && deliveryDistance > 20) {
            return 2;

        } else if (deliveryDistance <= 100 && deliveryDistance >= 60) {
            return 3;

        } else {
            return -1;

        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");
        doIt(2020);
    }

    public static void task2() {
        System.out.println("Task 2");
        printDeviceYear(0, 2022);
    }
    public static void task3(){
        System.out.println("Task 3");
        int deliveryDays = deliveryDay(10);
        if(deliveryDays == -1){
            System.out.println(" Доставки нет");
        } else {
            System.out.println("Доставка прибудет через " + deliveryDays + " дней");
        }
    }
}