package org.example;

import org.example.hibernate.HibernateUtils;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
            Session session = HibernateUtils.getInstance().getSessionFactory().openSession();

//        // TODO create worker
//        Transaction transaction = session.beginTransaction();
//            Worker newWorker = new Worker();
//            newWorker.setName("Taras");
//            newWorker.setBirthday(LocalDate.of(2001, 12, 21));
//            newWorker.setSalary(5000);
//            newWorker.setLevels(Level.MIDDLE);
//            session.persist(newWorker);
//        transaction.commit();

//         //TODO get worker by id or list of workers
//        Worker gettedWorker = session.get(Worker.class, 1L);
//        System.out.println("worker ==> " + gettedWorker);
//
//        List<Worker> workers = session.createQuery("from Worker", Worker.class).list();
//        workers.forEach(worker -> System.out.println("worker list ==> " + worker));

//        // TODO update worker
//        Transaction transaction = session.beginTransaction();
//            Worker existing = session.get(Worker.class, 1L);
//            existing.setName("Modified Taras");
//            session.persist(existing);
//        transaction.commit();
      session.close();
        }
    }
