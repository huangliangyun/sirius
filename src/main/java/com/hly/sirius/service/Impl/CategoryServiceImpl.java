package com.hly.sirius.service.Impl;

import com.hly.sirius.dao.CategoryDao;
import com.hly.sirius.domain.Category;
import com.hly.sirius.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/11/18
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> getCategories () {
        return categoryDao.getCategories();
    }

    @Override
    public int addCategory(Category Category) {
        return categoryDao.addCategory(Category);
    }

    @Override
    public Integer  getCategory(String Category) {
        return categoryDao.getCategory(Category);
    }

    @Override
    public int updateCategoryNum(String categoryNum) {
        return categoryDao.updateCategoryNum(categoryNum);
    }

    @Override
    public List<Category> getCategoriesByArticleId(Integer articleId) {
        return categoryDao.getCategoriesByArticleId(articleId);
    }

}
