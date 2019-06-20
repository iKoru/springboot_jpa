package kr.or.kftc.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import kr.or.kftc.sample.hibernate.Address;
import kr.or.kftc.sample.hibernate.Member;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HibernateMain {
    // public static void main(String[] args) {
    // EntityManagerFactory factory =
    // Persistence.createEntityManagerFactory("member-unit");
    // EntityManager manager = factory.createEntityManager();

    // EntityTransaction transaction = manager.getTransaction();

    // try {
    // transaction.begin();

    // Member member = new Member();
    // member.setName("Kim2");
    // member.setAddress(new Address("123123", "Seoul", "aa12"));
    // manager.persist(member);
    // log.info(member);
    // manager.remove(manager.find(Member.class, member.getId()));
    // transaction.commit();
    // } catch (Exception e) {
    // log.error(e);
    // } finally {
    // manager.close();
    // factory.close();
    // }
    // }
}