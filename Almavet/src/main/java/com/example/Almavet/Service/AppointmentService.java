package com.example.Almavet.Service;

import com.example.Almavet.Entity.Appointmet;
import com.example.Almavet.Repository.dto.AppointmentDto;
import com.example.Almavet.Util.StateAppointment;

import java.util.List;

public interface AppointmentService {

    public List<Appointmet> listAppointmet();

    public Appointmet createAppointmet(Appointmet appointmet);

    public Appointmet modifyAppointmet(Appointmet appointmet);

    public List<Appointmet> findAllByState();

    public void deleteAppointmet(int id);
}
