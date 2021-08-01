/*
Öğrenci Not Sistemi
Course Sınıfı Özellikleri :
Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Teacher Sınıfı Özellikleri :
Nitelikler : name,mpno,branch
Metotlar : Teacher()
Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
Sözlü notlarınıda ortalamaya etkileme yüzdesi ile dahil edin.
Örnek : Fizik dersinine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
*/




//Main
package com.company;

public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course matsozlu=new Course("Matematik", "MAT101", "MAT");
        Course fiziksozlu=new Course("Fizik", "FZK101", "FZK");
        Course kimyasozlu=new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);




        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya ,matsozlu,fiziksozlu,kimyasozlu);

        s1.addBulkExamNote(50,20,40);
        s1.addBulSozluNote(50,40,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya,matsozlu,fiziksozlu,kimyasozlu);
        s2.addBulkExamNote(100,50,40);
        s2.addBulSozluNote(50,50,60);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,matsozlu,fiziksozlu,kimyasozlu);
        s3.addBulkExamNote(50,20,40);
        s3.addBulSozluNote(50,40,60);
        s3.isPass();


    }
}
/**------------------------------------------------------------------------------------------------------------------------------------------------------------

Course.java*/


public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;

    int note;
    int sozlu;

     Course(String name,String  code,String prefix){
          this.name=name;
          this.code=code;
          this.prefix=prefix;

          this.note=0;
          this.sozlu=0;
     }
    public void addTeacher(Teacher t){
       if(this.prefix.equals(t.branch)){
           this.courseTeacher=t;
           System.out.println("işlem başarılı...");

       }
       else {
           System.out.println(t.name+"Akademisyenin bu dersi veremez. ");
       }
     }
     public void printTeacher(){
      if (courseTeacher !=null){
          System.out.println(this.name+ "dersinin akademisyeni"+ courseTeacher.name);
      }
      else {
          System.out.println(this.name+"dersine akademisyen atanmıştır");
      }
     }

}
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------
Student.java
*/

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
   Course matsozlu;
    Course fiziksozlu;
    Course kimyasozlu;
    double avarage;
    boolean isPass;


    Student( String name,int classes,String stuNo,Course mat,Course fizik,Course kimya,Course matsozlu, Course fiziksozlu, Course kimyasozlu){
        this.name=name;
        this.classes=classes;
        this.stuNo=stuNo;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.matsozlu=matsozlu;
        this.fiziksozlu=fiziksozlu;
        this.kimyasozlu=kimyasozlu;
        calcAvarage();
        this.isPass=false;
    }
    public void addBulkExamNote(int mat,int fizik,int kimya){
       if(mat>=0 && mat<=100){
           this.mat.note=mat;
       }
       if (fizik>=0 && fizik<=100){
           this.fizik.note=fizik;
       }
       if (kimya>=0 && kimya<=100){
           this.kimya.note=kimya;
       }
    }
    public void addBulSozluNote(int matsozlu,int fiziksozlu,int kimyasozlu){
        if (matsozlu>=0 && matsozlu<=100){
            this.matsozlu.sozlu=matsozlu;
        }
        if (fiziksozlu>=0 && fiziksozlu<=100){
            this.fiziksozlu.sozlu=fiziksozlu;
        }
        if (kimyasozlu>=0 && kimyasozlu<=100){
            this.kimyasozlu.sozlu=kimyasozlu;
        }
    }
    public void isPass(){
     if (this.mat.note==0 || this.fizik.note==0 || this.kimya.note==0){
         System.out.println("notlar tam olarak girilmemiş");

     }
     if (this.matsozlu.sozlu==0 || this.fiziksozlu.sozlu==0 || this.kimyasozlu.sozlu==0){
         System.out.println("notlar tam olarak girilmemiş");
     }

     else{
         this.isPass=isCheckPass();
         printNote();
         System.out.println("ortalama:" +this.avarage);
         if (this.isPass){
             System.out.println("sınıfı geçti");
         }
         else{
             System.out.println("sınıfta kaldı");
         }
     }
    }
    public void calcAvarage(){
        this.mat.note= (int) ((this.mat.note* 0.80)+(this.matsozlu.sozlu*0.20));
        this.fizik.note=(int)((this.fizik.note*0.80)+(this.fiziksozlu.sozlu*0.20));
        this.kimya.note=(int) ((this.kimya.note*0.80)+(this.kimyasozlu.sozlu*0.20));
        this.avarage=(this.mat.note+this.fizik.note+this.kimya.note)/3;

    }
    public boolean isCheckPass(){
   calcAvarage();
    return this.avarage>55;


    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu Sözlü Hesaplı: " + this.mat.note);
        System.out.println("Fizik Notu  Sözlü Hesaplı : " + this.fizik.note);
        System.out.println("Kimya Notu Sözlü Hesaplı : " + this.kimya.note);
        System.out.println("Matematik  Sözlü Notu : " + this.matsozlu.sozlu);
        System.out.println("Fizik  Sözlü  Notu : " + this.fiziksozlu.sozlu);
        System.out.println("Kimya  Sözlü Notu : " + this.kimyasozlu.sozlu);
    }



}
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Teacher.java*/

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno,String branch){
          this.name=name;
          this.mpno=mpno;
          this.branch=branch;
    }
}





