class Dog {
    private String color;
    private float weight;

    public Dog(String color,float weight){
        this.color= color;
        this.weight= weight;
    }

    public void setColor(String color)
    {
        this.color= color;
    }
    public void setWeight(float weight)
    {
        this.weight= weight;
    }
    public void displayShow()
    {
        System.out.println("color = "+this.color );
        System.out.println("weight = "+this.weight );
    }
    public String getColor(){
        return color;
    }
    public float getWeight(){
        return weight;
    }
}
