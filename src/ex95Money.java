public class ex95Money {

    public static void main(String [] args){
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        System.out.print("\n");

        a = a.plus(c);          // NOTE: new Money-object is created and reference to that
        //           is assigned to variable a.
        //       The Money object 10.00e that variable a used to hold
        //           is not referenced anymore

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        System.out.print("\n");
        Money x = new Money(10,0);
        Money y = new Money(3,0);
        Money z = new Money(5,0);

        System.out.println(x.less(y));  // false
        System.out.println(y.less(z));  // true

        System.out.print("\n");
        Money d = new Money(10,0);
        Money e = new Money(3,50);

        Money f = d.minus(e);

        System.out.println(d);  // 10.00e
        System.out.println(e);  // 3.50e
        System.out.println(f);  // 6.50e

        f = f.minus(d);         // NOTE: new Money-object is created and reference to that is assigned to variable c
        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(d);  // 10.00e
        System.out.println(e);  // 3.50e
        System.out.println(f);  // 0.00e
    }
}
