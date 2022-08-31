public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();


   }

    private static void Task9() {
        int one=11;
        int two=222;
        int three=33;
        if (one>two && one>three) {
            System.out.println("One равное "+ one+" бОльшее из трех чисел.");
        } else {
            if (two>one && two>three){
                System.out.println("Two равное "+ two+" бОльшее из трех чисел.");
            }else {
                System.out.println("Three равное "+ three+" бОльшее из трех чисел.");
            }
        }

    }

    private static void Task8() {
        int ageChild=9;
        if (ageChild<5){
            System.out.println("Если ребенку " +ageChild+" лет, то он не может кататься на аттракционе.");
        }else {
            if (ageChild >= 5 && ageChild <= 14) {
                    System.out.println("Если ребенку " +ageChild+" лет, то он может кататься на аттракционе только в сопровождении взрослого.");
                }else {
                    System.out.println("Если ребенку " +ageChild+" лет, то он может кататься на аттракционе без сопровождения взрослого.");
                }

            }
        }


    private static void Task7() {
        int age=25;
        boolean humanGoNoKindergarten= age>=2 && age<=6;
        if (humanGoNoKindergarten){
            System.out.println("Если возраст человека равен " +age+" лет, то ему нужно ходить в детский сад.");
        } else {
            boolean humanGoToSchool = age >= 7 && age <= 18;
            if (humanGoToSchool) {
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
            } else {
                if (age > 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + " лет, то его место в университете.");
                } else {
                    System.out.println("Если возраст человека равен " + age + " лет, то ему ему пора ходить на работу.");
                }
            }
        }
    }


    private static void Task6() {
        int place=102;
        if (place<60){
            System.out.println(" Есть и сидячее и стоячее место в вагоне.");
        } else { if (place>=60 && place<102){
            System.out.println(" Есть  стоячее место в вагоне.");
        } else {
            System.out.println(" Вагон уже полностью забит.");
        }
        }
    }

    private static void Task5() {
        int ageHuman=24;
        if ( ageHuman>=7 && ageHuman<18){
            System.out.println(" Ребенок ходит в школу.");
        } else {if (ageHuman>=18 && ageHuman<24){
            System.out.println(" Человек уже закончил школу и может отправляться в университет.");
        } else {
                System.out.println(" Человек окончил университет и ему пора искать первую работ.");
            }
        }
    }

    private static void Task4() {
        int age = 17;
        if (age >= 18) {
            System.out.println(" Поздравляю с совершеннолетием.");
        } else {
            System.out.println(" Возраст совершеннолетия ещё не наступил, и нужно немного подождать..");
        }
    }


    private static void Task3() {
        int place=50;
        if (place<60){
            System.out.println(" Есть и сидячее и стоячее место в вагоне.");
        }
        if (place>=60 && place<102){
            System.out.println(" Есть  стоячее место в вагоне.");
        }
        if (place>=102){
            System.out.println(" Вагон уже полностью забит.");
        }

    }

    private static void Task2() {
        int ageHuman=19;
        if ( ageHuman>=7 && ageHuman<18){
            System.out.println(" Ребенок ходит в школу.");
        }
        if (ageHuman>=18 && ageHuman<24){
            System.out.println(" Человек уже закончил школу и может отправляться в университет.");
        }
        if (ageHuman>=24){
            System.out.println(" Человек окончил университет и ему пора искать первую работ.");
        }

    }
    public static void Task1() {
            int age = 17;
            if (age >= 18) {
                System.out.println(" Поздравляю с совершеннолетием.");
            }
            if (age < 18) {
                System.out.println(" Возраст совершеннолетия ещё не наступил и нужно немного подождать.");
            }
        }


}