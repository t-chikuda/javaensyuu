public class Practice5_3 {
    public static void main(String[] args){

        Rectangle re = new Rectangle(4,4);
        System.out.println(re.getArea());
        Rectangle r = new Rectangle(5,5);
        System.out.println(re.isLarger(r));
    }
}

class Rectangle{
    double width;
    double height;

    double getArea(){ // (1)
        return this.width * this.height;
    }

    Rectangle (double width,double height){ //(2)
        this.width = width;
        this.height = height;
    }

    boolean isLarger (Rectangle r){ //(3)
        double Area = this.getArea();
        double rArea = r.getArea();
        if(Area > rArea){
            return true;
        }else{
            return false;
        }
    }
}
