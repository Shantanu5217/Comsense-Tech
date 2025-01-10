public class rohit {
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("enter the marks and roll no");
    }
}
public class school extends rohit{
    void display()
    {
        System.out.println(name + "  "+roll+" "+ marks);

    }
    public static void main(String[] args) {
        school r= new school();
        r.input();
        r.display();
    }

    
}
