package mapper;

import java.util.List;

import modelAndDomain.PackageData;

public interface PackageDataMapper {
        List<PackageData> getAll();
        PackageData getOne(Long id);
        void insert(PackageData pkg);
        void delete(Long id);
        void update(PackageData pkg);
}
