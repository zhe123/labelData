package mapper;

import java.util.List;

import modelAndDomain.UserEntity;

public interface UserMapper {
   List<UserEntity> getAll();
   UserEntity getOne();
   void insert(UserEntity user);
   void update(UserEntity user);
   void delete(Long id);
}
