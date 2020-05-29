package cl.abcdin.sst.utils;

public class AuxConverter 
{
	public static String calculaDV(String rut)
    {
    int a =Integer.parseInt(rut);

    //variables contenedora

    int n,b,c,d,e,f,g,h,i;

    //descomponer el cuerpo del rut, para luego contener cada numero en una va&lt;riable.

    int A=a/10000000; //se guarda el primer numero

    n=a%10000000;

    int B=n/1000000;

    n=n%1000000;

    int C=n/100000;

    n=n%100000;

    int D=n/10000;

    n=n%10000;

    int E=n/1000;

    n=n%1000;

    int F=n/100;

    n=n%100;

    int G=n/10;

    n=n%10;

    // Multiplicar cada digito,

    b=A*3; c=B*2; d=C*7; e=D*6; f=E*5; g=F*4; h=G*3; i=n*2;

     //sumar las multiplicaciones

    int suma=b+c+d+e+f+g+h+i;

     //dividir el total de la suma en 11

    int division= suma/11;

     //sacar el resto ya que con eso se trabaja

    int resto=suma%11;

    String respuesta;
     //a 11 se le quita el resto
    String isNull;
    int total=11-resto;
    if(A==0)
        isNull="";
    else
        isNull=String.valueOf(A);
    //19646391
    //7205080
    
    
    if(total==10 )
    respuesta=""+isNull+B+C+D+E+F+G+n+"-K";
    else
    respuesta=""+isNull+B+C+D+E+F+G+n+"-"+total+"";
    
    
    if(total==11)
      {
          respuesta=""+isNull+B+C+D+E+F+G+n+"-"+"0";
      }
 

    return respuesta;
    }
}
