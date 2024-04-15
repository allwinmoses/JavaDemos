package org.com.doctor.client;

import org.com.doctor.exceptions.DoctorNotFoundException;
import org.com.doctor.exceptions.IdNotFoundException;
import org.com.doctor.model.Doctor;
import org.com.doctor.model.Specialization;
import org.com.doctor.repository.DoctorRepositoryImpl;
import org.com.doctor.repository.IDoctorRepository;
import org.com.doctor.service.DoctorServiceImpl;
import org.com.doctor.service.IDoctorService;

import java.util.List;

public class User {
    public static void main(String[] args) throws DoctorNotFoundException, IdNotFoundException {
        IDoctorService doctorService = new DoctorServiceImpl();

        Specialization specialization = Specialization.ORTHO;
        String speciality = specialization.getSpeciality();

        String special = Specialization.DERMA.getSpeciality();
        Doctor doctor = new Doctor("Jacob", speciality, 1000, 8, 5);

//        Doctor doctor1 = new Doctor("Moses", speciality, 2000, 7, 9);
//       Doctor doctor2 = new Doctor("Allwin", speciality, 1000, 9, 10);

//        Doctor doctor3 = new Doctor("Farhan", speciality, 1000, 8, 10);
//        Doctor doctor4 = new Doctor("Pro", speciality, 1000, 10, 10);

//        doctorService.addDoctor(doctor);
  //      doctorService.updateDoctor(3,1098);
//        doctorService.deleteDoctor(18);

//        List<Doctor> doctors = doctorService.getAll();
//        for(Doctor doctor:doctors){
//            System.out.println(doctor);
//        }

//        List<Doctor> doctors = doctorService.getBySpeciality(speciality);
//        for(Doctor doctor1: doctors){
//            System.out.println(doctor1);
//        }


//        List<Doctor> doctors1 = doctorService.getBySpecialityAndExp(speciality,5);
//        for(Doctor doctor2 : doctors1){
//            System.out.println(doctor2);
//        }

//        List<Doctor> doctors3 = doctorService.getBySpecialityAndLessFees(speciality, 1000);
//        for(Doctor doctor2 : doctors3){
//            System.out.println(doctor2);
//        }

//        List<Doctor> doctors = doctorService.getBySpecialityAndRatings(speciality,8);
//        for(Doctor doctor2 : doctors){
//            System.out.println(doctor2);
//        }

//        List<Doctor> doctors = doctorService.getBySpecialityAndNameContains(speciality,"Peter");
//        for(Doctor doctor2 : doctors){
//           System.out.println(doctor2);
//        }


         try{
             Doctor foundDoctor = doctorService.getById(2);
             System.out.println(foundDoctor);
         }catch (IdNotFoundException e){
             System.out.println("Doctor not found");
         }


    }
}
