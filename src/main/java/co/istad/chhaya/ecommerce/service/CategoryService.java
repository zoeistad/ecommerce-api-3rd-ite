package co.istad.chhaya.ecommerce.service;

import co.istad.chhaya.ecommerce.dto.CategoryResponse;
import co.istad.chhaya.ecommerce.dto.CreateCategoryRequest;

public interface CategoryService {

    CategoryResponse createNew(CreateCategoryRequest createCategoryRequest);

}
