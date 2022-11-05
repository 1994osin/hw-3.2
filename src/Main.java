public class Main {
    public static void main(String[] args) {
        // Task 1
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        // Task 2
        int humanAge = 25;
        if (humanAge >= 7 && humanAge < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (humanAge >= 18 && humanAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Task 3
        int totalSeats = 102;
        int seating = 60;
        int seatsTaken = 60;
        if (seatsTaken > 0 && seatsTaken < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (seatsTaken >= 60 && seatsTaken < 102) {
            System.out.println("В вагоне только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
    }
}