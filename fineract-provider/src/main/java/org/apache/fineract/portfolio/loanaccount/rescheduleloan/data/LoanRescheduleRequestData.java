/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.portfolio.loanaccount.rescheduleloan.data;

import java.time.LocalDate;
import java.util.Collection;
import org.apache.fineract.infrastructure.codes.data.CodeValueData;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.portfolio.loanaccount.data.LoanTermVariationsData;

/**
 * Immutable data object representing loan reschedule request data.
 **/
public final class LoanRescheduleRequestData {

    private final Long id;
    private final Long loanId;
    private final Long clientId;
    private final String clientName;
    private final String loanAccountNumber;
    private final LoanRescheduleRequestStatusEnumData statusEnum;
    private final Integer rescheduleFromInstallment;
    private final LocalDate rescheduleFromDate;
    private final Boolean recalculateInterest;
    private final CodeValueData rescheduleReasonCodeValue;
    private final LoanRescheduleRequestTimelineData timeline;
    private final String rescheduleReasonComment;

    private Boolean changeSchedule = false;
    private Integer repayEvery;
    private EnumOptionData repaymentPeriodFrequencyType;
    private LocalDate firstDateForSemi;
    private LocalDate secondDateForSemi;

    @SuppressWarnings("unused")
    private final Collection<CodeValueData> rescheduleReasons;
    @SuppressWarnings("unused")
    private final Collection<LoanTermVariationsData> loanTermVariationsData;
    @SuppressWarnings("unused")
    private final Collection<EnumOptionData> repaymentFrequencyTypeOptions;

    /**
     * LoanRescheduleRequestData constructor
     *
     * @param loanTermVariationsData
     *            TODO
     **/
    private LoanRescheduleRequestData(Long id, Long loanId, LoanRescheduleRequestStatusEnumData statusEnum,
            Integer rescheduleFromInstallment, LocalDate rescheduleFromDate, CodeValueData rescheduleReasonCodeValue,
            String rescheduleReasonComment, LoanRescheduleRequestTimelineData timeline, final String clientName,
            final String loanAccountNumber, final Long clientId, final Boolean recalculateInterest, final Boolean changeSchedule,
            final Integer repayEvery, final EnumOptionData repaymentPeriodFrequencyType, final LocalDate firstDateForSemi,
            final LocalDate secondDateForSemi, Collection<CodeValueData> rescheduleReasons,
            final Collection<LoanTermVariationsData> loanTermVariationsData,
            final Collection<EnumOptionData> repaymentFrequencyTypeOptions) {

        this.id = id;
        this.loanId = loanId;
        this.statusEnum = statusEnum;
        this.rescheduleFromInstallment = rescheduleFromInstallment;
        this.rescheduleFromDate = rescheduleFromDate;
        this.rescheduleReasonCodeValue = rescheduleReasonCodeValue;
        this.rescheduleReasonComment = rescheduleReasonComment;
        this.timeline = timeline;
        this.clientName = clientName;
        this.loanAccountNumber = loanAccountNumber;
        this.clientId = clientId;
        this.recalculateInterest = recalculateInterest;
        this.changeSchedule = changeSchedule;
        this.repayEvery = repayEvery;
        this.repaymentPeriodFrequencyType = repaymentPeriodFrequencyType;
        this.firstDateForSemi = firstDateForSemi;
        this.secondDateForSemi = secondDateForSemi;
        this.rescheduleReasons = rescheduleReasons;
        this.loanTermVariationsData = loanTermVariationsData;
        this.repaymentFrequencyTypeOptions = repaymentFrequencyTypeOptions;
    }

    /**
     * @param loanTermVariationsData
     *            TODO
     * @return an instance of the LoanRescheduleRequestData class
     **/
    public static LoanRescheduleRequestData instance(Long id, Long loanId, LoanRescheduleRequestStatusEnumData statusEnum,
            Integer rescheduleFromInstallment, LocalDate rescheduleFromDate, CodeValueData rescheduleReasonCodeValue,
            String rescheduleReasonComment, LoanRescheduleRequestTimelineData timeline, final String clientName,
            final String loanAccountNumber, final Long clientId, final Boolean recalculateInterest, final Boolean changeSchedule,
            final Integer repayEvery, final EnumOptionData repaymentPeriodFrequencyType, final LocalDate firstDateForSemi,
            final LocalDate secondDateForSemi, Collection<CodeValueData> rescheduleReasons,
            final Collection<LoanTermVariationsData> loanTermVariationsData,
            final Collection<EnumOptionData> repaymentFrequencyTypeOptions) {

        return new LoanRescheduleRequestData(id, loanId, statusEnum, rescheduleFromInstallment, rescheduleFromDate,
                rescheduleReasonCodeValue, rescheduleReasonComment, timeline, clientName, loanAccountNumber, clientId, recalculateInterest,
                changeSchedule, repayEvery, repaymentPeriodFrequencyType, firstDateForSemi, secondDateForSemi, rescheduleReasons,
                loanTermVariationsData, repaymentFrequencyTypeOptions);
    }

