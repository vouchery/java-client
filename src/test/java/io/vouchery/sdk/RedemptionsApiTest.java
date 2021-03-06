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
import org.openapitools.client.model.Redemption;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RedemptionsApi
 */
@Ignore
public class RedemptionsApiTest {

    private final RedemptionsApi api = new RedemptionsApi();

    
    /**
     * Confirm a redemption
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmRedemptionTest() throws ApiException {
        String code = null;
        String transactionId = null;
        Redemption response = api.confirmRedemption(code, transactionId);

        // TODO: test validations
    }
    
    /**
     * Create a redemption
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRedemptionTest() throws ApiException {
        String code = null;
        Redemption redemption = null;
        Redemption response = api.createRedemption(code, redemption);

        // TODO: test validations
    }
    
    /**
     * Delete a redemption
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRedemptionTest() throws ApiException {
        String code = null;
        String transactionId = null;
        api.deleteRedemption(code, transactionId);

        // TODO: test validations
    }
    
    /**
     * Get a redemption
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRedemptionTest() throws ApiException {
        String code = null;
        String transactionId = null;
        Redemption response = api.getRedemption(code, transactionId);

        // TODO: test validations
    }
    
    /**
     * Get all redemptions for a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRedemptionsTest() throws ApiException {
        Integer campaignId = null;
        List<Redemption> response = api.getRedemptions(campaignId);

        // TODO: test validations
    }
    
}
