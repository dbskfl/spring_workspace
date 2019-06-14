package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;
import com.bitcamp.web.service.CategoryService;

import org.springframework.stereotype.Service;

/**
 * CategoryServicelmpl
 */
@Service
public class CategoryServiceimpl implements CategoryService {

    @Override
    public void addCategory(CategoryDTO category) {

    }

    @Override
    public List<CategoryDTO> findCategorles() {
        return null;
    }

    @Override
    public List<CategoryDTO> findCategorlesByword(CategoryDTO category) {
        return null;
    }

    @Override
    public CategoryDTO findCategoryBycategoryId(CategoryDTO category) {
        return null;
    }

    @Override
    public void updateCategory(CategoryDTO category) {

    }

    @Override
    public void deleteCategory(CategoryDTO category) {

    }

    
}