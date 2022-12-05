public class Dog
{
    String name;
    String breed;
    private int age;
    private int weight;

    private static int count;

    public Dog(String name, String breed, int age, int weight)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        count++;
    }

    //Getters
    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    public int getWeight()
    {
        return weight;
    }

    public static int getCount()
    {
        return count;
    }

    public void setWeight(int weight){this.weight = weight;}

    //Brain Method
    public double Weight() {return weight % 2.2;}



    //output
    public String toString()
    {
        String result;
        result = name + "," + breed + "," + age + "," + weight;
        return result;
    }
}
