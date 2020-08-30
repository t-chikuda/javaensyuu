public class Practice6_3 {
    public static void main(String[] args) {
        printHello();
    }
    static void printHello(){ //(2)
        system.out.println("Hello");
    }
}

class Point{
    int x;
    int y;
    void addX(int tx){ //(1)
        this.x += tx;
    }
}
