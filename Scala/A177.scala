package code

object A177 {
  
  def R = readLine().split(" ").toList map(_.toInt)
  
  def main(args: Array[String]): Unit = {
	  	var N = R
	    var n = N.head
	    var k = N.tail.head
	    
	  	def helper(acc: Int, sum: Int): Int = {
	    
	    if(acc > n)
	    {
	      sum
	    }
	    else
	    { 
	    	var foo = R
	    	var a = foo.head
	    	var b = foo.tail.head
	    	helper(acc+1, sum+b-a+1)
	    }
	  }	  	  	  

	    var sumX = helper(1,0)
	    if(sumX%k == 0)
	    {
	      println(0)
	      
	    }
	    else
	    {
	    	println(k-sumX%k)
	    }
	    
	  
	  }
    
    
    
  }

