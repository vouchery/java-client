/*
 * Vouchery API Reference
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * Contact: hello@vouchery.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.vouchery.sdk;

import io.vouchery.sdk.ApiException;
import org.openapitools.client.model.Category;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
@Ignore
public class CategoriesApiTest {

    private final CategoriesApi api = new CategoriesApi();

    
    /**
     * Create a category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCategoryTest() throws ApiException {
        Category category = null;
        Category response = api.createCategory(category);

        // TODO: test validations
    }
    
    /**
     * Delete a category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCategoryTest() throws ApiException {
        Integer id = null;
        api.deleteCategory(id);

        // TODO: test validations
    }
    
    /**
     * Get all categories for a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoriesTest() throws ApiException {
        List<Category> response = api.getCategories();

        // TODO: test validations
    }
    
    /**
     * Get a category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoryTest() throws ApiException {
        Integer id = null;
        Category response = api.getCategory(id);

        // TODO: test validations
    }
    
    /**
     * Update a category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCategoryTest() throws ApiException {
        Integer id = null;
        Category category = null;
        Category response = api.updateCategory(id, category);

        // TODO: test validations
    }
    
}