package relationalOperators;

public class RelationOperators {
    public static void main(String[] args) {
        int a=4;
        int b=10;
        boolean isAEqualToB=a==b;//means a is equal to b
        boolean isNotAEqualToB=a!=b;// means a is not equal to b
        System.out.println("a=b" + isAEqualToB);
        System.out.println("a!=b "+ isNotAEqualToB);

        boolean isAGreaterThanB=a>b;
        boolean isSmallerThanB=a<b;
        boolean isAGreaterOrEqualThanB=a>=b;
        boolean isASmallerOrEqualThanB=a>=b;

        System.out.println("a>b; "+isAGreaterThanB);
        System.out.println("a<b"+isSmallerThanB);
        System.out.println("a>=b;"+isAGreaterOrEqualThanB);
        System.out.println("a>=b;"+isASmallerOrEqualThanB);
/// x+y==--z  same as this==>x+y+z==z
    }
}
