import java.util.*;

class Student
    {
    String usn;
    String name;
    int sem;
    
    void input()
        {
        Scanner se=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=se.next();
        System.out.println("Enter your usn");
        usn=se.next();
        System.out.println("Enter your sem");
        sem=se.nextInt();
        }
        
     void display()
         {
         System.out.println("Name:"+name);
         System.out.println("usn:"+usn);
         System.out.println("sem:"+sem);
         }
      }
         
class Test extends Student
    {
    int c_marks[]=new int[6];
    int cred_a[]=new int[6];
    
    void input()
        {
        Scanner se=new Scanner(System.in);
        super.input();
        for(int i=0;i<6;i++)
            {
            System.out.println("Enter marks and credits of "+(i+1)+"subject:");
            c_marks[i]=se.nextInt();
            cred_a[i]=se.nextInt();
            }
         }
         
      void display()
          {
          super.display();
          for(int i=0;i<6;i++)
            {
            System.out.println("Marks and credits of "+(i+1)+"subject:"+c_marks[i]+" "+cred_a[i]);
            }
           }
       }
           
class Exam extends Test
    {
     
         int s_marks[]=new int[6];
         
     void input()
         {
        Scanner se=new Scanner(System.in);
        super.input();
        for(int i=0;i<6;i++)
            {
            System.out.println("Enter see marks of "+(i+1)+"subject:");
            s_marks[i]=se.nextInt();
            }
         }         
       void display()
          {
          super.display();
          for(int i=0;i<6;i++)
            {
            System.out.println("SEE Marks of "+(i+1)+"subject:"+s_marks[i]);
            }
           }  
        }   
           
class Result extends Exam
    {
     
     float t_grade=0;
     float sgpa;
     int n;
         float grades[]=new float[6];
         
     int grade(int j)
         {
             grades[j]=(c_marks[j]/2)+(s_marks[j]/2);
             if (grades[j]>=90 && grades[j]<=100)
                 return 10;
             else if(grades[j]>=80 && grades[j]<90)
                 return 9;
             else if(grades[j]>=70 && grades[j]<80)
                 return 8;
             else if(grades[j]>=60 && grades[j]<70)
                 return 7;
             else if(grades[j]>=50 && grades[j]<60)
                 return 6;
             else if(grades[j]>=40 && grades[j]<50)
                 return 5; 
             else
                 {
                    System.out.println("You have failed in this subject");
                    return 0;
                 }
              
            }
            
           
        void input()
         {
         super.input();
         }         
         
         void display()
             {
             super.display();
             for(int i=0;i<6;i++)
              {
              n=grade(i);
              t_grade=t_grade+n;
              }
             sgpa=t_grade/6;
             System.out.println("your sgpa is"+sgpa);
             }
        }
        
        
class Studen_Demo
    {
     public static void main(String args[])
        {
        Scanner se=new Scanner(System.in);
        System.out.println("Enter number of students");
        int size=se.nextInt();
        Result my_student[]=new Result[size];
        for(int i=0;i<size;i++)
            {
            my_student[i]=new Result();
            }
        for(int i=0;i<size;i++)
            {
            my_student[i].input();
            my_student[i].display();
            }
         }
     }
              
        
              
         
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
       
