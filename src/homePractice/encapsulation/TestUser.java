package homePractice.encapsulation;

public class TestUser {
    public static void main(String[] args) {
        User john=new User("john doe",31);
        User melda=new User("melda",39);
        System.out.println(john.friends.size());
        john.sendFriendRequest(melda);
        System.out.println(john.friends.get(0).getName());
        System.out.println(john.friends.size());
        System.out.println(melda.friends.size());
        john.info();
        john.createPost("Welcome");
        john.createPost("great day today");
        john.info();
        User.seeTimeline(john);

        }

    }

