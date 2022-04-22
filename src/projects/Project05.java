package projects;

import utilities.*;

public class Project05 {
    public static void main(String[] args) {
        //TASK1

        String str1 = ScannerHelper.getStringFromUser();
        if (str1.length() < 8) {
            System.out.println("This String does not have 8 characters");
        } else {
            String first4 = str1.substring(0, 4);
            String last4 = str1.substring(str1.length() - 4);
            String middle = str1.substring(4, str1.length() - 4);
            System.out.println("" + last4 + middle + first4);
        }
        //TASK2
        String sentence = ScannerHelper.getStringFromUser();
        if (sentence.trim().indexOf(' ') >= 0) {
            String lastWord = sentence.substring(sentence.indexOf(" ") + 1);
            String firstWord = sentence.substring(0, sentence.indexOf(" "));
            String middle = sentence.substring(sentence.indexOf(" ") + 1, sentence.lastIndexOf(" "));
            System.out.println(lastWord + "" + middle + "" + firstWord);
        } else {
            System.out.println("This sentence does not have 2 or more words to swap");


            //TASK 3
            String word1 = "These books are so stupid";
            String word2 = "I like idiot behaviors";
            String word3 = "I had some stupid t-shirts in the past and also some idiot look shoes";
            String word4 = "stupid", word5 = "idiot", word6 = "nice";
            System.out.println(word1.replace(word4, word6));
            System.out.println(word2.replace(word5, word6));
            System.out.println(word3.replace(word4, word6).replace(word5, word6));

        /*
        String sentence = ScannerHelper.getStringFromUser();
//   String firstWord = sentence.substring(0, sentence.indexOf(" "));
 //  String lastWord = sentence.substring(sentence.lastIndexOf(" ") +1 );

   if (sentence.trim().contains(" ")){
       System.out.println(sentence.substring(sentence.lastIndexOf(" ") +1 )
               + sentence.substring(sentence.indexOf(" "), sentence.lastIndexOf(" ") + 1)
               + sentence.substring(0, sentence.indexOf(" ")));

   }else{
       System.out.println("This sentence does not have 2 or more words to swap");
   }
         */
            //TASK 4
            String nameTask4 = ScannerHelper.getStringFromUser();

            if (nameTask4.length() % 2 == 1 && nameTask4.length() > 2) {
                System.out.println("" + nameTask4.charAt(nameTask4.length() / 2));
            } else if (nameTask4.length() % 2 == 0) {
                System.out.println("" + nameTask4.charAt(nameTask4.length() / 2 - 1)
                        + nameTask4.charAt(nameTask4.length() / 2));
            } else {
                System.out.println("Invalid input");
            }
            //TASK 5
            String country = ScannerHelper.getCountryFromUser();
            if (country.length() > 5) {
                System.out.println(country.substring(2, country.length() - 2));
            } else {
                System.out.println("Invalid input");
            }
            // TASK 6
            String address = ScannerHelper.getAddressFromUser();
            System.out.println(address.toUpperCase().replace('A', '*').replace('E', '#')
                    .replace('I', '+').replace('O', '@'));

            //TASK 7
            //2 random  numbers
            int randomNumber1 = RandomNumberGenerator.getRandomNumber(0, 25);
            int randomNumber2 = RandomNumberGenerator.getRandomNumber(0, 25);
            System.out.println("randomNumber1= " + randomNumber1);
            System.out.println("randomNumber1 = " + randomNumber2);
            String s = "";
            if (randomNumber1 > randomNumber2) {
                for (int i = randomNumber2; i < randomNumber1; i++) {
                    if (i % 5 != 0) s += i + "-";
                }
                System.out.println(s.substring(s.length() - 3));
            } else {
                for (int i = randomNumber1; i < randomNumber2; i++) {
                    if (i % 5 != 0) s += i + "-";
                }
                System.out.println(s.substring(s.length() - 3));
                //Only 1 number
                int number = RandomNumberGenerator.getRandomNumber(0, 25);
                System.out.println(number);
                for (int i = number; i <= 25; i++) {
                    if (i % 5 != 0) System.out.print(i + "-");
                }


            }
        }

    }
}
