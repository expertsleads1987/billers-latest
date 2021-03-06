/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.TxUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class TxUserRecord extends UpdatableRecordImpl<TxUserRecord> implements Record11<Long, String, Boolean, Boolean, Boolean, String, Boolean, String, Boolean, String, String> {

    private static final long serialVersionUID = 695388011;

    /**
     * Setter for <code>public.tx_user.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tx_user.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tx_user.access_token</code>.
     */
    public void setAccessToken(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tx_user.access_token</code>.
     */
    public String getAccessToken() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tx_user.account_non_expired</code>.
     */
    public void setAccountNonExpired(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tx_user.account_non_expired</code>.
     */
    public Boolean getAccountNonExpired() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.tx_user.account_non_lockedd</code>.
     */
    public void setAccountNonLockedd(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tx_user.account_non_lockedd</code>.
     */
    public Boolean getAccountNonLockedd() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.tx_user.credential_non_expired</code>.
     */
    public void setCredentialNonExpired(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tx_user.credential_non_expired</code>.
     */
    public Boolean getCredentialNonExpired() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.tx_user.email</code>.
     */
    public void setEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tx_user.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.tx_user.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tx_user.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.tx_user.password</code>.
     */
    public void setPassword(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tx_user.password</code>.
     */
    public String getPassword() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.tx_user.svn_access</code>.
     */
    public void setSvnAccess(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tx_user.svn_access</code>.
     */
    public Boolean getSvnAccess() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.tx_user.time_zone</code>.
     */
    public void setTimeZone(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.tx_user.time_zone</code>.
     */
    public String getTimeZone() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.tx_user.username</code>.
     */
    public void setUsername(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.tx_user.username</code>.
     */
    public String getUsername() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, Boolean, Boolean, Boolean, String, Boolean, String, Boolean, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, Boolean, Boolean, Boolean, String, Boolean, String, Boolean, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TxUser.TX_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TxUser.TX_USER.ACCESS_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return TxUser.TX_USER.ACCOUNT_NON_EXPIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return TxUser.TX_USER.ACCOUNT_NON_LOCKEDD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return TxUser.TX_USER.CREDENTIAL_NON_EXPIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TxUser.TX_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return TxUser.TX_USER.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TxUser.TX_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return TxUser.TX_USER.SVN_ACCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TxUser.TX_USER.TIME_ZONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TxUser.TX_USER.USERNAME;
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
    public String component2() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getAccountNonExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getAccountNonLockedd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getCredentialNonExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getSvnAccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getTimeZone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getUsername();
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
    public String value2() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getAccountNonExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getAccountNonLockedd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getCredentialNonExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getSvnAccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTimeZone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value2(String value) {
        setAccessToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value3(Boolean value) {
        setAccountNonExpired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value4(Boolean value) {
        setAccountNonLockedd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value5(Boolean value) {
        setCredentialNonExpired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value6(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value7(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value8(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value9(Boolean value) {
        setSvnAccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value10(String value) {
        setTimeZone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord value11(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxUserRecord values(Long value1, String value2, Boolean value3, Boolean value4, Boolean value5, String value6, Boolean value7, String value8, Boolean value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxUserRecord
     */
    public TxUserRecord() {
        super(TxUser.TX_USER);
    }

    /**
     * Create a detached, initialised TxUserRecord
     */
    public TxUserRecord(Long id, String accessToken, Boolean accountNonExpired, Boolean accountNonLockedd, Boolean credentialNonExpired, String email, Boolean enabled, String password, Boolean svnAccess, String timeZone, String username) {
        super(TxUser.TX_USER);

        set(0, id);
        set(1, accessToken);
        set(2, accountNonExpired);
        set(3, accountNonLockedd);
        set(4, credentialNonExpired);
        set(5, email);
        set(6, enabled);
        set(7, password);
        set(8, svnAccess);
        set(9, timeZone);
        set(10, username);
    }
}
