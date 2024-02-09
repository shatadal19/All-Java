class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D add(Vector3D other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        double newZ = this.z + other.z;
        return new Vector3D(newX, newY, newZ);
    }

    public Vector3D operatorPlus(Vector3D other) {
        return this.add(other);
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}

public class Vec {
    public static void main(String[] args) {
        // Instantiate two Vector3D objects
        Vector3D vector1 = new Vector3D(11.45, 12.98, 13.65);
        Vector3D vector2 = new Vector3D(14.56, 15.76, 16.87);

        // Perform vector addition using the overloaded operator '+'
        Vector3D result = vector1.operatorPlus(vector2);

        // Display the result
        System.out.print("Vector1: ");
        vector1.display();

        System.out.print("Vector2: ");
        vector2.display();

        System.out.print("Result: ");
        result.display();
    }
}