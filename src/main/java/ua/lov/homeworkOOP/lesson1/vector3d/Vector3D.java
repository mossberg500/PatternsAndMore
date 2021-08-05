package ua.lov.homeworkOOP.lesson1.vector3d;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D addVector(Vector3D addVector) {
        return new Vector3D(x + addVector.x,
                y + addVector.y,
                z + addVector.z);
    }

    public Vector3D multiplicateScalar(double mltp) {
        return new Vector3D(x * mltp,
                y * mltp,
                z * mltp);
    }

    public Vector3D multiplicateVector(Vector3D mltp) {
        return new Vector3D(y * mltp.z - z * mltp.y,
                z * mltp.x - x * mltp.z,
                x * mltp.y - y * mltp.x);
    }

    @Override
    public String toString() {
        return "Vector3D [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}