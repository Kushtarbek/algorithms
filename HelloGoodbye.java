public class HelloGoodbye {
    public static void main(String[] args) {
        if(args.length != 2) {
            return;
        }

        String name1 = args[0];
        String name2 = args[1];

        System.out.println("Hello "+name1+" and "+name2 );
        System.out.println("Goodbye "+name1+" and "+name2 );


    }
}
