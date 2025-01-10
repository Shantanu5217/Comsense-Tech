class school{
    int roll,marks;
    String name;
    void input()
    {
       
    }
}

class rohit1 extends school {
    void display()
    {
        name="rohit"; roll=8; marks=152;

        System.out.println(name + "  "+roll+" "+ marks);

    }
    public static void main(String[] args) {
        rohit1 r= new rohit1();
        r.input();
        r.display();
    }
}
