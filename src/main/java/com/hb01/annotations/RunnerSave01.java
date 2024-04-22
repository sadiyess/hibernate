package com.hb01.annotations;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {

    public static void main(String[] args) {

        Student01 student1 = new Student01();
        student1.setId(1001);
        student1.setName("Fatma Hanim");
        student1.setGrade(70);

        Student01 student2 = new Student01();
        student2.setId(1002);
        student2.setName("Ahmet Bey");
        student2.setGrade(70);

        Student01 student3 = new Student01();
        student3.setId(1003);
        student3.setName("Dogu Bey");
        student3.setGrade(70);

        //!!! asagidaki satırda config dosyamı ve entity clasımı belirtiyorum.
        Configuration con = new Configuration().
                configure("hipernate.cfg.xml").
                addAnnotatedClass(Student01.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();

        session.save(student1);
        // INSERT INTO t_student01 (id,student_name,grade) VALUES(?,?,?);
        session.save(student2);
        session.save(student3);

        tx.commit(); //!!! commit önemli,yazılmazsa DB ye kaydedilme garantisi yok..
        session.close();
        sf.close();
    }
}//hocam file namei alıyorduk mirac hoca onu almıştı
//evet dogrru fakat onu bulamiyor suan
// kodlarda bir hata goremiyorum ist
//hocam zaten mirac hocanın kodlarını kopyaladım
//duzeldi galiba
//soyle olusturulan id yi olusturuyor sonra tekrar calsititinca zaten var diye hata veriyor
//hocam 1sn creted mi yazıyorduk??
//anlamadim
// cfg.xml tarafına şimdi gideceğim
//create olusturuluyor

//baska bir sorunuz yoksa ayriliyorum
//yok hocam cok teşekkür ederim
