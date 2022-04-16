package homePractice.encapsulation;

public class SM {
    public static void main(String[] args) {
        Post p1=new Post("What a come back");
        p1.info();
        p1.like();
        p1.like();
        p1.addComment("i know right");
        p1.addComment("what the heck");
        p1.info();

    }
}
