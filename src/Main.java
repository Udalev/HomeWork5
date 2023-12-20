public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задание 1-2");

        int clientOS = 0;
        int clientDeviceYear = 2014;

        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("неверное значение OS");
            }
        } else {
           if  (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS");
            } else if (clientOS == 1){
               System.out.println("Установите облегченную версию приложения для Android");
           } else {
               System.out.println("неверное значение OS");
           }
    }
        System.out.println();
        System.out.println("Задача 3");
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0||year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryDays;
        if (deliveryDistance <= 20){
            deliveryDays = 1;
        }else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        }else if (deliveryDistance <= 100){
            deliveryDays = 3;
        }else {
            deliveryDays = 0; // В случае, если расстояние больше 100 км (нет доставки)
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        System.out.println();
        System.out.println("Задача 5");
        int monthNumber = 9;

        if (monthNumber > 12) {
            System.out.println("Ошибка: Номер месяца не может быть больше 12.");
        } else {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень.");
                    break;
                default:
                    System.out.println("Некорректный месяц.");
                    break;
            }
        }

    }
}