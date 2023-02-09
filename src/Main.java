public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        //task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 20;
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 26;
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить в школу.");
        } else if (age > 7 && age < 24) {
            System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если человеку больше 24, то ему пора ходить на работу.");
        }
        }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age > 5 && age <= 14) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        }
    public static void task6() {
        System.out.println("Задача 6");
        int numberOfPassengers = 103;
        if (numberOfPassengers <= 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (numberOfPassengers > 60 && numberOfPassengers <= 102) {
            System.out.println("В вагоне есть стоячее место");
        } else if (numberOfPassengers > 102) {
                System.out.println("Вагон полностью забит");
            }
            }
        }