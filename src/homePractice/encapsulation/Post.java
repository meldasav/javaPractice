package homePractice.encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Post {

    public Post(String postBody) {
        if (postBody.isEmpty()) {
            System.out.println("Post has no body");
        } else {
            this.postBody = postBody;
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dateStr = dateFormat.format(date);
        this.date = dateStr;
        comments = new ArrayList<>();
    }

    public void info() {
        System.out.println("\nPost information");
        System.out.println("Post body " + this.postBody);
        System.out.println("Date" + this.date);
        System.out.println("likes" + this.likes);
        System.out.println("Comments");
        int counter = 1;
        for (
                String c : this.comments) {
            System.out.println("comment" + counter + ":" + c);
            counter++;
        }

    }

    public void editPost() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your new post");
        String s = input.nextLine();
        this.postBody = s;
    }


    public void deleteComment(String comment) {
        this.comments.remove(comment);
    }

    public void addComment(String comment) {
        if (comment.isEmpty()) {
            System.out.println("comment is empty");
        } else {
            if (comment.contains("hell") || comment.contains("crap") || comment.contains("heck")) {
                System.out.println("comment contains bad word");
            } else {
                this.comments.add(comment);
            }
        }
    }

    public void like() {
        this.likes++;
    }

    private ArrayList<String> comments;
    private int likes;
    private String date;
    private String postBody;

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getDate() {
        return date;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }
}
