package homePractice.o_p_p;

public class School {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="ibrahim";
        s1.age=12;
        s1.email="ibrahim@gmail.com";
        s1.read();
        Book b=new Book();
        b.title=" SDET";
        b.author=" james";
        b.pages=230;

        s1.read(b);
        s1.read(2);
    }
}
