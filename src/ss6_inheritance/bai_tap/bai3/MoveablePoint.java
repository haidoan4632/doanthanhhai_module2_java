package ss6_inheritance.bai_tap.bai3;

public class MoveablePoint extends Point {
    private float XSpeed;
    private float YSpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float XSpeed, float YSpeed) {
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.XSpeed = xSpeed;
        this.YSpeed = ySpeed;
    }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }

    public float[] getSpeed(float XSpeed, float YSpeed) {
        return new float[]{this.XSpeed, this.YSpeed};
    }

    public void setSpeed(float XSpeed, float YSpeed) {
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public float[] move() {
        super.setX(super.getX() + XSpeed);
        super.setY(super.getY() + YSpeed);
        return new float[]{super.getX(), super.getY()};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "XSpeed=" + XSpeed +
                ", YSpeed=" + YSpeed +
                "} " + super.toString();
    }
}

