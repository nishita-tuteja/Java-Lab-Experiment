public class Problem3 {
    public static void main(String[] args) {
        BoxWeight bw1 = new BoxWeight(2, 3, 4, 10);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(bw1); // Copy constructor
        bw2.displayVolume();
        bw2.displayWeight();
    }
}

class Box {
    private float width, height, depth;

        public Box() {
        width = height = depth = 0;
    }

        public Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

        public Box(Box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

        public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }

        public void displayVolume() {
        System.out.println("Volume = " + (width * height * depth));
    }
}

class BoxWeight extends Box {
    private float weight;

       public BoxWeight() {
        super();
        weight = 0;
    }

        public BoxWeight(float w, float h, float d, float weight) {
        super(w, h, d);
        this.weight = weight;
    }

       public BoxWeight(BoxWeight bw) {
        super(bw);
        this.weight = bw.weight;
    }

        public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

        public void displayWeight() {
        System.out.println("Weight = " + weight);
    }
}
