public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.name = "JEIAMES";
        cow.age = 5;
        cow.color = "white";
        cow.gender = "female";
        cow.breed = "африканский";
        cow.weight = 200;
        cow.income = "10 литр молоко";
        cow.character = "спокойный ";
        cow.lengh = "2.5 M";
        cow.sensitivity = "ресский";
        System.out.println("name: "+cow.name+"\n"+"age: "+cow.age+"\n"+"color: "+cow.color+"\n"+"gender: "+cow.gender+"\n"+"breed: "+cow.breed+"\n"+"weight: "+cow.weight+
                "\n"+"income: "+cow.income+"\n"+"character: "+cow.character+"\n"+"Lengh: "+cow.lengh+"\n"+"sensitivity: "+cow.sensitivity);
    }
}