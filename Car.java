class Car {
    private String color;
    private int speed;
    private int milage;

    public void setColor(String color)
    {
        this.color= color;
    }
    public void setSpeed(int speed)
    {
        this.speed= speed;
    }
    public void setMilage(int milage)
    {
        this.milage= milage;
    }
    public void displayToyota()
    {
        System.out.println("color = "+this.color );
        System.out.println("speed = "+this.speed );
        System.out.println("milage = "+this.milage );
    }
    public String getColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }
    public int getMilage(){
        return milage;
    }
}

