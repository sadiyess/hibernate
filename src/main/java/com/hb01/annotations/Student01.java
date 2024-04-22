package com.hb01.annotations;

import javax.persistence.*;

@Entity  //!!! @Entity koyduğumuz sınıf, veritabanında bir tabloya karşılık gelecek
@Table(name = "t_student01") //tablonun ismine kendim karar vermis olurum
// !!! Eğer oluşacak tablo ismini değiştirmek istenirse name attribute ile
// bir tablo ismi verilir.
//@Table ile isim degistirilmese idi , DB de kucuk harfle student01 isminde tablo olusacaktı

public class Student01 { //student01

    @Id //primary key olusmasini sagliyor
   // @Column(name = "std_id")
    private int id; //Student01 std1 = new Student01(); std1.id

    //Column annotationı zorunlu degil ancak customize edebilmek icin gerekli
    @Column(name = "student_name", length = 100, nullable = false, unique = false)
    //Javaca konusurken name, SQL ce konusurken student_name kullanmam lazim
    private String name; //255 karakter

//@Transient //bu veri eklenmemis oluyor
//!!! @Transient --> veritabanı tablosunda "grade" adında bir kolon oluşturulmaz. kod içinde
// kullanılmak için bir değişken oluştururuz ama bu sınıf DB ye kaydedileceği
// zaman ilgili tabloya kolon olarak eklenmez
    private int grade; //70

//    @Lob //large object ile buyuk datalar tutuluyor
//    private byte[] image;


    //NOT: GETTER SETTERRRR

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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


    //NOT: toString***************************


    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
