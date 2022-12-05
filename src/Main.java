public class Main
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang","Huskey", 5, 80);
        Dog dog2 = new Dog("Piper", "Australian Shepherd", 3, 45);
        Dog dog3 = new Dog("Henry","Saint Bernard", 1, 120);

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        //dog1
        System.out.println(dog1.getBreed());
        System.out.println(dog1.getAge());

        //dog2
        System.out.println(dog2.getWeight());

        //dog3
        System.out.println(dog3.getName());
        System.out.println(dog3.getBreed());
        System.out.println(dog3.getAge());
        System.out.println(dog3.getWeight());


        System.out.println("Amount of Dogs:" + dog3.getCount());

        //amount of dogs

    }
}