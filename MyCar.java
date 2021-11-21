public class MyCar {
    public static void main(String [] args){
        Car toyota=new Car();
        toyota.setColor("red");
        toyota.setSpeed(200);
        toyota.setMilage(1345);
        System.out.println("Toyota");
        System.out.println("color = "+ toyota.getColor());
        System.out.println("speed = "+ toyota.getSpeed());
        System.out.println("milage = "+ toyota.getMilage());

        Car honda=new Car();
        honda.setColor("blue");
        honda.setSpeed(300);
        honda.setMilage(8987);
        System.out.println("Honda");
        System.out.println("color = "+ honda.getColor());
        System.out.println("speed = "+ honda.getSpeed());
        System.out.println("milage = "+ honda.getMilage());
    }
    
}
