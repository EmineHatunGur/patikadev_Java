package com.company;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
   double bonusUcret;
   double salaryear;


    public Employee(String name,double salary,int workHours,int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax(){
       if (this.salary<1000){
         return 1;
       }
       else if (this.salary>1000){
         return vergi=this.salary*0.03;

       }
       return 0;
    }
     public double bonus(){
         if (this.workHours>=40){
            return this.workHours=(this.workHours-40)*30;
         }
         else {
          return 0;
         }


     }
     public double raiseSalary(){
      int nowyear=2021;
        this.hireYear=nowyear-this.hireYear;
        if (this.hireYear<=9){
         return salaryear=this.salary*0.05;

        }
        else if (this.hireYear>10 && this.hireYear<=19){
         return   salaryear=this.salary*0.1;

        }
        else if (this.hireYear>20){
         return  salaryear=this.salary*0.15;

        }
        else {
          return 0;
        }

        }

      public double toplamMaas(){
         return this.salary=this.salary+vergi+bonusUcret+salaryear;

      }

     public void toMyString(){
         System.out.println("Adi:"+ this.name);
         System.out.println("Maaşı: " + this.salary);
         System.out.println("Çalışma saati:"+ this.workHours);
         System.out.println("Başlangıç Yılı:" +this.hireYear);
         System.out.println("Uygulanan vergi: "+ tax());
         System.out.println("Bonus olarak alınacak ücret: "+ bonus());
         System.out.println("Maaş artışı yıllara göre: "+ raiseSalary());
         System.out.println("Toplam maaş: "+ toplamMaas());


     }
}