    /**
     * LoanRescheduleRequestData constructor
     *
     * @param loanTermVariationsData
     *            TODO
     **/
    private LoanRescheduleRequestData(Long id, Long loanId, LoanRescheduleRequestStatusEnumData statusEnum, final String clientName,
            final String loanAccountNumber, final Long clientId, final LocalDate rescheduleFromDate,
            final CodeValueData rescheduleReasonCodeValue, final Boolean changeSchedule, final Integer repayEvery,
            final EnumOptionData repaymentPeriodFrequencyType, final LocalDate firstDateForSemi, final LocalDate secondDateForSemi) {

        this.id = id;
        this.loanId = loanId;
        this.statusEnum = statusEnum;
        this.clientName = clientName;
        this.loanAccountNumber = loanAccountNumber;
        this.clientId = clientId;
        this.rescheduleFromDate = rescheduleFromDate;
        this.rescheduleReasonCodeValue = rescheduleReasonCodeValue;
        this.changeSchedule = changeSchedule;
        this.repayEvery = repayEvery;
        this.repaymentPeriodFrequencyType = repaymentPeriodFrequencyType;
        this.firstDateForSemi = firstDateForSemi;
        this.secondDateForSemi = secondDateForSemi;
        this.rescheduleFromInstallment = null;
        this.rescheduleReasonComment = null;
        this.timeline = null;
        this.recalculateInterest = null;
        this.rescheduleReasons = null;
        this.loanTermVariationsData = null;
        this.repaymentFrequencyTypeOptions = null;
    }

    /**
     * @return an instance of the LoanRescheduleRequestData class
     **/
    public static LoanRescheduleRequestData instance(Long id, Long loanId, LoanRescheduleRequestStatusEnumData statusEnum,
            final String clientName, final String loanAccountNumber, final Long clientId, final LocalDate rescheduleFromDate,
            final CodeValueData rescheduleReasonCodeValue, final Boolean changeSchedule, final Integer repayEvery,
            final EnumOptionData repaymentPeriodFrequencyType, final LocalDate firstDateForSemi, final LocalDate secondDateForSemi) {

        return new LoanRescheduleRequestData(id, loanId, statusEnum, clientName, loanAccountNumber, clientId, rescheduleFromDate,
                rescheduleReasonCodeValue, changeSchedule, repayEvery, repaymentPeriodFrequencyType, firstDateForSemi, secondDateForSemi);
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the loanId
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * @return the statusEnum
     */
    public LoanRescheduleRequestStatusEnumData getStatusEnum() {
        return statusEnum;
    }

    /**
     * @return the reschedule from installment number
     */
    public Integer getRescheduleFromInstallment() {
        return rescheduleFromInstallment;
    }

    /**
     * @return the reschedule from date
     */
    public LocalDate getRescheduleFromDate() {
        return rescheduleFromDate;
    }

    /**
     * @return the rescheduleReasonCodeValueId
     */
    public CodeValueData getRescheduleReasonCodeValueId() {
        return rescheduleReasonCodeValue;
    }

    /**
     * @return the rescheduleReasonText
     */
    public String getRescheduleReasonComment() {
        return rescheduleReasonComment;
    }

    /**
     * @return the timeline
     **/
    public LoanRescheduleRequestTimelineData getTimeline() {
        return this.timeline;
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @return the loanAccountNumber
     */
    public String getLoanAccountNumber() {
        return loanAccountNumber;
    }

    /**
     * @return the clientId
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * @return the recalculateInterest
     */
    public Boolean getRecalculateInterest() {
        boolean value = false;

        if (recalculateInterest != null) {
            value = recalculateInterest;
        }

        return value;
    }
}
