public class Main {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Задание №1");
         int age= 16;
         if(age>=18){
             System.out.println("Поздравляю Вы достигли совершеннолетия");
         }
        if(age<18){
            System.out.println("Ваш возраст еще не достиг  совершеннолетия и нужно немного подождать");
        }
        //Задание №2
        System.out.println("Задание №2");
        int agePeople= 10;
        if(agePeople>=7&&agePeople<18){
            System.out.println("ребенок ходит в школу");
        }
        if(agePeople>=18&&agePeople<24){
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if(agePeople>=24){
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        //Задание №3
        System.out.println("Задание №3");

        int totalSpace=102;
        int totalSeatSpace=60;
        int totalStendSpace=totalSpace-totalSeatSpace;
        int SeatSpace=30;
        int StendSpace=30;
        if((SeatSpace+StendSpace)>totalSpace){
            System.out.println("Свободных мест в вагоне нет!");
        }
        if(SeatSpace<totalSeatSpace){
            System.out.println("Есть свободно сидящее место в вагоне");
        }

        if(StendSpace<totalStendSpace){
            System.out.println("Есть свободно стоящее место в вагоне");
        }


        /////////Домашняя работа №2
        //Задание №1
        System.out.println("Задание №2.1");
        int age2= 16;
        if(age2>=18){
            System.out.println("Поздравляю Вы достигли совершеннолетия");
        }else {
            System.out.println("Ваш возраст еще не достиг  совершеннолетия и нужно немного подождать");
        }

        //Задание №2
        System.out.println("Задание №2.2");
        int agePeople2= 26;
        if(agePeople2>=7&&agePeople2<18){
            System.out.println("ребенок ходит в школу");
        } else if(agePeople2>=18&&agePeople2<24){
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        else{
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        //Задание №3
        System.out.println("Задание №2.3");


        int totalSpace2=102;
        int totalSeatSpace2=60;
        int totalStendSpace2=totalSpace2-totalSeatSpace2;
        int SeatSpace2=30;
        int StendSpace2=30;
        if((SeatSpace2+StendSpace2)>totalSpace2){
            System.out.println("Свободных мест в вагоне нет!");
        }
        if(SeatSpace2<totalSeatSpace2){
            System.out.println("Есть свободно сидящее место в вагоне");
        }else{
            System.out.println("свободно сидящих мест нет");
        }

        if(StendSpace2<totalStendSpace2){
            System.out.println("Есть свободно стоящее место в вагоне");
        }else{
            System.out.println("свободно стоящих мест нет");
        }

        ///////////Домашняя работа №3
        //Задание №1
        System.out.println("Задание №3.1");
        int ageСitizen= 20;
        if(ageСitizen>=2&&ageСitizen<=6){
            System.out.println("ребенку нужно ходить в детский сад");
        }else if(ageСitizen>=7&&ageСitizen<=18){
            System.out.println("человеку нужно ходить в школу");
        }
         else if(ageСitizen>18&&ageСitizen<=24){
            System.out.println("человеку нужно ходить  в университет");
        }
        else{
            System.out.println("человеку нужно ходить на  работу");
        }

        //Задание №2
        System.out.println("Задание №3.2");
        int AgeKid= 14;
        if(AgeKid<5){
            System.out.println("ребенок не может кататься на аттракционе");
        }else {
            if(AgeKid<=14){

                System.out.println("ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            }else {
                if(AgeKid>14){
                    System.out.println("ребенок  может кататься на аттракционе без сопровождения взрослого.");

                }

            }

        }
        //Задание №3
        System.out.println("Задание №3.3");

        int one=9;
        int two=6;
        int three=8;
        if (one > two && one > three) {
            System.out.println(" Число one больше всех ");
        } else {
            if (two > one && one > three) {
                System.out.println(" Число two больше всех ");
            }else {
                System.out.println(" Число three больше всех ");

            }

        }
        }



}