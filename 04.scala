object bank_account extends App{

  var bank1:List[Bank]=List()

  bank1=bank1 :+ new Bank("111222333V",1234,26000.00)
  bank1=bank1 :+ new Bank("112233445V",2345,-450000.00)
  bank1=bank1 :+ new Bank("111122223V",3456,87000.00)
  bank1=bank1 :+ new Bank("111112222V",4567,-980000.00)


  val overdraft=(b:List[Bank])=>b.filter(x=>x.balance<0)

  val balance=(b:List[Bank])=>b.reduce((x,y)=>(new Bank(x.nic,x.acnumber,x.balance+y.balance)))

  val intrest=(b:List[Bank])=>b.map(x=>{
    if(x.balance<0) (new Bank(x.nic,x.acnumber,x.balance+x.balance*0.1)) else (new Bank(x.nic,x.acnumber,x.balance+x.balance*0.05))
  })

  println("Overdraft              :"+overdraft(bank1))
  println("Sum of acount balances :"+balance(bank1))
  println("Total Balace           :"+intrest(bank1))


}

class Bank(id:String,n:Int,b:Double){

  val nic:String=id
  val acnumber:Int=n
  var balance:Double=b



  override def toString = "["+nic+":"+acnumber +":" +balance+ "]"



}