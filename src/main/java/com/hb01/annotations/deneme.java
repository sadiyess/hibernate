package com.hb01.annotations;

/*
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deneme {
    import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

    public class RunnerSave0111 {
        public static void main(String[] args) {

            Student01 student1 = new Student01();
            student1.setId(1001);
            student1.setName("Fatma Hanim");
            student1.setGrade(70);



            //asagidaki satirda config dosyami ve entity classimi belirtiyorum.
            Configuration con = new Configuration().
                    configure("hipernate.cfg.xml").
                    addAnnotatedClass(Student01.class);//configure methodyla doyanına adını bekliyor

            //bir köprü kurmam gerekiyor
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            //ilgili kodlar
            session.save(student1);
            //INSERT INTO t_student01 (id,student_name,grade) VALUES(?,?,?);

            tx.commit();//önemliiiiiii bu yazılmazsa database kaydedilme garantisi yoktur.....
            session.close();
            sf.close();
        }
    }

}
*/
