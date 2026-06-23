package co.istad.chhaya.ecommerce.mapper;

import co.istad.chhaya.ecommerce.domain.Category;
import co.istad.chhaya.ecommerce.dto.CategoryResponse;
import co.istad.chhaya.ecommerce.dto.CreateCategoryRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    // Return type = Target
    // Parameter = Source
    Category mapCreateCategoryRequestToCategory(CreateCategoryRequest createCategoryRequest);

    CategoryResponse mapCategoryToCategoryResponse(Category category);

}
