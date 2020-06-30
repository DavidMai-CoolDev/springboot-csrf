package com.example.springboot.csrf.demo.csrf.repository;

import com.example.springboot.csrf.demo.csrf.Entity.response.LoginResponse;
import com.example.springboot.csrf.demo.csrf.util.DataUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ConfigSessionRepository {
    @PersistenceContext
    private EntityManager em;
    private String myQuery = "SELECT u.principal_name from spring_session u WHERE u.session_id ='";

    public String getUsernameBaseonSessionId(String sessionID){
        String mySelectQuery = myQuery + sessionID + "'";
        Query querySelect = em.createNativeQuery(String.valueOf(mySelectQuery));
        Object tempList =querySelect.getResultList();
//        DataUtil.isNullObject(tempList);
        if (((ArrayList) tempList).size() ==0 || ((ArrayList) tempList).toArray()[0]==null){
            return "";
        }
//        DataUtil.safeToString(tempList);
//        List<LoginResponse> list = new ArrayList<>();
//        for (Object[] objects : tempList) {
//            LoginResponse  loginResponse= new LoginResponse();
//            loginResponse.setUsername(objects);
//        }

//        System.out.println("okok!!!!");
        return ((ArrayList) tempList).toArray()[0].toString();
    }

//    public static boolean isNullObject(Object obj1) {
//        if (obj1 == null) {
//            return true;
//        }
//        if (obj1 instanceof String) {
//            return isNullOrEmpty(obj1.toString());
//        }
//        return false;
//    }

}
