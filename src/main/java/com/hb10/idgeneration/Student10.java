package com.hb10.idgeneration;

import javax.persistence.*;

@Entity

public class Student10 {

    /*
   GenerationType.Sequence ---> Oracle DB - PostgreSQL kullanir, Sequence ( kontrolü
            developera bırakır, Id üretilirken başlangıç değeri veya kaç tane id cachelenecek
            gibi bilgileri developer setliyebilir)

   GenerationType.IDENTITY ---> MySQL - Microsoft SQL  kullanir, IDENTITY ( kontrol DB de ,
            kendi yapısına göre ıd oluşturur, içlerindeki en basitidir)

   GenerationType.AUTO ---> Hibernate otomatik olarak kullanilan DB ye gore stratejiyi belirler

   GenerationType.TABLE ---> En yavaşı , oyüzden çok kullanılmıyor, çünkü id üretmek için
            ekstra tablo oluşturuyor
 */

    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence",
            sequenceName = "student_seq",//Db de olusacak sequence ismi
            initialValue = 1000,//idlerim 1000 ile baslasin
            allocationSize = 10) //cachele mekanizmasında 10 adte id hazırda bekletilsin, default degeri 50dir
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_name", nullable = false)
    private String name;

    private int grade;

    // Getter- Setter **********************8

    public int getId() {
        return id;
    }

  /*  public void setId(int id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //!!! toString() *******************************8

    @Override
    public String toString() {
        return "Student10{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

