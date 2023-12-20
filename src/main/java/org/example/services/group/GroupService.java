package org.example.services.group;

import org.example.converters.group.GroupConverter;
import org.example.entities.GroupStudent;
import org.example.repository.IGroupRepository;
import org.example.repository.RepositoryException;
import org.example.request.IdRequest;
import org.example.request.group.AddGroupRequest;
import org.example.request.group.EditGroupRequest;
import org.example.services.ServiceException;

import javax.sql.rowset.serial.SerialException;

public class GroupService implements IGroupService{
    private IGroupRepository iGroupRepository;
    private GroupConverter groupConverter;


    public GroupService(IGroupRepository iGroupRepository, GroupConverter groupConverter) {
        this.iGroupRepository = iGroupRepository;
        this.groupConverter = groupConverter;
    }



    @Override
    public long addGroup(AddGroupRequest addGroupRequest) throws ServiceException{
        try{
            GroupStudent group = groupConverter.addGroupRequestToEntity(addGroupRequest);
            return iGroupRepository.addGroup(group);
        } catch(RepositoryException e){
          throw new ServiceException("Unable to add group", e);
        }

    }

    @Override
    public void editGroup(EditGroupRequest editGroupRequest) throws ServiceException {
        try{
            GroupStudent group = groupConverter.editGroupRequestToEntity(editGroupRequest);
            iGroupRepository.updateGroup(group);
        } catch (RepositoryException e) {
            throw new ServiceException("Unable to edit group", e);
        }
    }

    @Override
    public GroupStudent getGroupById(long getGroupById) throws ServiceException {
        try {
            return iGroupRepository.getGroup(getGroupById);
        } catch (RepositoryException e)
        {
            throw new ServiceException("Unable to get group", e);
        }
    }
}
