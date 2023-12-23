package org.example.repository;

import org.example.database.DataBase;
import org.example.entities.GroupStudent;
import org.example.services.ServiceException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RepositoryGroup implements IGroupRepository {

    private DataBase dataBase;


    public RepositoryGroup(DataBase dataBase){
        this.dataBase =dataBase;
    }


    //by adding group we have to increase index of current group(added)
    @Override
    public long addGroup(GroupStudent group) throws ServiceException {
        Map<Long, GroupStudent> mapGroup = dataBase.getMapGroup();

        long newMaxId = dataBase.getGroupMaxId()+1;

        mapGroup.put(newMaxId, group);

        dataBase.setGroupMaxId(newMaxId);

        return newMaxId;

    }

    @Override
    public GroupStudent getGroup(long id) throws RepositoryException {
        return dataBase.getMapGroup().get(id);
    }

    @Override
    public void updateGroup(GroupStudent group) throws RepositoryException {
        if(dataBase.getMapGroup().containsKey(group.getId())){
            dataBase.getMapGroup().put(group.getId(), group);
        }
       else
        {
            System.out.println("There isn't group with such id");
        }
    }

    @Override
    public void deleteGroup(long id) throws RepositoryException {
        dataBase.getMapGroup().remove(id);
    }

    @Override
    public List<GroupStudent> getAllGroup() throws RepositoryException {
        List<GroupStudent> allGroups = new ArrayList<>();

        Map<Long, GroupStudent> mapGroup = dataBase.getMapGroup();

        for (Map.Entry<Long, GroupStudent> entry : mapGroup.entrySet()) {
            GroupStudent groupStudent = entry.getValue();

            allGroups.add(groupStudent);
        }

        return allGroups;
    }
}
