package org.example.services.student;

import org.example.classrequest.DeleteLessonRequest;
import org.example.converters.AddStudentConverter;
import org.example.entities.Student;
import org.example.repository.IStudentRepository;
import org.example.repository.RepositoryException;
import org.example.repository.StudentRepository;
import org.example.request.IdRequest;
import org.example.request.student.AddStudentRequest;
import org.example.request.student.EditStudentRequest;
import org.example.request.student.GetAllStudentRequest;
import org.example.request.student.GetStudentByIdRequest;
import org.example.request.student.GetStudentByIdRequest;
import org.example.responses.student_response.DeleteStudentResponse;
import org.example.services.ServiceException;

import java.util.List;

public class StudentService implements IStudentServices{
    private IStudentRepository iStudentRepository;
    private AddStudentConverter addStudentConverter;


    @Override
    public long addStudent(AddStudentRequest addStudentRequest) throws ServiceException{
        try{

           Student student =  addStudentConverter.toEntity(addStudentRequest);
          return iStudentRepository.addStudent(student);

        }catch(RepositoryException e){
            throw new  ServiceException("Unable to delete student", e);
        }
    }

    @Override
    public void editStudent(EditStudentRequest editStudentRequest) throws ServiceException{


    }

    @Override
    public void deleteStudent(IdRequest deleteStudentRequest) throws ServiceException {
     try{
        iStudentRepository.deleteStudent(deleteStudentRequest.getId());
     } catch(RepositoryException e){
         throw new ServiceException("Unable to delete student", e);
     }
    }

    @Override
    public List<Student> getStudentsByIdGroup(GetAllStudentRequest getAllStudentRequest) {
        return null;
    }

    @Override
    public Student getStudentById(IdRequest getStudentById) {
        return null;
    }



}
