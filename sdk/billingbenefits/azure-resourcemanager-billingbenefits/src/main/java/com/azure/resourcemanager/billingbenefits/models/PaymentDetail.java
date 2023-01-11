// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/** Information about payment related to a savings plan order. */
@Fluent
public final class PaymentDetail {
    /*
     * Date when the payment needs to be done.
     */
    @JsonProperty(value = "dueDate")
    private LocalDate dueDate;

    /*
     * Date when the transaction is completed. Is null when it is scheduled.
     */
    @JsonProperty(value = "paymentDate")
    private LocalDate paymentDate;

    /*
     * Amount in pricing currency. Tax not included.
     */
    @JsonProperty(value = "pricingCurrencyTotal")
    private Price pricingCurrencyTotal;

    /*
     * Amount charged in Billing currency. Tax not included. Is null for future payments
     */
    @JsonProperty(value = "billingCurrencyTotal")
    private Price billingCurrencyTotal;

    /*
     * Describes whether the payment is completed, failed, cancelled or scheduled in the future.
     */
    @JsonProperty(value = "status")
    private PaymentStatus status;

    /*
     * The extendedStatusInfo property.
     */
    @JsonProperty(value = "extendedStatusInfo", access = JsonProperty.Access.WRITE_ONLY)
    private ExtendedStatusInfo extendedStatusInfo;

    /*
     * Billing account
     */
    @JsonProperty(value = "billingAccount")
    private String billingAccount;

    /** Creates an instance of PaymentDetail class. */
    public PaymentDetail() {
    }

    /**
     * Get the dueDate property: Date when the payment needs to be done.
     *
     * @return the dueDate value.
     */
    public LocalDate dueDate() {
        return this.dueDate;
    }

    /**
     * Set the dueDate property: Date when the payment needs to be done.
     *
     * @param dueDate the dueDate value to set.
     * @return the PaymentDetail object itself.
     */
    public PaymentDetail withDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Get the paymentDate property: Date when the transaction is completed. Is null when it is scheduled.
     *
     * @return the paymentDate value.
     */
    public LocalDate paymentDate() {
        return this.paymentDate;
    }

    /**
     * Set the paymentDate property: Date when the transaction is completed. Is null when it is scheduled.
     *
     * @param paymentDate the paymentDate value to set.
     * @return the PaymentDetail object itself.
     */
    public PaymentDetail withPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * Get the pricingCurrencyTotal property: Amount in pricing currency. Tax not included.
     *
     * @return the pricingCurrencyTotal value.
     */
    public Price pricingCurrencyTotal() {
        return this.pricingCurrencyTotal;
    }

    /**
     * Set the pricingCurrencyTotal property: Amount in pricing currency. Tax not included.
     *
     * @param pricingCurrencyTotal the pricingCurrencyTotal value to set.
     * @return the PaymentDetail object itself.
     */
    public PaymentDetail withPricingCurrencyTotal(Price pricingCurrencyTotal) {
        this.pricingCurrencyTotal = pricingCurrencyTotal;
        return this;
    }

    /**
     * Get the billingCurrencyTotal property: Amount charged in Billing currency. Tax not included. Is null for future
     * payments.
     *
     * @return the billingCurrencyTotal value.
     */
    public Price billingCurrencyTotal() {
        return this.billingCurrencyTotal;
    }

    /**
     * Set the billingCurrencyTotal property: Amount charged in Billing currency. Tax not included. Is null for future
     * payments.
     *
     * @param billingCurrencyTotal the billingCurrencyTotal value to set.
     * @return the PaymentDetail object itself.
     */
    public PaymentDetail withBillingCurrencyTotal(Price billingCurrencyTotal) {
        this.billingCurrencyTotal = billingCurrencyTotal;
        return this;
    }

    /**
     * Get the status property: Describes whether the payment is completed, failed, cancelled or scheduled in the
     * future.
     *
     * @return the status value.
     */
    public PaymentStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Describes whether the payment is completed, failed, cancelled or scheduled in the
     * future.
     *
     * @param status the status value to set.
     * @return the PaymentDetail object itself.
     */
    public PaymentDetail withStatus(PaymentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the extendedStatusInfo property: The extendedStatusInfo property.
     *
     * @return the extendedStatusInfo value.
     */
    public ExtendedStatusInfo extendedStatusInfo() {
        return this.extendedStatusInfo;
    }

    /**
     * Get the billingAccount property: Billing account.
     *
     * @return the billingAccount value.
     */
    public String billingAccount() {
        return this.billingAccount;
    }

    /**
     * Set the billingAccount property: Billing account.
     *
     * @param billingAccount the billingAccount value to set.
     * @return the PaymentDetail object itself.
     */
    public PaymentDetail withBillingAccount(String billingAccount) {
        this.billingAccount = billingAccount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pricingCurrencyTotal() != null) {
            pricingCurrencyTotal().validate();
        }
        if (billingCurrencyTotal() != null) {
            billingCurrencyTotal().validate();
        }
        if (extendedStatusInfo() != null) {
            extendedStatusInfo().validate();
        }
    }
}
