/**
 * This is the class file is for the Triangle Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-30
 */

public class Triangle {
    // Class for Triangle

    // fields
    /**
    * triangle name.
    */
    private String name;
    /**
    * sideA Length.
    */
    private double sideA;
    /**
    * sideB Length.
    */
    private double sideB;
    /**
    * sideC Length.
    */
    private double sideC;
    /**
    * semiperimeter.
    */
    private double semiPeri;
    /**
    * area of triangle.
    */
    private double areaOfTriangle;
    /**
    * constant for radius formula.
    */
    private final double four = 4;

    // constructor
    /**
    * This contructor creates a base triangle.
    * @param inputA This is the user input for side A.
    * @param inputB This is the user input for side B.
    * @param inputC This is the user input for side C.
    */
    public Triangle(final int inputA, final int inputB, final int inputC) {
        // constructor sets the side lengtsh from user input
        this.name = " ";
        this.sideA = inputA;
        this.sideB = inputB;
        this.sideC = inputC;
        this.semiPeri = (sideA + sideB + sideC) / 2;
        this.areaOfTriangle = 0;
    }

    // Getters
    // get area of triangle
    /**
    * This getter returns the area of the triangle.
    * @return areaOfTriangle This is the area.
    */
    public double getArea() {
        return areaOfTriangle;
    }

    // get semiperimeter
    /**
    * This getter returns the semiperimeter of the triangle.
    * @return semiPeri This is the semiperimeter.
    */
    public double getPeri() {
        return (this.semiPeri * 2);
    }

    //methods
    /**
    * This method calculates the area.
    * @return areaOfTriangle This is the area.
    */
    public double calcArea() throws Exception {
        // calculates the area of the triangle
        try {
            if (isTriangleValid()) {
                // check passed

                // calculating area using Heron's formula
                this.areaOfTriangle = Math.sqrt(semiPeri * (semiPeri - sideA)
                                        * (semiPeri - sideB)
                                        * (semiPeri - sideC));
                return this.areaOfTriangle;
            } else {
                throw null;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method finds the name of the triangle.
    * @return name This is the name.
    */
    public String findName() throws Exception {
        // finds the name
        try {
            if (isTriangleValid()) {
                // check passed

                // if statement
                if (sideA == sideB && sideB == sideC && sideC == sideA) {
                    // check if all sides are the same length
                    this.name = "Equilateral";
                } else if (((sideA * sideA) + (sideB * sideB)
                            == (sideC * sideC)) || ((sideB * sideB)
                            + (sideC * sideC) == (sideA * sideA))
                            || ((sideC * sideC) + (sideA * sideA)
                            == (sideB * sideB))) {
                    // check if sides add up within pythagorean theorem
                    this.name = "Right";
                } else if (sideA != sideB && sideB != sideC && sideC != sideA) {
                    // check if all sides are different lengths
                    this.name = "Scalene";
                } else {
                    // if both checks fail, triangle is isosceles
                    this.name = "Isosceles";
                }
                // return statement
                return this.name;
            } else {
                throw null;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method calculates the height.
    * @return heightOfTriangle This is the height.
    */
    public double calcHeight() throws Exception {
        // calculates the height
        try {
            if (isTriangleValid()) {
                // check passed

                // calculate height
                double heightOfTriangle = 2 * (this.areaOfTriangle
                                                / this.sideB);

                return heightOfTriangle;
            } else {
                throw null;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method calculates the radius of the incircle.
    * @return radOfIncircle This is the radius of the incircle.
    */
    public double incircleRad() throws Exception {
        // calculates the radius
        try {
            if (isTriangleValid()) {
                // check passed

                // calculating incircle radius
                double radOfIncircle = this.areaOfTriangle / this.semiPeri;

                return radOfIncircle;
            } else {
                throw null;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method calculates the area of the circumcircle.
    * @return areaOfCircum This is the area of the circumcircle.
    */
    public double circumcircleArea() throws Exception {
        // calculates the area
        try {
            if (isTriangleValid()) {
                // check passed

                // calculate circumcircle radius
                double circumRad = (this.sideA * this.sideB * this.sideC)
                                    / (four * this.areaOfTriangle);
                // calculate circumcircle area
                double circumArea = Math.PI * (circumRad * circumRad);

                return circumArea;
            } else {
                throw null;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method determines if a triangle is valid.
    * @return This is a boolean.
    */
    protected boolean isTriangleValid() {
        // determines if inputs are for a triangle

        // checks if the sum of any two sides is greater than the third side
        if ((sideA + sideB > sideC) && (sideB + sideC > sideA)
                                && (sideC + sideA > sideB)) {
            // returns true if triangle is valid
            return true;
        } else {
            // returns false if side lengths cannot create a triangle
            return false;
        }
    }
}
