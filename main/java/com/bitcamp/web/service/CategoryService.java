package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;

import org.springframework.stereotype.Component;

/**
 * CategoryService
 */
@Component
public interface CategoryService {    // interface 쓰는 이유 : 기능만 있는 경우여서, 속성을 가질 수 없다
        public void addCategory(CategoryDTO category);
        public List<CategoryDTO> findCategorles();
        public List<CategoryDTO> findCategorlesByword(CategoryDTO category);
        public CategoryDTO findCategoryBycategoryId(CategoryDTO category);
        public void updateCategory(CategoryDTO category);
        public void deleteCategory(CategoryDTO category);
    
}