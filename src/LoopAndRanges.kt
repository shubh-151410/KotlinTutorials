fun main(args:Array<String>)
{

//    Note: One Type Loop
    for(a:Int in 1..100)
    {
        println(a)
    }

    // Note: Second Type Loop
    var b = 1..100
    for(a in b)
    {
        println(a)
    }
    // Note: Third Type Loop
    for(a in 100 downTo 1)
    {
        println(a)
    }

    // Note: Fourth Type Loop
    for(a in 100 downTo  1 step 5)
    {
        println(a)
    }

    val capitals = listOf("abc","def","ghi","ijk")
    for(capital in capitals)
    {
        println(capital)
    }

    var i = 1
    while(i < 10)
    {
        i--
    }

    do{
        var i=10
        i--
    }while (i<10)
    
//Label in Loop
    loop@for(i in 1..100)
    {
        for(j in 1..100)
        {
            if(i%j == 0)
                break@loop
        }
    }
}