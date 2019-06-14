package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;

import org.springframework.stereotype.Repository;

/**
 * CategoryMapper
 */
@Repository
public interface CategoryMapper {
        public void insertCategory(CategoryDTO category);
        public List<CategoryDTO> selectCategorles();
        public List<CategoryDTO> selectCategorlesByword(CategoryDTO category);
        public CategoryDTO selectCategoryBycategoryId(CategoryDTO category);
        public void updateCategory(CategoryDTO category);
        public void deleteCategory(CategoryDTO category);
    

    
}