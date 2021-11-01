package com.codegym;

public class Point3D extends Point2D {
    protected float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {this.x, this.y, this.z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D :("
                + getX()
                + ","
                + getY()
                + ","
                + getZ()
                + ")";
    }
}
