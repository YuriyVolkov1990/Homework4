public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
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
        int age = 5;
        if (age >= 2 && age < 7) {
            System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18)
            {
                System.out.println("Если человеку от 7 до 18 лет, то ему нужно ходить в школу");
                //System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете.");
            }
        }
    }

    //Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
       // Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
       // Если человеку больше 18 лет, но меньше 24, то его место в университете.
        //А если человеку больше 24, то ему пора ходить на работу.
    //Если возраст человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)».