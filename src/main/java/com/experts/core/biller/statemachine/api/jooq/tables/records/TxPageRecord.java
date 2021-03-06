/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.TxPage;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TxPageRecord extends UpdatableRecordImpl<TxPageRecord> implements Record6<Long, Boolean, Boolean, Boolean, String, String> {

    private static final long serialVersionUID = 197633400;

    /**
     * Setter for <code>public.tx_page.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tx_page.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tx_page.isadminpage</code>.
     */
    public void setIsadminpage(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tx_page.isadminpage</code>.
     */
    public Boolean getIsadminpage() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>public.tx_page.isreadwriteable</code>.
     */
    public void setIsreadwriteable(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tx_page.isreadwriteable</code>.
     */
    public Boolean getIsreadwriteable() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.tx_page.isreadable</code>.
     */
    public void setIsreadable(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tx_page.isreadable</code>.
     */
    public Boolean getIsreadable() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.tx_page.page_name</code>.
     */
    public void setPageName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tx_page.page_name</code>.
     */
    public String getPageName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tx_page.page_url</code>.
     */
    public void setPageUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tx_page.page_url</code>.
     */
    public String getPageUrl() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Boolean, Boolean, Boolean, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Boolean, Boolean, Boolean, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TxPage.TX_PAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return TxPage.TX_PAGE.ISADMINPAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return TxPage.TX_PAGE.ISREADWRITEABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return TxPage.TX_PAGE.ISREADABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TxPage.TX_PAGE.PAGE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TxPage.TX_PAGE.PAGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getIsadminpage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getIsreadwriteable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getIsreadable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPageName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getIsadminpage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getIsreadwriteable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getIsreadable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPageName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxPageRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxPageRecord value2(Boolean value) {
        setIsadminpage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxPageRecord value3(Boolean value) {
        setIsreadwriteable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxPageRecord value4(Boolean value) {
        setIsreadable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxPageRecord value5(String value) {
        setPageName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxPageRecord value6(String value) {
        setPageUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxPageRecord values(Long value1, Boolean value2, Boolean value3, Boolean value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxPageRecord
     */
    public TxPageRecord() {
        super(TxPage.TX_PAGE);
    }

    /**
     * Create a detached, initialised TxPageRecord
     */
    public TxPageRecord(Long id, Boolean isadminpage, Boolean isreadwriteable, Boolean isreadable, String pageName, String pageUrl) {
        super(TxPage.TX_PAGE);

        set(0, id);
        set(1, isadminpage);
        set(2, isreadwriteable);
        set(3, isreadable);
        set(4, pageName);
        set(5, pageUrl);
    }
}
