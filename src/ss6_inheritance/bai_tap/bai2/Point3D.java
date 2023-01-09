package ss6_inheritance.bai_tap.bai2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setZ(z);
        this.setX(x);
        this.setY(y);
    }

    public float[] getXYZ() {
        float[] result = {getX(), getY(), getZ()};
        return result;
    }

    public String toString() {
        return "Point3D" +
                Arrays.toString(getXYZ());
    }
}
