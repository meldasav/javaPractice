package homePractice.encapsulation;

import java.util.ArrayList;

public class User {

    ArrayList<User> friends;
    ArrayList <Post> post;
    private String name;
    private int age;
    private String location;

    public User(String name,int age){
        this.name=name;
        this.setAge(age);
        this.friends=new ArrayList<>();
        this.post=new ArrayList<>();

    }

    public static void seeTimeline(User user){
        for (Post p : user.post) {
            p.info();

        }
    }
    public void sendFriendRequest(User targetUser){
        if(this.friends.size()<10 && targetUser.friends.size()<10){
            targetUser.friends.add(this);
            this.friends.add(targetUser);
            System.out.println(targetUser.name + "is added to the friends list");
        }else{
            System.out.println("Maximum friends reached");
        }
    }
   public void info(){
       System.out.println("\n User information");
       System.out.println("Name : " + this.name);
       System.out.println("age : " + this.age);
       System.out.println("location :" +this.location);
       System.out.println("number of friends " + this.friends.size());
   }
   public void createPost(String postBody){
       System.out.println(postBody + " is posted successfully");
       Post p=new Post(postBody);
       this.post.add(p);
   }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
