class Rational { // Real number
  int n; // numerator
  int d; // denominator
}

class Point {
  Rational x;
  Rational y;
}

class Triangle {
  Point p1;
  Point p2;
  Point p3;
}

// If slope infinity, b is the x
class Line {
  Rational m; // Slope
  Rational b; // y-intercept
}

// linesIntersect(Line l1, Line l2), etc.

// Create function boolean trianglesIntersect(Triangle t1, Triangle t2). True if they intersect, false otherwise.
// Feel free to make new classes. Break down the problem into smaller functions as much as you can.

// TEST REGULARLY
// TEST REGULARLY
// TEST REGULARLY
// TEST REGULARLY
// TEST REGULARLY
// TEST REGULARLY
// TEST REGULARLY
// TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT !!!!!!!!!!!!!!!!!!!!!!

public class ClassesFour {

  public static void main(String[] args) {
    System.out.println("Hello four");

    Point a, b, c, d, e, f;
    
    // 1
    /*
    {(-1, 1), (0, 2), (1, 1.5)}
    {(2, 1.5), (2.5, 1), (2.5, 3)}
    */
    // triangle 1
    a = createPoint(-1, 1, 1, 1);
    b = createPoint(0, 1, 2, 1);
    c = createPoint(1, 1, 3, 2);
    // triangle 2
    d = createPoint(2, 1, 3, 2);
    e = createPoint(5, 2, 1, 1);
    f = createPoint(5, 2, 3, 1);

    System.out.print("1:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 2
    /*
    {(-2, 2), (-1.5, 3), (-1, 2)}
    {(-3, 0), (-3, 1), (0, .5)}
    */
    // triangle 1
    a = createPoint(-2, 1, 2, 1);
    b = createPoint(-3, 2, 3, 1);
    c = createPoint(-1, 1, 2, 1);
    // triangle 2
    d = createPoint(-3, 1, 0, 1);
    e = createPoint(-3, 1, 1, 1);
    f = createPoint(0, 1, 1, 2);

    System.out.print("2:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 3
    /*
    {(-3, -2), (-2, 1), (-2, -3)}
    {(-1, 0), (-1, -1), (1, -1)}
    */
    // triangle 1
    a = createPoint(-3, 1, -2, 1);
    b = createPoint(-2, 1, 1, 1);
    c = createPoint(-2, 1, -3, 1);
    // triangle 2
    d = createPoint(-1, 1, 0, 1);
    e = createPoint(-1, 1, -1, 1);
    f = createPoint(1, 1, -1, 1);

    System.out.print("3:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 4
    /*
    {(-1, 0), (1, -1), (-1, -2)}
    {(0, -1), (3, 0), (3, -2)}
    */
    // triangle 1
    a = createPoint(-1, 1, 0, 1);
    b = createPoint(1, 1, -1, 1);
    c = createPoint(-1, 1, -2, 1);
    // triangle 2
    d = createPoint(0, 1, -1, 1);
    e = createPoint(3, 1, 0, 1);
    f = createPoint(3, 1, -2, 1);

    System.out.print("4:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 5
    /*
    {(-1, 1), (-1, 2), (1, 1.5)}
    {(.5, .5), (.5, 2.5), (2, 1.5)}
    */
    // triangle 1
    a = createPoint(-1, 1, 1, 1);
    b = createPoint(-1, 1, 2, 1);
    c = createPoint(1, 1, 3, 2);
    // triangle 2
    d = createPoint(1, 2, 1, 2);
    e = createPoint(1, 2, 5, 2);
    f = createPoint(2, 1, 3, 2);

    System.out.print("5:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 6
    /*
    {(-3, -.5), (-3, -1), (-2, -.5)}
    {(-1, 0), (-1, 1), (1, 1)}
    */
    // triangle 1
    a = createPoint(-3, 1, -1, 2);
    b = createPoint(-3, 1, -1, 1);
    c = createPoint(-2, 1, -1, 2);
    // triangle 2
    d = createPoint(-1, 1, 0, 1);
    e = createPoint(-1, 1, 1, 1);
    f = createPoint(1, 1, 1, 1);

    System.out.print("6:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 7
    /*
    {(-2, .5), (-2, -1.5), (-.5, -1)}
    {(-2.5, -.5), (-1, .5), (-1, -1.5)}
    */
    // triangle 1
    a = createPoint(-2, 1, 1, 2);
    b = createPoint(-2, 1, -3, 2);
    c = createPoint(-1, 2, -1, 1);
    // triangle 2
    d = createPoint(-5, 2, -1, 2);
    e = createPoint(-1, 1, 1, 2);
    f = createPoint(-1, 1, -3, 2);

    System.out.print("7:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 8
    /*
    {(.5, .5), (.5, -.5), (2, -.5)}
    {(.5, -1), (.5, -2), (3, -2)}
    */
    // triangle 1
    a = createPoint(1, 2, 1, 2);
    b = createPoint(1, 2, -1, 2);
    c = createPoint(2, 1, -1, 2);
    // triangle 2
    d = createPoint(1, 2, -1, 1);
    e = createPoint(1, 2, -2, 1);
    f = createPoint(3, 1, -2, 1);

    System.out.print("8:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 9
    /*
    {(1, 2), (1, 1), (-1, 1)}
    {(.5, 1), (.5, -.5), (2.5, 1)}
    */
    // triangle 1
    a = createPoint(1, 1, 2, 1);
    b = createPoint(1, 1, 1, 1);
    c = createPoint(-1, 1, 1, 1);
    // triangle 2
    d = createPoint(1, 2, 1, 1);
    e = createPoint(1, 2, -1, 2);
    f = createPoint(5, 2, 1, 1);

    System.out.print("9:  ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 10
    /*
    {(1.5, 2.5), (-1, .5), (-1, 2.5)}
    {(-3, 2), (-1, .5), (-1, 2.5)}
    */
    // triangle 1
    a = createPoint(3, 2, 5, 2);
    b = createPoint(-1, 1, 1, 2);
    c = createPoint(-1, 1, 5, 2);
    // triangle 2
    d = createPoint(-3, 1, 2, 1);
    e = createPoint(-1, 1, 1, 2);
    f = createPoint(-1, 1, 5, 2);

    System.out.print("10: ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 11
    /*
    {(-1, -1), (-1, -2), (-3, -1.5)}
    {(1, -.5), (1, -1.5), (-1, -1)}
    */
    // triangle 1
    a = createPoint(-1, 1, -1, 1);
    b = createPoint(-1, 1, -2, 1);
    c = createPoint(-3, 1, -3, 2);
    // triangle 2
    d = createPoint(1, 1, -1, 2);
    e = createPoint(1, 1, -3, 2);
    f = createPoint(-1, 1, -1, 1);

    System.out.print("11: ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // 12
    /*
    {(1, -1), (1, -2), (-1, -1.5)}
    {(1, -1.5), (3, -1), (3, -2)}
    */
    // triangle 1
    a = createPoint(1, 1, -1, 1);
    b = createPoint(1, 1, -2, 1);
    c = createPoint(-1, 1, -3, 2);
    // triangle 2
    d = createPoint(1, 1, -3, 2);
    e = createPoint(3, 1, -1, 1);
    f = createPoint(3, 1, -2, 1);

    System.out.print("12: ");
    if(trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    Line l1 = new Line();
    Line l2 = new Line();
    Line l3 = new Line();
    l1.m = findSlope(a, b);
    l2.m = findSlope(a, c);
    l3.m = findSlope(b, c);
    l1.b = findIntercept(a, b);
    l2.b = findIntercept(a, c);
    l3.b = findIntercept(b, c);
    // Point a = new Point();
    //a.x = new Rational();
    /*
    a.x = createRational(1, 4); // 2, 2
    a.y = createRational(3, 7);
    b.x = createRational(4, 7);
    b.y = createRational(5, 9);
    c.x = createRational(1, 4);
    c.y = createRational(4, 10);
    */
    //a.x.n = 2;
    //a.x.d = 1;
    /*
    a.y.n = 3;
    a.y.d = 1;
    b.x.n = 4;
    b.x.d = 1;
    b.y.n = 5;
    b.y.d = 1;
    */
    findSlope(a, b);
    findIntercept(a,b);
    
    if (trianglesIntersect(a,b,c,d,e,f)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
  public static Rational createRational(int numerator, int denominator) {
    Rational r = new Rational();
    r.n = numerator;
    r.d = denominator;
    return r;
  }
  public static Point createPoint(int xn, int xd, int yn, int yd) {
    Point p = new Point();
    p.x = createRational(xn, xd);
    p.y = createRational(yn, yd);
    return p;
  }
  public static Triangle createTriangle(Point a, Point b, Point c) {
    Triangle tri = new Triangle();
    tri.p1 = createPoint(a.x.n, a.x.d, a.y.n, a.y.d);
    tri.p2 = createPoint(b.x.n, b.x.d, b.y.n, b.y.d);
    tri.p3 = createPoint(c.x.n, c.x.d, c.y.n, c.y.d);
    return tri;
  }
  public static int min(int a, int b) {
    return a < b ? a : b;
  }
  public static void simplify(Rational num) {
    // If the signs are different the entire rational is negative
    boolean negative = ((num.n < 0) != (num.d < 0));
    // Remove signs
    if(num.n < 0) {
      num.n = num.n * -1;
    }
    if(num.d < 0) {
      num.d = num.d * -1;
    }
    // Reduce both the numerator and denominator by largest possible number
    for(int i = min(num.n, num.d); i > 0; i--) {
      if((num.n % i == 0) && (num.d % i == 0)) {
        num.n = num.n / i;
        num.d = num.d / i;
      }
    }
    // Finally, apply the sign
    if(negative) {
      num.n = num.n * -1;
    }
    // Special case: zero
    if(num.n == 0) {
      num.d = 1;
    }
  }
  /*
  public static boolean trainglesIntersect(Triangle t1, Triangle t2) {
    // Find a way to see how the lines might intersect. 

  }
  */
  public static boolean trianglesIntersect(Point a, Point b, Point c, Point d, Point e, Point f) {
    if ((a.x.d == 0) || (a.y.d == 0))
    if (ifEqual(a.x, b.x) && ifEqual(b.x, c.x)) {
      return false;
    }
    if (ifEqual(d.x, e.x) && ifEqual(e.x, f.x)) {
      return false;
    }
    if (ifEqual(a.y, b.y) && ifEqual(b.y, c.y)) {
      return false;
    }
    if (ifEqual(d.y, e.y) && ifEqual(e.y, f.y)) {
      return false;
    }
    if (ifEqual(findSlope(a,b), findSlope(b,c))) {
      return false;
    }
    if (ifEqual(findSlope(d,e), findSlope(e,f))) {
      return false;
    }
    if (ifInside(a, b, c, d, e, f)) {
      System.out.println("It is inside");
      return true;
    }
    if (ifSegementIntersect(a,b,d,e)) {
      System.out.println("a, b, d, e");
    }
    if (ifSegementIntersect(a,b,d,f)) {
      System.out.println("a, b, d, f");
    }
    if (ifSegementIntersect(a,b,e,f)) {
      System.out.println("a, b, e, f");
    }
    if (ifSegementIntersect(a,b,d,e) || ifSegementIntersect(a,b,d,f) || ifSegementIntersect(a,b,e,f)) {
      System.out.println("segement ab intersected");
      return true;
    }
    if (ifSegementIntersect(c,b,d,e) || ifSegementIntersect(c,b,d,f) || ifSegementIntersect(c,b,e,f)) {
      System.out.println("segement cb intersected");
      return true;
    }
    if (ifSegementIntersect(a,c,d,e) || ifSegementIntersect(a,c,d,f) || ifSegementIntersect(a,c,e,f)) {
      System.out.println("segement ac intersected");
      return true;
    }
    // if (ifEqual(findSlope(a, b), ) )
    System.out.println("None came true");
    return false;
  }
  public static boolean ifEqual(Rational a, Rational b) {
    if (a.n * b.d == a.d * b.n) {
      return true;
    } else {
      return false;
    }
  }
  public static void printRational(Rational a) {
    System.out.println("printedRational: " + a.n + "/" + a.d);
  }
  public static boolean pointInside(Triangle m, Point n) {
    Rational slope1 = new Rational();
    Rational slope2 = new Rational();
    Rational slope3 = new Rational();
    slope1 = findSlope(m.p1, m.p2);
    slope2 = findSlope(m.p1, m.p3);
    slope3 = findSlope(m.p2, m.p3);
    int r = 0;
    // slope1: 1, 2
    // slope2: 1, 3
    // slope3: 2, 3

    if (slope1.d == 0) {
      if (lessThan(m.p3.x, findIntercept(m.p1, m.p2))) {
        if (lessThan(n.x, findIntercept(m.p1, m.p2))) {
          r++;
        }
      } else {
        if (greaterThan(n.x, findIntercept(m.p1, m.p2))) {
          r++;
        }
      }
    }
    if (slope2.d == 0) {
      if (lessThan(m.p2.x, findIntercept(m.p1, m.p3))) {
        if (lessThan(n.x, findIntercept(m.p1, m.p3))) {
          r++;
        }
      } else {
        if (greaterThan(n.x, findIntercept(m.p1, m.p3))) {
          r++;
        }
      }
    }
    if (slope3.d == 0) {
      if (lessThan(m.p1.x, findIntercept(m.p3, m.p2))) {
        if (lessThan(n.x, findIntercept(m.p3, m.p2))) {
          r++;
        }
      } else {
        if (greaterThan(n.x, findIntercept(m.p3, m.p2))) {
          r++;
        }
      }
    }
    if (lessThan(m.p3.y, add(mult(slope1, m.p3.x), findIntercept(m.p1, m.p2)))) {
      if (lessThan(n.y, add(mult(slope1, n.x), findIntercept(m.p1, m.p2)))) {
        r++;
      }
    } else {
      if (greaterThan(n.y, add(mult(slope1, n.x), findIntercept(m.p1, m.p2)))) {
        r++;
      }
    }
    if (lessThan(m.p2.y, add(mult(slope2, m.p2.x), findIntercept(m.p1, m.p3)))) {
      if (lessThan(n.y, add(mult(slope2, n.x), findIntercept(m.p1, m.p3)))) {
        r++;
      }
    } else {
      if (greaterThan(n.y, add(mult(slope2, n.x), findIntercept(m.p1, m.p3)))) {
        r++;
      }
    }
    if (lessThan(m.p1.y, add(mult(slope3, m.p1.x), findIntercept(m.p3, m.p2)))) {
      if (lessThan(n.y, add(mult(slope3, n.x), findIntercept(m.p3, m.p2)))) {
        r++;
      }
    } else {
      if (greaterThan(n.y, add(mult(slope3, n.x), findIntercept(m.p3, m.p2)))) {
        r++;
      }
    }
    if (r == 3) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean ifInside(Point a, Point b, Point c, Point d, Point e, Point f) {
    Rational otherYc = new Rational();
    otherYc = add(mult(findSlope(a, b), c.x), findIntercept(a,b));
    Triangle Tri1 = createTriangle(a, b, c);
    Triangle Tri2 = createTriangle(d, e, f);

    int r = 0;



    if (pointInside(Tri1, d) && pointInside(Tri1, e) && pointInside(Tri1, f)) {
      return true;
    }
    if (pointInside(Tri2, a) && pointInside(Tri2, b) && pointInside(Tri2, c)) {
      return true;
    }
    return false;
  }
  public static boolean ifSegementIntersect(Point a, Point b, Point c, Point d) {
    Rational m1 = new Rational();
    Rational m2 = new Rational();
    Rational b1 = new Rational();
    Rational b2 = new Rational();
    Rational x = new Rational();
    Rational y = new Rational();
    Line l1 = new Line();
    Line l2 = new Line();
    l1.m = findSlope(a,b);
    l2.m = findSlope(c,d);
    l1.b = findIntercept(a,b);
    l2.b = findIntercept(c,d);
    if (findSlope(a,b).n == findSlope(c,d).n && findSlope(a,b).d == findSlope(c,d).d) {
      return false;
    }
    
    

    Rational negativel2b = new Rational();
    Rational negativel2m = new Rational();
    negativel2b.n = l2.b.n * -1;
    negativel2m.n = l2.m.n * -1;
    negativel2b.d = l2.b.d;
    negativel2m.d = l2.m.d;
    Rational together1 = new Rational();
    Rational together2 = new Rational();
    together1 = add(l1.m, negativel2m);
    together2 = add(l1.b, negativel2b);
    together1.n = together1.n * -1;
    
    x = divide(together2, together1);
    y = add(mult(x,l1.m), l1.b);
    if (l1.m.d == 0) {
      x = a.x;
      y = add(mult(x, l2.m), l2.b);
    }
    if (l2.m.d == 0) {
      x = c.x;
      y = add(mult(l1.m, x), l1.b);
    }
    simplify(x);
    simplify(y);
    if (x.d == 0) {
      return false;
    }
    if (y.d == 0) {
      return false;
    }
    int r = 0;
    // The thing that is less is checked if it x is greater than or equal to that. While the other value is less than or equal to
    if (findSlope(a,b).d == 0) {
      if (greaterThan(a.y,b.y)) {
        if (!lessThan(y, b.y) && !greaterThan(y, a.y)) {
          r++;
        }
      } else {
        if (!lessThan(y, a.y) && !greaterThan(y, b.y)) {
          r++;
        }
      }
      
    } else {
      if (lessThan(b.x, a.x)) {
        if (!greaterThan(x, a.x) && !lessThan(x, b.x)) {
          r++;
        }
      } else {
        if (!greaterThan(x, b.x) && !lessThan(x, a.x)) {
          r++;
        }
      }
    }
    if (findSlope(c,d).d == 0) {
      if (greaterThan(c.y,d.y)) {
        if (!lessThan(y, d.y) && !greaterThan(y, c.y)) {
          r++;
        }
      } else {
        if (!lessThan(y, c.y) && !greaterThan(y, d.y)) {
          r++;
        }
      }
      
    } else {
      if (lessThan(d.x, c.x)) {
        if (!greaterThan(x, c.x) && !lessThan(x, d.x)) {
          r++;
        }
      } else {
        if (!greaterThan(x, d.x) && !lessThan(x, c.x)) {
          r++;
        }
      }
    }
    if (r == 2) {
      return true;
    }
    return false;
    // Find a way to detect if the point where they intersect is on the line.
  }
  public static Rational findSlope(Point a, Point b) {
    /*
    slope.n = a.y.n - b.y.n;
    slope.d = a.x.d - b.x.d;
    */
    // a.y - b.y = numerator
    // a.x - b.x = denominator
    // Create a new rational that is the negative version of b
    Rational bNegativey = new Rational();
    Rational bNegativex = new Rational();
    bNegativey.n = b.y.n * -1;
    bNegativex.n = b.x.n * -1;
    bNegativey.d = b.y.d;
    bNegativex.d = b.x.d;
    /*
    slope.n = add(a.y, b.y);
    slope.d = add(a.x, b.x);
    */
    Rational dy = add(a.y, bNegativey);
    Rational dx = add(a.x, bNegativex);
    //divide(add(a.y,b.y));
    //divide(add(a.x,b.x));
    dy = divide(dy,dx);
    simplify(dy);
    return dy;
  }
  public static Rational findIntercept(Point a, Point b) {
    Rational m = new Rational();
    m = findSlope(a, b);
    
    // y = mx + b;
    // b = y - mx;
    // a.y.n = m(a.x.n) + b
    Rational total = new Rational();
    if (ifEqual(a.x,b.x)) {
      return a.x;
    }
    if (a.x.n * b.x.d == a.x.d * b.x.n) {
      total.n = 0;
      total.d = 1;
      return total;
    }
    /*
    if (m.d == 0) {
      Rational temp = new Rational();
      temp.n = a.x.n;
      temp.d = a.x.d;
      if (a.x.d == b.x.d) {
        // c.d and d.d are the slope you should use.
        temp = add(mult(findSlope(), a.x.c), findIntercept(a.x.c, a.x.d));
      } else {
        // a.d and b.d
      }
      // a.x is the x value for the intersection when bottom is 0.
    }*/
    total = mult(m, a.x);
    total.n = total.n * -1;
    total = add(total, a.y);
    simplify(total);
    return total;
  }
  public static int leastCommonMultiple(int a, int b, int c) {
    int i = 1;
    for (i = 1; (i % a != 0) || (i % b != 0) || (i % c != 0); i++);
    return i;
  }
  public static Rational mult(Rational a, Rational b) {
    Rational c = new Rational();
    c.n = a.n * b.n;
    c.d = a.d * b.d;
    simplify(c);
    return c;
  }
  // May run into problems if numbers are too large
  public static Rational add(Rational a, Rational b) {
    Rational c = new Rational();
    c.d = a.d * b.d;
    int stuff1, stuff2;
    stuff1 = a.n * b.d;
    stuff2 = b.n * a.d;
    c.n = stuff1 + stuff2;
    simplify(c);
    return c;
  }
  // Assumes a and b are positive
  // If negative, would have to deal with sign change
  public static boolean greaterThan(Rational a, Rational b) {
    boolean aNegative = ((a.n < 0) != (a.d < 0));
    boolean bNegative = ((b.n < 0) != (b.d < 0));
    if (ifEqual(a,b)) {
      return false;
    }
    if (a.n < 0 && a.d < 0) {
      a.n = a.n * -1;
      a.d = a.d * -1;
    }
    if (b.n < 0 && b.d < 0) {
      b.n = b.n * -1;
      b.d = b.d * -1;
    }
    if (a.n * b.d > a.d * b.n) {
      return true;
    } else {
      return false;
    }
  }
  // Assumes a and b are positive
  // If negative, would have to deal with sign change
  public static boolean lessThan(Rational a, Rational b) {
    boolean aNegative = ((a.n < 0) != (a.d < 0));
    boolean bNegative = ((b.n < 0) != (b.d < 0));
    if (ifEqual(a,b)) {
      return false;
    }
    if (a.n < 0 && a.d < 0) {
      a.n = a.n * -1;
      a.d = a.d * -1;
    }
    if (b.n < 0 && b.d < 0) {
      b.n = b.n * -1;
      b.d = b.d * -1;
    }
    if (a.n * b.d < a.d * b.n) {
      return true;
    } else {
      return false;
    }
  }
  // Will not return a simplified answer
  public static Rational divide(Rational a, Rational b) {
    Rational c = new Rational();
    c.n = b.d;
    c.d = b.n;
    c = mult(a,c);
    simplify(c);
    return c;
  }
}

// multiply once
// check greater than/less than
// createPoint()
// avoid changing the input in findSlope
//   note: changing the input is good only when it is the point of the function

// divide() will not return a simplified answer
// findSlope() will not return a simplified answer
