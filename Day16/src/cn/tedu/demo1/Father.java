package cn.tedu.demo1;

class Father {
    static {
        System.out.println("11111111111");
    }
    public Father() {
        System.out.println("33333333333");
    }
    {
        System.out.println("22222222222");
    }

}
class Son extends Father {
    static {
        System.out.println("44444444444");
    }
    {
        System.out.println("55555555555");
    }
    public Son() {
        System.out.println("66666666666");
    }
    public static void main(String[] args) {
        System.out.println("77777777777");
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Father();
    }
}


