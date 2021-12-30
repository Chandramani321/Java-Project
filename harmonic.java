//Write a program to generate Harmonic Series.

Input - 5
Output - 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.28 (Approximately) */
class HarmonicSeries{
31
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
double result = 0.0;
while(num > 0){
result = result + (double) 1 / num;
num--;
}
System.out.println("Output of Harmonic Series is "+result);
}
}
