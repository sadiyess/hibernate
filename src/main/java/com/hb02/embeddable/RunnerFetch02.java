package com.hb02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.sound.midi.Track;

public class RunnerFetch02 {
    public static void main(String[] args) {

        Configuration con = new Configuration().
                configure("hipernate.cfg.xml").
                addAnnotatedClass(Student02.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Student02 student = session.get(Student02.class, 1001);
        System.out.println(student);
        System.out.println(student.getAddress());


        tx.commit();
        session.close();
        sf.close();

        // get - SQL - HQL Hangisini tercih etmem gerekir?
        /*
        hız: en az islem yaoilandir o enhizlidir. SQLdir
        hızına ragmen en son tercih SQLdir. 1) hata oranı yuksektir 2)
        1)get
        2)HQL
        3)SQL
         *   Native SQL hizli olsada eksi yonleri :
                1) bazi DB'lerde sql syntax'in farkliliklar olabiliyor, Native SQL burada sorun olabilir
                2) String yapilarin hataya acik olmasi

         */


    }
}
