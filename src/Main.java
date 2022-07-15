public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        task2();
    }
    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2020;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS != 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS != 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        task3();
    }
    public static void task3() {
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        task4();
    }
    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDays20Km = 1;
        int deliveryDays60Km = 2;
        int deliveryDays100Km = 3;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays20Km);
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryDays60Km);
        } else {
            System.out.println("Потребуется дней: " + deliveryDays100Km);
        }
        task5();
    }
    public static void task5() {
        int monthNumber = 13;
        switch (monthNumber)
        {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
        default:
            System.out.println("Некорректный месяц " + monthNumber);
        }

        }
}

