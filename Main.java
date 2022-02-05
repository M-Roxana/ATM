import java.util.Random;

class Main {

public static void main(String[] args) {
  
 Random random = new Random();

 int nr_publicatii = random.nextInt(10)+1;
 System.out.println("Numarul publicatiilor este "+nr_publicatii);
 
 int returnari;
 int x=0, y=10;

 if (nr_publicatii%2 == 0 && nr_publicatii%3 == 0) 
         {returnari = nr_publicatii/2+1;
            for(int i=0; i<returnari;i++)
             {
               new Patrat(x, y, 40, "blue");
               x=x+70;
             }
         }  
  else
      if ( nr_publicatii%2 == 0)
       {
         returnari= nr_publicatii/2;
         for(int i=0; i<returnari; i++)
         {
         new Patrat(x, y, 40, "yellow");
         x=x+70;
         }
       }
      else 
        if (nr_publicatii%3 == 0)  
         {
           returnari= 2*nr_publicatii/3;
         for(int i=0; i<returnari;i++)
         {
         new Patrat(x, y, 40, "red");
         x=x+70;
         }
         }
        else 
         { returnari = nr_publicatii;
          for(int i=0; i<returnari; i++)
         {
         new Patrat(x, y, 40, "green");
         x=x+70;
         }
         }
System.out.println("Utilizatorul este rugat sa restituie "+returnari+" publicatii.");
  }
}