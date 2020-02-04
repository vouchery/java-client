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
import org.openapitools.client.model.Batch;
import java.io.File;
import org.openapitools.client.model.InlineObject4;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.Voucher;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VouchersApi
 */
@Ignore
public class VouchersApiTest {

    private final VouchersApi api = new VouchersApi();

    
    /**
     * Batch create vouchers
     *
     *  &lt;p&gt;Generate a batch of unique vouchers. Each voucher will be created using &lt;code&gt;{prefix}-{random code}&lt;/code&gt; format where code will be a random string of requested type and length. &lt;strong&gt;A prefix needs to be unique within a project.&lt;/strong&gt;&lt;/p&gt; &lt;p&gt; Following code types are supported: &lt;ul&gt; &lt;li&gt;digits&lt;/li&gt; &lt;li&gt;letters&lt;/li&gt; &lt;li&gt;mixed (digits and letters)&lt;/li&gt; &lt;/ul&gt; &lt;/p&gt; &lt;p&gt;Allowed characters for each code type have been filtered to avoid typing mistakes. Maximum number of codes possible to generate in one batch request is 50 000.&lt;/p&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchGenerateVouchersTest() throws ApiException {
        Integer id = null;
        Batch batch = null;
        List<Voucher> response = api.batchGenerateVouchers(id, batch);

        // TODO: test validations
    }
    
    /**
     * Create a voucher
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVoucherTest() throws ApiException {
        Integer campaignId = null;
        Voucher voucher = null;
        Voucher response = api.createVoucher(campaignId, voucher);

        // TODO: test validations
    }
    
    /**
     * Delete a voucher
     *
     * Delete a single voucher. Vouchers with at least one confirmed redemption can not be deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVoucherTest() throws ApiException {
        String code = null;
        api.deleteVoucher(code);

        // TODO: test validations
    }
    
    /**
     * Expire a list of vouchers
     *
     * Given a list of voucher codes, change their status to expired, unless they have been redeemed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expireVouchersTest() throws ApiException {
        InlineObject4 inlineObject4 = null;
        api.expireVouchers(inlineObject4);

        // TODO: test validations
    }
    
    /**
     * Find a voucher by campaign metadata
     *
     * &lt;p&gt;Find voucher by campaign metadata.&lt;/p&gt; &lt;p&gt;   Optionally assign found voucher to a customer by passing customer_identifier param.   All vouchers for a customer can be fetched at &lt;a href&#x3D;\&quot;#get_customers-identifier-vouchers\&quot;&gt;/customers/{id}/vouchers&lt;/a&gt;. &lt;/p&gt; &lt;p&gt;If no voucher is available this endpoint will return an empty response and HTTP code &lt;code&gt;204 No content&lt;/code&gt;&lt;/p&gt; &lt;p&gt;At least one metadata must be provided, otherwise no voucher will be returned.&lt;/p&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findVoucherTest() throws ApiException {
        List<String> medium = null;
        List<String> purpose = null;
        List<String> team = null;
        List<String> channel = null;
        String customerIdentifier = null;
        Voucher response = api.findVoucher(medium, purpose, team, channel, customerIdentifier);

        // TODO: test validations
    }
    
    /**
     * Get a voucher
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVoucherTest() throws ApiException {
        String code = null;
        Voucher response = api.getVoucher(code);

        // TODO: test validations
    }
    
    /**
     * Get all vouchers for a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVouchersTest() throws ApiException {
        Integer campaignId = null;
        List<Voucher> response = api.getVouchers(campaignId);

        // TODO: test validations
    }
    
    /**
     * Import your own vouchers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importVouchersTest() throws ApiException {
        Integer id = null;
        File file = null;
        InlineResponse200 response = api.importVouchers(id, file);

        // TODO: test validations
    }
    
    /**
     * Update a voucher
     *
     * Only voucher status can be updated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVoucherTest() throws ApiException {
        String code = null;
        Voucher voucher = null;
        Voucher response = api.updateVoucher(code, voucher);

        // TODO: test validations
    }
    
}