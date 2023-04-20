public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printAnswer(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        printAnswer(year);
    }

    public static void printVersionOfOperationSystem(int clientDeviceYear, int operationSystem) {
        if (operationSystem == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOS");
            } else {
                System.out.println("Установите обычную версию для iOS");
            }
        } else if (operationSystem == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android");
            } else {
                System.out.println("Установите обычную версию для Android");
            }
        } else {
            System.out.println("Неизвестное число");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int operationSystem = 1;
        printVersionOfOperationSystem(clientDeviceYear, operationSystem);
    }

    public static int countDays(int deliveryDistance) {
        int countDays = 0;
        if (deliveryDistance < 20 && deliveryDistance > 0) {
            countDays += 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            countDays += 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            countDays += 3;
        }
        if (deliveryDistance <= 100 && deliveryDistance > 0) {
            System.out.println("Потребуется дней: " + countDays);
        } else {
            System.out.println("Доставка невозможна");
        }
        return countDays;
//      Вывел дополнительный блок if-else, потому что без него при дистанции больше 100, в консоль выдвется сообщение
//      "Доставка невозможна", а под ним возвращенный countDays равный нулю(от него). Второй метод создавать не стал, т.к. в условии
//      задачи просят один метод.
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        countDays(deliveryDistance);
    }
}