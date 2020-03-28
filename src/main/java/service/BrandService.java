package service;

import model.PmsBrand;

import java.util.List;

public interface BrandService {

    int create(PmsBrand brand);

    int update(Long id, PmsBrand pmsBrand);

    int delete(Long id);

    List<PmsBrand> list (int pageNum, int pageSize, String name);

    PmsBrand detail (Long id);
}
