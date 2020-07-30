object rational_neg extends App{
    val r1 = new Rational(5,6);
    val r2 = new Rational(8,9);
    var x = r1.neg;
    var y = r2.neg;
    println(x);
    println(y);
    
}

class Rational(n:Int,d:Int){
    def numer:Int = n/(gcd(n,d));
    def denom:Int = d/gcd(n,d);

    //the number converts by constructor
    def this(n:Int) = this(n,1);
    //get gcd
    private def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b);
    //get negative 
    def neg = new Rational(-this.numer,this.denom);
    //output
    override def toString = numer + "/" + denom;
}