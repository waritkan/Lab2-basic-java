public class MyRectangle {
    public static void main(String [] args){
        Rectangle rec=new Rectangle(5,5);
        System.out.println("square " +rec.getHeight() +" x " + rec.getWeight());
        System.out.println("Area: "+ rec.getHeight()*rec.getWeight());
        System.out.println("Perimeter: "+ 2*(rec.getWeight()+rec.getHeight())+"\n");

        Rectangle nrec=new Rectangle(8,5);
        System.out.println("non_square " +nrec.getHeight() +" x " + nrec.getWeight());
        System.out.println("Area: "+ nrec.getHeight()*nrec.getWeight());
        System.out.println("Perimeter: "+ 2*(nrec.getWeight()+nrec.getHeight()));
    }
}
