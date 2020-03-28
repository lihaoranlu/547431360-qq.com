package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import mapper.PmsBrandMapper;
import model.PmsBrand;
import model.PmsBrandExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BrandService;

import java.util.List;

@Service
public class BrandServiceImp implements BrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public int create(PmsBrand brand) {
        return 0;
    }

    @Override
    public int update(Long id, PmsBrand pmsBrand) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public List<PmsBrand> list(int pageNum, int pageSize, String name) {
        PageHelper.startPage(pageNum,pageSize);
        PmsBrandExample example= new PmsBrandExample();
        if(StringUtil.isEmpty(name)){
            example.createCriteria().andNameLike("%"+name+"%");
        }
        return pmsBrandMapper.selectByExample(example);
    }

    @Override
    public PmsBrand detail(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
