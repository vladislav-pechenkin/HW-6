public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + "  он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");

        int outdoorTemperature = 6;
        if (outdoorTemperature <= 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку.");
        }
        if (outdoorTemperature > 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача 3");

        int driverSpeed = 59;
        if (driverSpeed >= 60) {
            System.out.println("Если скорость водителя " + driverSpeed + " км/ч, то придется заплатить штраф.");
        }
        if (driverSpeed < 60) {
            System.out.println("Если скорость водителя " + driverSpeed + " км/ч, то можно ездить спокойно.");
        }

        System.out.println("Задача 4");

        int theAgeOfThePerson = 16;
        if (theAgeOfThePerson >= 2 && theAgeOfThePerson <=6) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " лет, то ему нужно ходить в детский сад.");
        }
        if (theAgeOfThePerson >= 7 && theAgeOfThePerson <= 17 ) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " лет, то ему нужно ходить в школу.");
        }
        if (theAgeOfThePerson >= 18 && theAgeOfThePerson <= 24 ) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " лет, то его место в университете.");
        }
        if (theAgeOfThePerson > 24 ) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " лет, то ему пора ходить на работу.");
        }

        System.out.println("Задача 5");

        int ageRestriction = 15;
        int adult = 1;
        if (ageRestriction < 5 ) {
            System.out.println("Если возраст ребенка равен " + ageRestriction + " лет, то ему нельзя кататься на аттракционе.");
        }
        if (ageRestriction >= 5 && ageRestriction <=14 && adult ==1) {
            System.out.println("Если возраст ребенка равен " + ageRestriction + " лет, и с ним есть взрослый то ему можно кататься на аттракционе.");
        }
        if (ageRestriction >= 5 && ageRestriction <=14 && adult ==0) {
            System.out.println("Если возраст ребенка равен " + ageRestriction + " лет, то ему нельзя кататься на аттракционе без сопровождения взрослого.");
        }

        if (ageRestriction >= 15 ) {
            System.out.println("Если возраст ребенка равен " + ageRestriction + " лет, то он может кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задача 6");

        int passengers = 13;
        int trainCarriageCapacity = 102;
        int sitting = 60;
        int sitting1 = sitting - passengers;
        int standingUp = trainCarriageCapacity - passengers;
        int standingUp1 = trainCarriageCapacity - sitting;
        if (passengers >= trainCarriageCapacity) {
            System.out.println("Мест в вагоне нет.");
        } else if (passengers >=60 && passengers < trainCarriageCapacity) {
            System.out.println("Места в вагоне есть. Осталось " + standingUp + " стоячих мест.");
        } else if (passengers < 60) {
            System.out.println("Места в вагоне есть. Осталось " + standingUp1 + " стоячих мест и " + sitting1 + " сидячих мест.");
        }

        System.out.println("Задача 7");

        int one = 165165;
        int two = 1555;
        int three = 9555;
        if (one < two && two < three){
            System.out.println("Из трех чисел самое большее " + three);
        } else if (two < three && three < one) {
            System.out.println("Из трех чисел самое большее " + one);
        } else if (three < one && one < two) {
            System.out.println("Из трех чисел самое большее " + two);
        } else if (one < three && three < two) {
            System.out.println("Из трех чисел самое большее " + two);
        } else if (three < two && two < one) {
            System.out.println("Из трех чисел самое большее " + one);
        } else if (two < one && one < three) {
            System.out.println("Из трех чисел самое большее " + three);
        }

    }
}