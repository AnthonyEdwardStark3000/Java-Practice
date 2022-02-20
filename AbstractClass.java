    abstract class Member{
    private String name;
    abstract void welcomeMessage();
}

    class Staff extends Member{
    void welcomeMessage()
    {
        System.out.println("Hello");
    }
}

    class AbstractClass
    {
    public static void main(String args[])
    {
        Staff s = new Staff();
        s.welcomeMessage();
    }
    }
