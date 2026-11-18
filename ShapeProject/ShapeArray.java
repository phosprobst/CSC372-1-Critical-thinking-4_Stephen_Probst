public class ShapeArray {

    public static void main(String[] args) {

        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(4.0, 8.0);
        Cone cone = new Cone(3.0, 6.0);

        Shape[] shapeArray = {
            sphere,
            cylinder,
            cone
        };

        for (Shape shape : shapeArray) {

            System.out.println(shape.toString());
            System.out.println("-------------------------");
        }
    }
}