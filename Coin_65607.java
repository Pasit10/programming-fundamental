public class Coin_65607 {
    public static void main(String[] args) {
        Coin c1 = new Coin();
        System.out.println(c1);
        c1.setColor("pink");
        System.out.println(c1.getColer());
        c1.flip();
        System.out.println(c1.getColer());
        c1.setColor("burgandy");
        System.out.println(c1);
        c1 = new Coin(15);
        System.out.println(c1);
        c1.setColor("pearl");
        System.out.println(c1.getColer());
        c1.flip();
        System.out.println(c1.getColer());
        c1.setColor("brown");
        System.out.println(c1);
    }
}

class Coin{
    String colorHead = "red";
    String colorTail = "red";
    double radius = 1;
    String[] up_low = {colorHead,colorTail};  

    Coin(){
        radius = 1;
    }
    Coin(double radius){
        this.radius = radius;
    }
    double getRadiusCoin(){
        return radius;
    }
    String getColer(){
        return up_low[0];
    }
    void setColor(String color){
        up_low[0] = color;
        //colorHead = color;
    }
    String gabsee;
    void flip(){
        gabsee = up_low[0];
        up_low[0] = up_low[1];
        up_low[1] = gabsee;
    }
    public String toString(){
        return String.format("UP = %s , DOWN = %s, Radius = %.2f",up_low[0],up_low[1],radius);
    }
}
