package explanations;
/** precedence order of operations in Java */
/** postfix ++ and -- */
/** multiplicative *, /, and % */
/** additive + and - */
/** shift >> << >>> */
/** relational < > <= >= instanceof */
/** equality == != */
/** AND & */
/** OR || */
/** ternary ? : */
/** assignment = += -= *= /= %= &= ^= <<= >>= >>>= */

/** operators */
/* + addition */
/* - subtraction */
/* * multiplication */
/* / division */
/* % remainder */

class ArithmeticDemo {
  public static void main(String[] args) {
    int result = 1 + 2;
    // 3
    System.out.println("Result = " + result);

    result = result * 2;
    // 6
    System.out.println("Result = " + result);

    result = result / 2;
    // 3
    System.out.println("Result = " + result);

    result = result % 3;
    // 0
    System.out.println("Result = " + result);
  };
};


/** Unary Operators */
/* + unary plus operator */
/* - unary minus operator */
/* ++ increment operator */
/* -- decrement operator */
/* ! inverts value of boolean */

class UnaryDemo {
  public static void main(String[] args) {
    int result = +1;
    // 1
    System.out.println("Result = " + result);

    result--;
    // 0
    System.out.println("Result = " + result);

    result++;
    // 1
    System.out.println("Result = " + result);

    result = -result;
    // -1
    System.out.println("Result = " + result);

    boolean bool = false;
    // false
    System.out.println("Result = " + bool);

    System.out.println("Result = " + !bool);
    // true
  };
};

/** ++ and -- can be placed as a prefix or postfix */
/* if used as prefix the value evaluates to the incremented value */
/* if used as a postfix it evaluates to the original value */

class PrePostDemo {
  public static void main(String[] args) {
    int i = 3;
    i++;
    // 4

    ++i;
    // 5
    
    System.out.println(i);
    // 6

    System.out.println(++i);
    // 6

    System.out.println(i++);
    // 7

    System.out.println(i);
    // 7
  };
};