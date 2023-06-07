package com.example.Almavet.Service;


import com.example.Almavet.Entity.Details;
import java.util.List;

public interface DetailService {

    public List<Details> listDetails();

    public Details createDetails(Details appointmet);

    public Details modifyDetails(Details appointmet);

    List<String> listDetailsHC (String dni, String name);

    public void deleteDetails(int id);
}
