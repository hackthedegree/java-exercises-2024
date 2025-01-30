/**
 * A spatial vector is an abstract entity that has a magnitude and a direction.
 * Spatial vectors provide a natural way to describe properties of the physical
 * world, such as force, velocity, momentum, and acceleration.
 * 
 * This class stores the values for a vector and provides vector operations such
 * as addition, scaling, dot product etc. using methods.
 * 
 * @author Sitara Singh
 */
public class Vector {
    // TODO: add the instance variable called "coords"

    // TODO: add the constructor - ensure you make a deep copy

    // TODO
    public Vector plus(Vector that) throws InvalidDimensionException {
        if (this.dimension() != that.dimension()) {
            throw new InvalidDimensionException("PlusOperation: the vectors must have the same dimensionality", 0);
        }
        return null;
    }

    // TODO
    public Vector subtract(Vector that) throws InvalidDimensionException {
        if (this.dimension() != that.dimension()) {
            throw new InvalidDimensionException("SubtractionOperation: the vectors must have the same dimensionality", 1);
        }
        return null;
    }

    /**
     * Scale the vector in a sense stretching it by the given alpha value.
     * 
     * @param alpha scalar value to scale the vector with
     * @return new Vector object which is a scaled version of the vector
     */
    public Vector scale(double alpha) {
        double[] result = new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            result[i] = alpha * coords[i];
        return new Vector(result);
    }

    // TODO
    public double dot(Vector that) {
        return 0.0;
    }

    // TODO
    public double magnitude() {
        return 0.0;
    }

    /**
     * Computes the unit vector with same direction as this vector.
     * 
     * @return new unit Vector with same direction as this vector
     */
    public Vector direction() {
        return this.scale(1 / this.magnitude());
    }

    /**
     * Returns the dimension of the vector i.e. the number of directions in
     * which it has magnitude.
     * 
     * @return the number of directions in which it has magnitude
     */
    public int dimension() {
        return coords.length;
    }

    /**
     * Returns the ith Cartesian coordinate from the Vector values.
     * 
     * @param i the index of the Cartesian coordinate
     * @return ith Cartesian coordinate
     */
    public double cartesian(int i) {
        return coords[i];
    }

    public static void main(String[] args) {
        // TODO - add the test client
    }
}
