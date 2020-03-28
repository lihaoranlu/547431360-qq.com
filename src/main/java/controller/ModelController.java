package controller;

import common.CommonResult;
import io.swagger.annotations.ApiOperation;
import model.PmsBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.BrandService;

@Controller
@RequestMapping("/brand")
public class ModelController {
    @Autowired
    private BrandService brandService;

    @ApiOperation("获取品牌详情")
    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsBrand> getDetail(@PathVariable("id") Long id){
        return CommonResult.success(brandService.detail(id));
    }
}
