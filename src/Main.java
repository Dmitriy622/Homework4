public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +age +" то, он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " +age +" то, он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задание 2");
        int temperature = 10;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println("Задание 3");
        int speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " +speed +" , то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " +speed +" , то можно ездить спокойно");
        }

        System.out.println("Задание 4");
        int age2 = 15;
        if (age2 >= 2 && age2 <6) {
            System.out.println("Если возраст человека равен " +age2 +" , то ему нужно ходить в детский сад.");
        }
        if (age2 >= 7 && age2 <17) {
            System.out.println("Если возраст человека равен " +age2 +" , то ему нужно ходить в школу.");
        }
        if (age2 >= 18 && age2 <24) {
            System.out.println("Если возраст человека равен " +age2 +" , то его место в университете.");
        }
        if (age2 >24) {
            System.out.println("Если возраст человека равен " +age2 +" , то ему пора ходить на работу.");
        }

        System.out.println("Задание 5");
        int age3 = 12;
        if (age3 <5) {
            System.out.println("Если возраст ребенка равен " +age3 +" , то ему нельзя кататься на аттракционе.");
        }
        if (age3 >= 5 && age3 <14) {
            System.out.println("Если возраст ребенка равен " +age3 +" , то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age3 >=14) {
            System.out.println("Если возраст ребенка равен " +age3 +" , то ему ожно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задание 6");
        int totalSeating = 60;
        int total = 102;
        int occupied = 48;
        if (occupied <= totalSeating) {
            int freeSeating = totalSeating - occupied;
            System.out.println("В вагоне осталось свободных " +freeSeating +" мест для сидения");
        }
        if (occupied > totalSeating && occupied < total) {
            int freeStandingPlaces = total - occupied;
            System.out.println("В вагоне осталось " +freeStandingPlaces +" стоячих мест/а");
        }
        if (occupied >= total) {
            System.out.println("В вагоне нет свободных мест");
        }

        System.out.println("Задание 7");
        int one = 25;
        int two = 15;
        int three = 38;
        if (one > two && one > three) {
            System.out.println("Число " +one +" самое большое");
        }
        else if (two > three){
            System.out.println("Число " +two +" самое большое");
        }
        else {
            System.out.println("Число " +three +" самое большое");
        }
    }
}