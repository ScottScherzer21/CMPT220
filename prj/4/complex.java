public class complex implements Cloneable {

    //declare instances for complex class
    private double real;
    private double imaginary;
    public complex addition_answer;
	public complex subtraction_answer;
	public complex multiplication_answer;
    public complex division_answer;
    public double absolute_value_answer;
    
    //default constructor
    public complex() {
        real = 0.0;
        imaginary = 0.0;
    }

    //constructor for a complex number
    public complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //constrcutor that sets the instance to the queued object
    public complex(complex complex_var) {
        this.real = complex_var.real;
        this.imaginary = complex_var.imaginary;
    }

    //getters and setters got real and imaginary
    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imaginary;
    }

    
    //method to add the numbers passed through 
    public complex add(complex complex_var) {
        return new complex(this.real + complex_var.real, this.imaginary + complex_var.imaginary);
    }

    //method to subtact the numbers passed through
    public complex subtract(complex complex_var) {
        return new complex(this.real - complex_var.real, this.imaginary - complex_var.imaginary);
    }

    //method to multiply the numbers passed through
    public complex multiply(complex complex_var) {

        double real = complex_var.real * this.real - complex_var.imaginary * imaginary;
        double imaginary = complex_var.real * this.imaginary + complex_var.imaginary * this.real;

        return new complex(real, imaginary);

    }

     //method to divide the numbers passed through
     public complex divide(complex complex_var) {
        complex a = this;
        return a.multiply(complex_var.reciprocal());
    }

    //method to return the reciprocal of what was passed through 
    public complex reciprocal() {
        double scale = real * real + imaginary * imaginary;
        return new complex(real / scale, -imaginary / scale);
    }

    //method to return the absolute value of the provided data
    public double abs() {

        return Math.sqrt(real * real + imaginary * imaginary);
    }

    //return a string for the real and imaginary numbers 
    @Override
    public String toString() {
        if (imaginary < 0) {
            return "" + String.format("%.2f", real) + " -" + String.format("%.2f", Math.abs(imaginary)) + "i";
        } else {
            return "" + String.format("%.2f", real) + " +" + String.format("%.2f", Math.abs(imaginary)) + "i";
        }
    }
}
