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
import org.openapitools.client.model.Customer;
import java.io.File;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineObject1;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.Redemption;
import org.openapitools.client.model.Voucher;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomersApi
 */
@Ignore
public class CustomersApiTest {

    private final CustomersApi api = new CustomersApi();

    
    /**
     * Assign vouchers to a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignVouchersToCustomerTest() throws ApiException {
        String identifier = null;
        InlineObject1 inlineObject1 = null;
        Customer response = api.assignVouchersToCustomer(identifier, inlineObject1);

        // TODO: test validations
    }
    
    /**
     * Create a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomerTest() throws ApiException {
        Customer customer = null;
        Customer response = api.createCustomer(customer);

        // TODO: test validations
    }
    
    /**
     * Delete a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws ApiException {
        String identifier = null;
        api.deleteCustomer(identifier);

        // TODO: test validations
    }
    
    /**
     * Get a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerTest() throws ApiException {
        String identifier = null;
        Customer response = api.getCustomer(identifier);

        // TODO: test validations
    }
    
    /**
     * Get redemptions performed by a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerRedemptionsTest() throws ApiException {
        String identifier = null;
        List<Redemption> response = api.getCustomerRedemptions(identifier);

        // TODO: test validations
    }
    
    /**
     * Get vouchers assigned to a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerVouchersTest() throws ApiException {
        String identifier = null;
        List<Voucher> response = api.getCustomerVouchers(identifier);

        // TODO: test validations
    }
    
    /**
     * Get all customers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomersTest() throws ApiException {
        List<Customer> response = api.getCustomers();

        // TODO: test validations
    }
    
    /**
     * Import your own customers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importCustomersTest() throws ApiException {
        File file = null;
        InlineResponse200 response = api.importCustomers(file);

        // TODO: test validations
    }
    
    /**
     * Remove (unassign) vouchers from a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeVouchersFromCustomerTest() throws ApiException {
        String identifier = null;
        InlineObject inlineObject = null;
        Customer response = api.removeVouchersFromCustomer(identifier, inlineObject);

        // TODO: test validations
    }
    
    /**
     * Update a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerTest() throws ApiException {
        String identifier = null;
        Customer customer = null;
        Customer response = api.updateCustomer(identifier, customer);

        // TODO: test validations
    }
    
}
