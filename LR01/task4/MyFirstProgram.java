import myfirstpackage.*;

class MyFirstClass { 

    public static void main(String[] s)
    { 
        MySecondClass o = new MySecondClass(10, 11);
        System.out.println(o.BitwiseOr());
        for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
			o.SetX(i);
			o.SetY(j);
			System.out.print(o.BitwiseOr());
			System.out.print(" ");
			} 
             System.out.println();
    } 

} 
}

