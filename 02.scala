object rational_sub extends App{
    // x-y-z where x=3/4, y=5/8, z=2/7
    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);
    var a = x - y - z;
    println(a);

}

class Rational(n:Int,d:Int){
    def numer:Int = n/(gcd(n,d));
    def denom:Int = d/gcd(n,d);

    //number converts  the constructor
    def this(n:Int) = this(n,1);
    //get the gcd 
    private def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b);
    //negative 
    def neg = new Rational(-this.numer,this.denom);
    //subtraction 
    def -(r:Rational)= new Rational(this.numer*r.denom - this.denom*r.numer,this.denom*r.denom);
    //output
    override def toString = numer + "/" + denom;
}