package javaMemoryManagement;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city="Chicago";
        String address="Chicago";
        System.out.println(city==address);// not proper
        System.out.println(city.equals(address));//proper way
    }
}
