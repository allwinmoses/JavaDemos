package org.com.doctor.repository;

import org.com.doctor.model.Doctor;
import org.com.doctor.util.DoctorDb;
import org.com.doctor.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);

                ){
            statement.setString(1,doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3,doctor.getExperience());
            statement.setInt(4,doctor.getRatings());
            statement.setDouble(5,doctor.getFees());

            boolean result = statement.execute();
            System.out.println("One row Inserted "+!result);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);

        ){
              statement.setDouble(1,fees);
              statement.setInt(2,doctorId);

            boolean result = statement.execute();
            System.out.println("updated "+!result);

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    @Override
    public void deleteDoctor(int doctorID) {

        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);
                ){
            statement.setInt(1,doctorID);

            boolean result = statement.execute();
            System.out.println("Deleted "+!result);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public Doctor findById(int doctorId) {
            Doctor doctor=null;
        try (
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYID);) {
                statement.setInt(1, doctorId);

            try (ResultSet resultSet = statement.executeQuery();) {
                if (resultSet.next()) {

                    String doctorName = resultSet.getString("doctor_name");
                    String doctorSpec = resultSet.getString("speciality");


                    int doctorEx = resultSet.getInt("experience");
                    int doctorRating = resultSet.getInt("ratings");
                    double doctorFees = resultSet.getDouble("fees");


                     doctor = new Doctor(doctorId, doctorName, doctorSpec, doctorFees, doctorRating, doctorEx);

                }

            }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return doctor;
        }
    @Override
    public List<Doctor> findAll() {
       List<Doctor> doctorList = new ArrayList<>();
       try(
               Connection connection = DoctorDb.openConnection();
               PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
               ResultSet resultSet = statement.executeQuery();
               ){
           while (resultSet.next()){

               String doctorName = resultSet.getString("doctor_name");
               String doctorSpec = resultSet.getString("speciality");


               int doctorEx = resultSet.getInt("experience");
               int doctorRating = resultSet.getInt("ratings");
               double doctorFees = resultSet.getDouble("fees");
               int doctorId = resultSet.getInt("doctor_id");


               Doctor doctor = new Doctor(doctorId, doctorName, doctorSpec,doctorFees, doctorRating,doctorEx);

               doctorList.add(doctor);
           }


       } catch (Exception e){
           e.printStackTrace();
       }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {

        List<Doctor> doctorList = new ArrayList<>();
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY);
                ){
            statement.setString(1,speciality);
            try(ResultSet resultSet = statement.executeQuery();){
                while(resultSet.next()){
                    String doctorName = resultSet.getString(("doctor_name"));
                    int experience = resultSet.getInt("experience");
                    int rating = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees =resultSet.getInt("fees");
                    Doctor doctor = new Doctor();

                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setRatings(rating);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
        List<Doctor> doctorList = new ArrayList<>();
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDEXP);
        ){
            statement.setString(1,speciality);
            statement.setInt(2,experience);
            try(ResultSet resultSet = statement.executeQuery();){
                while(resultSet.next()){
                    String doctorName = resultSet.getString(("doctor_name"));
                    int experience1 = resultSet.getInt("experience");
                    int rating = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees =resultSet.getInt("fees");
                    Doctor doctor = new Doctor();

                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience1);
                    doctor.setRatings(rating);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }


    @Override
    public List<Doctor> findBySpecialityAndLessFees(String speciality, int fees) {
        List<Doctor> doctorList = new ArrayList<>();
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDFEES);
        ){
            statement.setString(1,speciality);
            statement.setInt(2,fees);
            try(ResultSet resultSet = statement.executeQuery();){
                while(resultSet.next()){
                    String doctorName = resultSet.getString(("doctor_name"));
                    int experience1 = resultSet.getInt("experience");
                    int rating = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees1 =resultSet.getInt("fees");
                    Doctor doctor = new Doctor();

                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience1);
                    doctor.setRatings(rating);
                    doctor.setFees(fees1);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
        List<Doctor> doctorList = new ArrayList<>();
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDRATINGS);
        ){
            statement.setString(1,speciality);
            statement.setInt(2,ratings);
            try(ResultSet resultSet = statement.executeQuery();){
                while(resultSet.next()){
                    String doctorName = resultSet.getString(("doctor_name"));
                    int experience1 = resultSet.getInt("experience");
                    int rating = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees1 =resultSet.getInt("fees");
                    Doctor doctor = new Doctor();

                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience1);
                    doctor.setRatings(rating);
                    doctor.setFees(fees1);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;
    }


    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctorList = new ArrayList<>();
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDNAME);
        ){
            statement.setString(1,speciality);
            statement.setString(2,"%"+ doctorName + "%");
            try(ResultSet resultSet = statement.executeQuery();){
                while(resultSet.next()){
                    Doctor doctor= new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));


                    doctorList.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctorList;

    }
}
