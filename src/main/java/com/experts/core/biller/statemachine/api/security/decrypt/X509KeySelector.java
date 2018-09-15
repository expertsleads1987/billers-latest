package com.experts.core.biller.statemachine.api.security.decrypt;

import javax.xml.crypto.*;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.security.Key;
import java.security.PublicKey;

public class X509KeySelector extends KeySelector {

    PublicKey key;


    public X509KeySelector(PublicKey key) {
        this.key = key;
    }

    public KeySelectorResult select(KeyInfo keyInfo,
                                    KeySelector.Purpose purpose,
                                    AlgorithmMethod method,
                                    XMLCryptoContext context) throws KeySelectorException {
        return new KeySelectorResult() {
            @Override
            public Key getKey() {
                return key;
            }
        };
    }

}