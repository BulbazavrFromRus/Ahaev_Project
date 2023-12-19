package org.example.services.student;

import org.example.converters.student.AddStudentConverter;
import org.example.converters.student.EditStudentConverter;
import org.example.entities.Student;
import org.example.repository.IStudentRepository;
import org.example.repository.RepositoryException;
import org.example.request.IdRequest;
import org.example.request.student.AddStudentRequest;
import org.example.request.student.EditStudentRequest;
import org.example.services.ServiceException;

import java.util.List;

public class StudentService implements IStudentServices{
    private IStudentRepository iStudentRepository;
    private AddStudentConverter addStudentConverter;
    private EditStudentConverter editStudentConverter;

    public StudentService(IStudentRepository iStudentRepository, AddStudentConverter addStudentConverter, EditStudentConverter editStudentConverter) {
        this.iStudentRepository = iStudentRepository;
        this.addStudentConverter = addStudentConverter;
        this.editStudentConverter = editStudentConverter;
    }

    @Override
    public long addStudent(AddStudentRequest addStudentRequest) throws ServiceException{
        try{

           Student student =  addStudentConverter.toEntity(addStudentRequest);
          return iStudentRepository.addStudent(student);

        }catch(RepositoryException e){
            throw new  ServiceException("Unable to add student", e);
        }
    }

    @Override
    public void editStudent(EditStudentRequest editStudentRequest) throws ServiceException {
        try{
            Student student = editStudentConverter.toEntity(editStudentRequest);
            iStudentRepository.updateStudent(student);
        }catch(RepositoryException e){
            throw  new ServiceException("Unable to edit student", e);
        }
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
    public List<Student> getStudentsByIdGroup(IdRequest getAllStudentRequest) throws RepositoryException {
        try{
            return iStudentRepository.getStudentsByGroupId(getAllStudentRequest.getId());

        } catch(RepositoryException e){
            throw new ServiceException("Unable to get students by id group", e);
        }
    }


    @Override
    public Student getStudentById(IdRequest getStudentById)  throws ServiceException {
        try{
           return iStudentRepository.getStudent(getStudentById.getId());

        } catch(RepositoryException e){
            throw new ServiceException("Unable to get student by id", e);
        }

    }

}
