package org.example.services.group;

import org.example.converters.group.GroupConverter;
import org.example.entities.GroupStudent;
import org.example.repository.IGroupRepository;
import org.example.repository.RepositoryException;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;
import org.example.services.ServiceException;

import javax.sql.rowset.serial.SerialException;

public class GroupService implements IGroupService{
    private IGroupRepository iGroupRepository;
    private GroupConverter groupConverter;



    @Override
    public long addGroup(AddGroupRequest addGroupRequest) throws ServiceException{
        try{
            GroupStudent group = groupConverter.toEntity(addGroupRequest);
            return iGroupRepository.addGroup(group);
        } catch(RepositoryException e){
            System.out.println("Unable to add group", e);
        }
    }

    @Override
    public void editGroup(EditGroupRequest editGroupRequest) {

    }

    @Override
    public GroupStudent getGroupById(long getGroupById) {
        return null;
    }
}
