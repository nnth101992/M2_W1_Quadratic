public class Quadratic {
    double a, b, c, delta, root1, root2;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getDiscriminant() {
        this.delta = b * b - 4 * a * c;
    }

    public double root1() {
        this.root1 = (-b + Math.pow(this.delta, 0.5)) / (2 * a);
        return this.root1;
    }

    public double root2() {
        this.root2 = (-b - Math.pow(this.delta, 0.5)) / (2 * a);
        return this.root2;
    }

    public double rootLinear() {
        this.root1 = this.root2 = -b / (2 * a);
        return this.root1;
    }

    public double rootDeltaZero() {
        this.root1 = this.root2 = -c / b;
        return this.root1;
    }

    public String getRoots() {
        if (this.a == 0) {
            if (this.b == 0) {
                return "The equation has no real roots";
            } else {
                return "The equation has one root: " + rootDeltaZero();
            }
        } else {
            getDiscriminant();
            if (this.delta > 0) {
                return "The equation has 2 roots " + root1() + " and " + root2();
            } else if (this.delta == 0) {
                return "The equation has double roots " + rootLinear();
            } else {
                return "The equation has no real roots";
            }
        }
    }
}

