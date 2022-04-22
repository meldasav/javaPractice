package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 101) - 50;
        System.out.println(random);
        int point=0;
        if (random > 0){
             point+=10;//adding 10 points
            if(random>25){
             point+=10;
            }else if(random==7){
                point+=100;
            }
        }
        else if(random<0){
            if(random<-25){
                point+=0;
            }else if(random==-7){
                point+=10;
            }
        }else{
            point+=0;
        }
        System.out.println(point);

         }

    }

