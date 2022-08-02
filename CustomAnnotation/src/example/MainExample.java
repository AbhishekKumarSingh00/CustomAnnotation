package example;


public class MainExample {

    public static void main(String[] args) {

        Demo demo = new Demo();

        Class<? extends Demo> c = demo.getClass();
        System.out.println(c.getName());

        UserDetails anno = c.getAnnotation(UserDetails.class);
        System.out.println(anno.myRank());
        System.out.println(anno.name());
        System.out.println(anno.city());
    }

}
