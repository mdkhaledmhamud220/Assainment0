public class Runner {
    public static void main(String[] args) {
        Person first = new Person();
        System.out.println("First person name : " + first.getName());
        System.out.println("First person age : " + first.getAge());
        Person second = new Person("Afnan", 12);
        System.out.println("Second person name : " + second.getName());
        System.out.println("Second person age : " + second.getAge());
    }
}
