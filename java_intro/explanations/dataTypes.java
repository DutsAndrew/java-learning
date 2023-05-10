package explanations;
public class dataTypes {
  // byte: 8-bit signed two's complement. Min value of -128 and max value of 127. 
  // Used in place of int when limit's clarify your code.
  byte b = 100;

  // short: 16-bit signed two's complement integer.
  // Min value of -32,768 and max value of 32,7676
  // Can save memory in large arrays.
  short s = 1000;

  // int: 32-bit signed two's complement integer
  int value = 0;

  // long: 64-bit two's complement integer.
  // Min value of -2^63 and max value of 2^61-1
  long l = 500;

  // float: single precision 32 bit IEEE 754
  // floating point. Must have an F or f at the end or else it's a double
  float f = 123.4f;

  // double: double precision 64-bit IEEE 754 floating point. trailing d or D is optional here.
  double d = 123.5d;

  // char: 16-bit unicode character. Min value of
  // '\u0000' and max value of '\uffff'.
  char c = 'C';
}
