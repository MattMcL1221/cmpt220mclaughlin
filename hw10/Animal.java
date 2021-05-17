//package hw10;
abstract class Animal implements Cloneable, Comparable<Animal> {
    private double weight;
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract String sound();
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return "Error: Clone Not Supported";
        }
    }
    @Override
    public int compareTo(Animal o) {
        return (int)(this.getWeight() - o.getWeight());
    }
}
