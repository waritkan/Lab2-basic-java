public class Rectangle {
    private float height;
    private float weight;

    public Rectangle(float height,float weight){
        this.height= height;
        this.weight= weight;
    }
    
    public void setHeight(float height)
    {
        this.height= height;
    }
    public void setWeight(float weight)
    {
        this.weight= weight;
    }
    public void displayShow()
    {
        System.out.println("height = "+this.height );
        System.out.println("weight = "+this.weight );
    }
    public float getHeight(){
        return height;
    }
    public float getWeight(){
        return weight;
    } 
}
