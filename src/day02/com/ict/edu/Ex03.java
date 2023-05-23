package day02.com.ict.edu;
class Ex03{
    public static void main(String[] args){
      //  ���� :  �Ҽ����� ���� ����
      //  �Ǽ� :  �Ҽ����� �ִ� ���� 
      //  ����  < �Ǽ�       
      //  ���� :  byte  < short < int <long
      //           �⺻�� int �̴�.

      //  �Ǽ� :  float < double 
      //           �⺻�� double �̴�.

      // 1. byte :  -128 ~ 127 ( 256 = 2^8)
      byte  su1 = 125 ;
      System.out.println(su1);
    
      // 2. short : - 32768 ~ 32767
      short su2 = 125 ; 
      System.out.println(su2);

     // 3. int :  ������ �⺻
       int su3 = 125 ;
       System.out.println(su3);

     // 4. long :  int���� �� ���� ������ ������ ����
     //            �⺻������ ���� �ڿ� L �Ǵ� l �� ���δ�. ( �������� = ���θ�� )
     //            ���θ�� : �� ū�ڷ������� ���� �� �� �ִ�.
 
      long su4 = 125L ;
      System.out.println(su4);

     //  �����ڷ��� �� ū�ڷ����� ����ϸ� ����� ū�ڷ������� ����ȴ�.
     //  ���� �ڷ����� ū�ڷ����� ������ �� �ִ�. (���θ��)
     long su5 = 125 ;
     System.out.println(su5);
         
     char c1 = 'A' ;
     int su6 = c1  ; 
     System.out.println(su6);

     // int su7 = 97;
     // char c2 = su7 ;

     // �Ǽ� :  float < double ;
    //           �⺻�� double;

     // float : ���� �ڿ�  F �� f �� ���δ�. (���� �Ұ���)
     float su7 = 13.3f ;
     System.out.println(su7);

     double su8 = 15.3 ;
     System.out.println(su8);     

      su8 = su7 ;
      System.out.println(su8);   

    // char ��  double,   int ��  double  ����  ( ���θ��)
     char ch3 = 'a';
     int su9 = 37 ; 

     double su10 = ch3 ;
     System.out.println(su10);   
   
     su10 = su9 ;
     System.out.println(su10);   
  
       
    }
}













