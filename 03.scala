  
object account extends App{
  val acc1 = new Account("1111", 88000);
  val acc2 = new Account("2222", 37000);
  val transfer1 = new Account("1111", 10000);
  val balance1 = acc1.sub(transfer1)
  val balance2 = acc2.add(transfer1)

  println("Account1 --> Balance :"+balance1)
  println("Account2 --> Balance :"+balance2)

}

class Account(a:String,b:Double){

  def amount=b
  def number=a

  def add(r:Account)=new Account(number,this.amount+r.amount)
  def sub(r:Account)=new Account(number,this.amount-r.amount)

  override def toString = "'" +number + "'" + "-->" +amount

}