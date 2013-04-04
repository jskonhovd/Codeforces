object B_177 {

  def result(ls: List[Int], x : Int, d: Int): Int = {
   
    def checkIfNumCanBeEqual(a:Int, b:Int, ac: Int): Int = {
    	if(a == b){ ac }
	    	else if (a < b){
	    		if(a+d > b){ -1 }
	    		else { checkIfNumCanBeEqual(a+d, b, ac+1) }
    	}
    	else { 
    		if(a-d < b ) { -1 }
	    	else { checkIfNumCanBeEqual(a-d, b, ac+1) }
    	}
    }
    	    	   
    
	def helper(xs: List[Int], acc: Int): Int = {
	  
		if(xs.isEmpty)
		{
		  acc
		}
		else
		{
			var temp = checkIfNumCanBeEqual(x, xs.head, 0)
			if(temp == -1)
			{
			  -1
			}
			else
			{
				helper(xs.tail, acc+temp)			
			}
			
	    }
	}	
    var accum = helper(ls,0)
   
    return accum
  }
  
  def getMin(xs:List[Int], ls: List[Int], acc: Int, d:Int):Int = {
    if(ls.isEmpty)
    {
    	acc
    }
    else
    {
    	var x = result(xs,ls.head, d)
    	if(x != -1)
    	{
    		var ret = Math.min(x , acc)
    		getMin(xs, ls.tail, ret, d)
    	}
    	else
    	{
    	  if(ls.tail == Nil)
    	  {
    		  getMin(xs, ls.tail, acc, d)
    	  }
    	  else
    	  {
    	    -1
    	  }
    	}
	}
    }
    
  
  
  def R = readLine().split(" ").toList map(_.toInt)
  def main(args: Array[String]): Unit = {
    var N = R
    var n = N.head
    var m = N.tail.head
    var d = N.tail.tail.head
    
    def loop(acc: Int, ls: List[Int]): List[Int] = { 
      
      if(acc >= n)
      {        
        ls
      }
      else
      {
        loop(acc+1,ls:::R)
      }
    }
    var k = loop(0, Nil)
    var y = getMin(k,k,Int.MaxValue,d)  
    println(y)


  }

}