package homePractice.o_p_p;

public class Practice_StringBufferAndBuilder {
    public static void main(String[] args) {
        // append() insert() delete()

        StringBuffer sbf=new StringBuffer("Melda");
        sbf.append(" "+"SAV");
        System.out.println(sbf);
        sbf.insert(5,' ');
        System.out.println(sbf);
        sbf.delete(5,' ');
        System.out.println(sbf);
        sbf.delete(sbf.length()-3,sbf.length());
        System.out.println(sbf);
        sbf.insert(0,"hi");
        System.out.println(sbf);

    }
}
