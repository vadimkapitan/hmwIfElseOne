public class Main {
    public static void main(String[] args) {

        // Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека = " + age + " лет, то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека = " + age + " лет, он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача 2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // Задача 3
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        // Задача 4
        int year = 60;
        if (year < 2) {
            System.out.println("Если возраст человка равен " + year + ", то ему пора спать.");
        }
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человка равен " + year + ", ему нужно ходить в детский сад.");
        }
        if (year >= 7 && year <= 18) {
            System.out.println("Если возраст человка равен " + year + ", то ему нужно ходить в школу.");
        }
        if (year > 18 && year < 24) {
            System.out.println("Если возраст человка равен " + year + ", то его место в университете.");
        }
        if (year >= 24) {
            System.out.println("Если возраст человка равен " + year + ", то ему пора ходить на работу.");
        }
        if (year > 60) {
            System.out.println("Если возраст человка равен " + year + ", то он может отдохнуть.");
        }

        // Задача 5
        int yearAttraction = 15;
        if (yearAttraction < 5) {
            System.out.println("Если возраст ребенка равен " + yearAttraction + ", то ему нельзя кататься на аттракционе.");
        }
        if (yearAttraction >= 5 && yearAttraction < 14) {
            System.out.println("Если возраст ребенка равен " + yearAttraction + ", то он может кататься только в сопровождении взрослого.");
        } else {
            System.out.println("Без сопровождения взорослого, кататься нельзя.");
        }
        if (yearAttraction > 14) {
            System.out.println("Если возраст ребенка равен " + yearAttraction + ", то он может кататься без сопровождения взрослого.");
        }
        // Задача 6
        int place = 55;
        int seatDown = 102;
        if (place <= 102 && seatDown >= 1 && seatDown <= 60) {
            System.out.println("Место в вагоне есть, сидячее.");
        } else if (place <= 102 && seatDown >= 61 && seatDown <= 102) {
            System.out.println("Место в вагоне есть, стоячее.");
        } else {
            System.out.println("Вагон полностью забит.");
        }
        // Задача 7
        int one = 4;
        int two = 5;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}