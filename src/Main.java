public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();

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