public class ColorableTest {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(5.2);
        objects[1] = new Square(3.3);
        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}
