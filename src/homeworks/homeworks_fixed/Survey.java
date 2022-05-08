package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        /**
         * Write a program that will get information from 3 participants and
         *         -Print information for each participant
         *         -Print how many participants were male
         *         -Print how many participants were female
         *         -Print the age of the youngest person
         *         -Print the age of the eldest person
         *          */
        Scanner scan = new Scanner(System.in);
        ArrayList<Participant> participants = new ArrayList<>();
        int youngest = Integer.MAX_VALUE;
        int eldest = 0;
        do {
            System.out.println(SurveyQuestions.askToJoin);
            String join = scan.next();
            if (join.toLowerCase().startsWith("y")) {
                System.out.println(SurveyQuestions.askName);
                String name = scan.next();
                System.out.println(SurveyQuestions.askAge);
                int age = scan.nextInt();
                System.out.println(SurveyQuestions.askGender);
                String gender = scan.next();
                Participant participant = new Participant(name, age, gender);
                participants.add(participant);
                if (gender.toUpperCase().startsWith("M")) Participant.addMaleParticipants();
                else Participant.addFemaleParticipants();
            }
        } while (Participant.totalNumberOfParticipants < 3);
        System.out.println(participants);
        for (Participant participant : participants) {
            System.out.println(participant);
            if (participant.age > eldest) eldest = participant.age;
            if (participant.age < youngest) youngest = participant.age;
        }
        System.out.println("Total number of male participants is = " + Participant.totalNumberOfMaleParticipants);
        System.out.println("Total number of female participants is = " + Participant.totalNumberOfFemaleParticipants);
        System.out.println("The age of the oldest participant is = " + eldest);
        System.out.println("The age of the youngest participant is = " + youngest);
    }

}

