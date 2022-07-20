class one_method {
    static void sayHello(){
        System.out.println("Hello y/n!");
    }

    static void ily() {
        System.out.println("Did you know that ily stands for I love you?");
    }

    static String va() {
        return "y/n loves dumplings!";
    }

    static String EvilDumplings(String name) {
        return name + "Is very evil";
    }

    static String sayGood() {
        return "Good y/n";
    }

    static String sayHelloName(String name) {
        return "hello" + name;
    }

    public static void man(String[] args) {
        ily();
        System.out.println(EvilDumplings("Evil"));
        System.out.println("Hello world!");
        sayHello();

        for (int i = 0; i <5; i++) {
            sayHello();
        }

        sayGood();
        System.out.println(sayGood());

        String combineWords = sayHelloName("y/n");
        System.out.println(combineWords);
    }
}